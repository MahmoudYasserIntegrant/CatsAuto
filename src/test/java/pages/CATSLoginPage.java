package pages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import com.utility.EmployerSettingLocators;
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

	public void Login(String Username , String Password)
	{
		browserObject.findElement(Usernamepath).sendKeys(Username);
		browserObject.findElement(Passwordpath).sendKeys(Password);
		browserObject.findElement(Passwordpath).sendKeys(Keys.ENTER);
	}
	

}
