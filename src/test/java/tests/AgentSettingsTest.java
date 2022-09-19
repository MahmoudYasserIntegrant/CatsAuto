package tests;

import org.testng.annotations.Test;


import com.utility.ExcelLib;


import pages.CatsMenu;
import pages.EmployerSettingPage;
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
	EmployerSettingPage EmpSettings ;

	@BeforeMethod
	  public void beforeClass() {
		  
		 System.setProperty("webdriver.chrome.driver", "D:\\Git\\chromedriver.exe");
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();			
		 CATSLOGIN = new CATSLoginPage(browserObject);
		 CATSLOGIN.NavigatetoURL();
		 
	  }
	
	  
 
	  @Test(dataProvider = "CATSLogin")
	  public void CheckAgentSetting(String username , String password , String CustomerNum , String SendLettersbyMail ,
			  String SendInvoicesByMail , String OptOutEmailNotification , String ACHSelection , String BankRoutionNumber,
			  String BankAccountNum , String ReenterBankAccountNum , String BankAccountType , String IAuthorize	,String CalendarDay ){

		  CATSLOGIN = new CATSLoginPage(browserObject);
		  CMenu = new CatsMenu(browserObject);
		  EmpSettings = new EmployerSettingPage(browserObject);
		  
		  CATSLOGIN.Login(username , password);	
		  CMenu.NavigateToSoldGroups();
		  CMenu.NavigateToEmployerSettingsScreen(CustomerNum);
		  EmpSettings.SendLetters(SendLettersbyMail);
		  EmpSettings.SendInvoices(SendInvoicesByMail);
		  EmpSettings.SelectOptOut(OptOutEmailNotification);
		  EmpSettings.SelectElectronicPayment(ACHSelection,BankRoutionNumber,BankAccountNum ,
				  ReenterBankAccountNum , BankAccountType , IAuthorize , CalendarDay );
	  }


	
	  @AfterMethod
	  public void afterClass() {
	       DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy h-m-s");
	        Date date = new Date();
			File source = ((TakesScreenshot)browserObject).getScreenshotAs(OutputType.FILE);
			
			try {
				FileHandler.copy(source, new File("D:\\CATSDemo\\"+dateFormat.format(date)+".png")); 
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
