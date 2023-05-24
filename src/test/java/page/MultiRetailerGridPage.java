package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
* @author shaik
*
*/
   public class MultiRetailerGridPage {
	   
	//Initilization
	 @FindBy(xpath = "(//div[@class='customCol false']//img[@alt='heart'])[1]") private WebElement firstHeart;
	 
	 @FindBy(xpath = "//div[@class='listing_productImage__dR7Sj']/span/img") 
		private WebElement first_Product;
	 
	 @FindBy(xpath = "//button[.='View More']")
	    private WebElement viewMoreBtn;
	 
	 @FindBy(xpath = "//button[.='Add to Bag']")
	    private WebElement AddtoBagBtn ;
	
	 @FindBy(xpath = "//*[@id=\"__next\"]//div[@class = 'listing_listingCardInfo__5JhvL']/h3")
	    private WebElement gridProduct_name;
	 
	 @FindBy(xpath = "//div[@class='modal-content RegisterLogin_removePadding__jhYc2 RegisterLogin_modalContent__72Mzt']//button[@class='close']") 
	    private WebElement popUpCloseBtn;
	 
	public MultiRetailerGridPage(WebDriver driver) {
	
	      PageFactory.initElements(driver, this);
     }
	
//Moving to fist product
		public WebElement getFirst_Product(WebDriver driver) throws Throwable {
			
			Actions actions = new Actions(driver);
			actions.moveToElement(first_Product).perform();  
			Thread.sleep(2000);
			return first_Product;
		}
		
//Getting first product name	 
		 public String getGridProduct_name() {
			String grid_Prod_Name = gridProduct_name.getText();
			System.out.println("The first product in the grid page and added to cart is : "+grid_Prod_Name);
			return grid_Prod_Name;
		}
//Return wishlist element
     public WebElement addWishlist() {
	
      	return firstHeart;
	}
//Clicking view more button from grid page for the first product     
     public WebElement getViewMoreBtn() {
    	 
    	viewMoreBtn.click();
 		return viewMoreBtn;
 	}
//Clicking Add to bag button from the grid page for the first product
 	public WebElement clickAddtoBagBtn() throws Throwable {
 		
 		AddtoBagBtn.click();
 		Thread.sleep(2000);
		return AddtoBagBtn;
	}
//Clicking on Wishlist icon from grid page for the first product
     public void ClickOnWishListIcon()
      {
    	 firstHeart.click(); 
      }

	 
//Clicking close button from Signup pop-up
	 public void popUpCloseButton() {
		 popUpCloseBtn.click();
	 }
     
}