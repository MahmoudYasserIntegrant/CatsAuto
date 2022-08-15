package tests;

import org.testng.annotations.Test;


import com.utility.ExcelLib;


import pages.CatsMenu;
import pages.CensusScreen;
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


public class CensusTest extends ExcelLib {

	WebDriver browserObject ;
	CATSLoginPage CATSLOGIN;
	CatsMenu CMenu ;
	CensusScreen Census;


	@BeforeMethod
	  public void beforeClass() {
		  
		 System.setProperty("webdriver.chrome.driver", "D:\\Local\\Git\\CatsAuto\\chromedriver.exe");
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();			
		 CATSLOGIN = new CATSLoginPage(browserObject);
		 CATSLOGIN.NavigatetoURL();
		 
	  }
	
	  
 
	  @Test(dataProvider = "Census")
	  public void CheckAgentSetting(String username , String password ,String QuoteGroupNum ,
			  String VisCell1 , String VisCell2 , String VisCell3 , String VisCell4 ,
			  String DenCell1 , String DenCell2 , String DenCell3 , String DenCell4,
			  String LBasCell1 ,String LBasCell2,String LBasCell3 ,String LBasCell4,
			  String LVolCell1 ,String LVolCell2,String LVolCell3 ,String LVolCell4,
			  String STDCell1 ,String STDCell2,String STDCell3 ,String STDCell4,
			  String LTDCell1 ,String LTDCell2,String LTDCell3 ,String LTDCell4,
			  String ADDCell1 ,String ADDCell2,String ADDCell3 ,String ADDCell4)
	  {

		  CATSLOGIN = new CATSLoginPage(browserObject);
		  CMenu = new CatsMenu(browserObject);
		  Census = new CensusScreen(browserObject);

		  
		  CATSLOGIN.Login(username , password);	
		  CMenu.NavigatetoCensusScreen(QuoteGroupNum);
		  Census.CoverageCountNums(VisCell1,VisCell2,VisCell3,VisCell4 ,
				  DenCell1 ,DenCell2 ,DenCell3 ,DenCell4 ,LBasCell1 , LBasCell2, LBasCell3 , LBasCell4 ,
				   LVolCell1 , LVolCell2, LVolCell3 , LVolCell4 ,
				   STDCell1 , STDCell2, STDCell3 , STDCell4,
				   LTDCell1 , LTDCell2, LTDCell3 , LTDCell4,
				   ADDCell1 , ADDCell2, ADDCell3 , ADDCell4);
	  }


	
	  @AfterMethod
	  public void afterClass() {
	      /* DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy h-m-s");
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
		//browserObject.close();*/
	  }
	  
	 
}
