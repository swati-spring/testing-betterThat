package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
* @author Jisha Jayaram
*
*/
public class AddtoBagePage {
	
	@FindBy(xpath="//button[@class='multi_btnCustom__iFH_4']") 
	private WebElement ATBPopUpBtn;

	public AddtoBagePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement clickATBPopUpBtn() {
		ATBPopUpBtn.click();
		return ATBPopUpBtn;
	}
	
	

}
