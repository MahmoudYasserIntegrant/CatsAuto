package tests;

import org.testng.annotations.Test;


import com.utility.ExcelLib;


import pages.CatsMenu;
import pages.CensusScreen;
import pages.EmployerSettingPage;
import pages.GroupEnrollmentScreen;
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


public class GroupEnrollmentTest extends ExcelLib {

	WebDriver browserObject ;
	CATSLoginPage CATSLOGIN;
	CatsMenu CMenu ;
	CensusScreen Census;
	GroupEnrollmentScreen GREnroll ;


	@BeforeMethod
	  public void beforeClass() {
		  
		 System.setProperty("webdriver.chrome.driver", "D:\\git\\chromedriver.exe");
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();			
		 CATSLOGIN = new CATSLoginPage(browserObject);
		 CATSLOGIN.NavigatetoURL();
		 
	  }
	
	  
 
	  @Test(dataProvider = "GroupEnrollment")
	  public void CheckEmployer_Group_Enrollment(String username,String password,String GroupNum,
			  String DentalCov,String VisionCov,String BasicLifeCov,String VolCov,String STDCov)
	  {

		  CATSLOGIN = new CATSLoginPage(browserObject);
		  CMenu = new CatsMenu(browserObject);
		  GREnroll = new GroupEnrollmentScreen(browserObject);

		  
		  CATSLOGIN.Login(username , password);	
		  CMenu.NavigatetoGroupEnrollment(GroupNum);
		  GREnroll.selectcov( DentalCov,VisionCov,BasicLifeCov,VolCov,STDCov);

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
