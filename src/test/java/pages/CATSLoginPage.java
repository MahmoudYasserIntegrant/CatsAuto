package pages;





import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.LoginPageLocators;


public class CATSLoginPage extends LoginPageLocators{
	
	
	public CATSLoginPage(WebDriver browserObject)
	{
		this.browserObject = browserObject;
	}
	
	public void NavigatetoURL()
	{
		browserObject.navigate().to(URL);
	}

	public void Login(String Username , String Password )
	{
		browserObject.findElement(Usernamepath).sendKeys(Username);
		
		browserObject.findElement(Passwordpath).sendKeys(Password);
		browserObject.findElement(Passwordpath).sendKeys(Keys.ENTER);
	}
	
	

}
