package tests;

import org.testng.annotations.Test;


import com.utility.ExcelLib;


import pages.CatsMenu;
import pages.CATSLoginPage;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import org.testng.annotations.AfterMethod;


public class AgentSettingsTest extends ExcelLib {

	WebDriver browserObject ;
	CATSLoginPage CATSLOGIN;
	CatsMenu CMenu ;
	

	@BeforeMethod
	  public void beforeClass() {
		  
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();			
		 CATSLOGIN = new CATSLoginPage(browserObject);
		 CATSLOGIN.NavigatetoURL();
		 
	  }
	
	  
 
	  @Test(dataProvider = "CATSLogin")
	  public void CheckAgentSetting(String username , String password , String CustomerNum){

		  CATSLOGIN = new CATSLoginPage(browserObject);
		  CATSLOGIN.Login(username , password);	  	  
		  CMenu = new CatsMenu(browserObject);
		  CMenu.NavigateToSoldGroups();
		  CMenu.NavigateToEmployerSettingsScreen(CustomerNum);
		   
	  }


	
	  @AfterMethod
	  public void afterClass() {
	       DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy h-m-s");
	        Date date = new Date();
			File source = ((TakesScreenshot)browserObject).getScreenshotAs(OutputType.FILE);
			
			try {
				FileHandler.copy(source, new File("C:\\Hossam\\Automation\\screenshots\\"+dateFormat.format(date)+".png")); 
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//browserObject.close();
	  }
	  
	 
}
