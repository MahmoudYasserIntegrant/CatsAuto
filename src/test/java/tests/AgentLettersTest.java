package tests;

import org.testng.annotations.Test;
import com.utility.ExcelLib;
import pages.CatsMenu;
import pages.AgentLettersPage;
import pages.CATSLoginPage;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;


public class AgentLettersTest extends ExcelLib  {
	WebDriver browserObject ;
	CATSLoginPage CATSLOGIN;
	CatsMenu CMenu ;
	AgentLettersPage AgLetters;

	@BeforeMethod
	  public void beforeClass() {
		  
		 System.setProperty("webdriver.chrome.driver", "D:\\Git\\CatsAuto\\chromedriver.exe");
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();			
		 CATSLOGIN = new CATSLoginPage(browserObject);
		 CATSLOGIN.NavigatetoURL();
		
	}
		 
	 @Test(dataProvider = "AgentLogin")
	  public void navigatetoAgentLetters(String username , String password , String LetterName)
	  {
		  CATSLOGIN = new CATSLoginPage(browserObject);
		  CMenu = new CatsMenu(browserObject);
		  AgLetters= new AgentLettersPage(browserObject);
		//  AgLetters = new EmployerSettingPage(browserObject);
		  CATSLOGIN.Login(username , password);	
		  CMenu.NavigateToAgentLetters();
		  AgLetters.downloadAgentLetter(LetterName);
		  
	 }
	 
	 
		  @AfterMethod
		  public void afterClass() {
			  
		       DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy h-m-s");
		        Date date = new Date();
				File source = ((TakesScreenshot)browserObject).getScreenshotAs(OutputType.FILE);
				
		/*		try {
					FileHandler.copy(source, new File("D:\Git\CatsAuto\\"+dateFormat.format(date)+".png")); 
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			//browserObject.quit();
		  }

}
