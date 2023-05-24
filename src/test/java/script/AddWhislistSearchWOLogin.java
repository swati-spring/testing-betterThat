
package script;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import generic.CommonBaseTest;
import io.reactivex.rxjava3.functions.Action;
import page.BtHomepage;
import page.MultiRetailerGridPage;

/**
* @author Zabi
*
*/

public class AddWhislistSearchWOLogin extends CommonBaseTest {
@Test
    public void AddProduct() throws Throwable {
	
	BtHomepage bhp = new BtHomepage(driver);
	MultiRetailerGridPage mrp = new MultiRetailerGridPage(driver);
	bhp.PassValue();

	//Thread.sleep(5000);
	//wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	String CurrentPageTitle = driver.getTitle();
	System.out.println(CurrentPageTitle);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	wait.until(ExpectedConditions.titleContains(CurrentPageTitle));
	//driver.findElements(By.xpath("//div[@class='customCol false']"));
	Thread.sleep(10000);
	mrp.ClickOnWishListIcon();
	Thread.sleep(5000);
	WebElement closebtn = driver.findElement(By.xpath("//div[@class='modal-content RegisterLogin_removePadding__jhYc2 RegisterLogin_modalContent__72Mzt']//button[@class='close']"));
	closebtn.click();
	Thread.sleep(5000);
	Actions action = new Actions(driver);
	WebElement icon = driver.findElement(By.xpath("//img[@src='/img/heart-icon-res.png']"));
	action.moveToElement(icon).perform();
	Thread.sleep(10000);
	action.contextClick(icon).perform();
	}
}

