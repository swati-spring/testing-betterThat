package script;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic.CommonBaseTest;
import page.AddtoBagePage;
import page.BtHomepage;
import page.CheckoutPage;
import page.MultiRetailerGridPage;

/**
* @author Jisha Jayaram
*
*/

public class SearchAddCartWithOutLogin extends CommonBaseTest{
	@Test(priority = 7)
	 public void AddProduct() throws Throwable {
		 try {
			BtHomepage bhp = new BtHomepage(driver);
			MultiRetailerGridPage mrp = new MultiRetailerGridPage(driver);
			AddtoBagePage atb = new AddtoBagePage(driver);
			CheckoutPage cp = new CheckoutPage(driver);
			boolean cartCount;
			bhp.PassValue();		

//			String CurrentPageTitle = driver.getTitle();
//			System.out.println("Page:  "+CurrentPageTitle+"   Opened");
//			String url = driver.getCurrentUrl();
//			System.out.println("The page url is : "+url);
			
			String gridproduct = mrp.getGridProduct_name();
            extentTest.log(Status.INFO, "The product name picked from Grid page is: "+gridproduct);
			
			Thread.sleep(3000);			
			mrp.popUpCloseButton();
			WebElement pn = mrp.getFirst_Product(driver);		
			mrp.clickAddtoBagBtn();
			Thread.sleep(1000);
			atb.clickATBPopUpBtn();
			//System.out.println("Item added to cart successfully");
			Thread.sleep(3000);
			//extentTest.log(Status.PASS, "Test pass: Item added to cart successfully");
			
			cartCount = bhp.getCartImgNum();
			if(cartCount) {
				extentTest.log(Status.INFO, "Test Pass: Bag icon count on top is one");
			}
			else
			{
				extentTest.log(Status.FAIL, "Test Fail: There is a mismatch observed in the bagicon number");
			}
			bhp.clickCartImg();
			String cpn = cp.getCheckoutProdName();
			extentTest.log(Status.INFO, "The product added to cart is: "+cpn);
			
			if (gridproduct.equals(gridproduct)) {
	//			System.out.println("Strings are equal");
				extentTest.log(Status.INFO, "The Item added to cart successfully");
				
				String cpLogintxt = cp.getLoginBtn();
				
				if (cpLogintxt.equals("Login"))
				{
					extentTest.log(Status.INFO, "The user is not logged in and product is added to cart");
				}
				else
				{
					extentTest.log(Status.FAIL, "Login buggon is not displaying for a logged out user who added product into the checkoutpage");
				}
			} else {
	//			System.out.println("Strings are NOT equal");
				extentTest.log(Status.FAIL, "The selected item is not added to cart properly");
			}
			
			
			
			//ExtentManager.getTest().log(Status.valueOf(element)
			//extentTest.log(Status.INFO, "The  ")
		 }
		 catch(Exception e)
		 {
			 System.out.println("Oh.. No..  Caught with some error");
		 }
 }

}
