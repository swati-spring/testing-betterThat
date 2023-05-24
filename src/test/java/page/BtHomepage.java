package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


/**
* @author Jisha Jayaram
*
*/
public class BtHomepage {

	@FindBy(xpath="//*[@id=\"top-header\"]//span[@class='Header_userNameClass__nl8jn']") 
	private WebElement My_Account;

	@FindBy(xpath="//input[@class=\"Header_searchInpt__fss7F\"]") private WebElement SearchTextField;

	@FindBy(xpath = "//button[contains(text(),\"Show all results\")]") private WebElement ShowAllResultBtn;

	@FindBy(xpath = "//img[@src='/img/heart-icon-res.png']") private WebElement WishlistIconBtn;

	@FindBy(xpath="//span[text()='SIGN OUT']") 
	private WebElement Logout;
	
	@FindBy(xpath="//span[@class='Header_shopingCart__ruMS3']")
	private WebElement cartImgNum;

	public BtHomepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	public WebElement getMy_Account() {
		return My_Account;
	}

	public WebElement getSearchTextField() {
		return SearchTextField;
	}

	public WebElement getShowAllResultBtn() {
		return ShowAllResultBtn;
	}

	public WebElement getWishlistIconBtn() {
		return WishlistIconBtn;
	}

	public WebElement getLogout() {
		return Logout;
	}
	
	public boolean getCartImgNum() {
		String cartCount = cartImgNum.getText();	
		System.out.println("The number of product added to cart = "+cartCount);
		if(cartCount.equals("1")) {
			   return true;
		}
		else
		{
        		return false;
		}
	}
	
	public void clickCartImg() throws Throwable {
		cartImgNum.click();
		Thread.sleep(2000);
	}

	public boolean VerifyMyAccount() {

		String myaccttxt = My_Account.getText();
		System.out.println("myaccttxt = "+ myaccttxt);
		if(myaccttxt.equals("MY ACCOUNT")) 
		{
			System.out.println("myaccttxt"+ myaccttxt+"displaying properly.");
			return true;
		}
		else
		{
			System.err.println("Recheck the entered details on sign up page again: SIGNUP FAILED DUE TO INVALID DATA ENTRY");
			return false;

		}
	}
	
	public void myAccount_Mouseover()
	{
		My_Account.click();
	}

	public void logoutClick()
	{
		Logout.click();
		System.out.println("Singout button clicked");

	}

	public void PassValue() throws Throwable {

		SearchTextField.clear();
		SearchTextField.sendKeys("Toys");
		Thread.sleep(1000);
		SearchTextField.click();
		ShowAllResultBtn.click();
		}

	public void WishList() {
	    WishlistIconBtn.click();
	    }
	
}

