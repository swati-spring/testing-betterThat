package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	
	/**
	* @author Jisha Jayaram
	*
	*/

	@FindBy(xpath="//div[@class = 'checkout_bagsItemInfo__QjBWR']/span[2]") 
	private WebElement checkoutProdName;
	
	@FindBy(xpath="//button[.='Login']")
	private WebElement LoginBtn;
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	public String getCheckoutProdName() {
		String checkout_Prod_Name = checkoutProdName.getText();
		//System.out.println("The product which is added to cart is : "+checkout_Prod_Name);
		return checkout_Prod_Name;
	}
	
	public String getLoginBtn() {
		String Logintxt = LoginBtn.getText();
//		System.out.println("............."+Logintxt);
		return Logintxt;
	}


}
