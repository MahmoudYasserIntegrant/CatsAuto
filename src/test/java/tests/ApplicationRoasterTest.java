package tests;
import org.testng.annotations.Test;
import com.utility.ExcelLib;
import pages.*;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertTrue;

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
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ApplicationRoasterTest extends ExcelLib{
	WebDriver browserObject ;
	CATSLoginPage CATSLOGIN;
	CatsMenu CMenu ;
	EmpGroupQuotes EGQuotes;
	GroupRoasterPage GrpRost;
	

	@BeforeMethod
	  public void beforeClass() {
		  
		 System.setProperty("webdriver.chrome.driver", "D:\\Git\\chromedriver.exe");
		// DesiredCapabilities dc = new DesiredCapabilities();
		// dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		// browserObject = new ChromeDriver(dc);
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();			
		 CATSLOGIN = new CATSLoginPage(browserObject);
		 CATSLOGIN.NavigatetoURL();
		 
	  }
	
	  @Test(dataProvider = "GroupRoaster")
	  public void CompleteApplicationOnline(String username , String password , String CustomerNum,String CompleteOnline,String SubmitCompleteApplications,String Agent_Chk,String Emp_Grp,String Grp_Email,String denFlag,String blFlag,String stdFlag,String visFlag,String vlFlag,String dvFlag,String path ,String empPath) throws InterruptedException{

		  CATSLOGIN = new CATSLoginPage(browserObject);
		  CMenu = new CatsMenu(browserObject);
		  EGQuotes = new EmpGroupQuotes(browserObject);
		  CATSLOGIN.Login(username , password);	
		  CMenu.NavigatetoGroupEnrollment(CustomerNum);
		  GrpRost = new GroupRoasterPage(browserObject);
		 GrpRost.CompleteApplicationOnline(CompleteOnline, SubmitCompleteApplications, Agent_Chk, Emp_Grp,Grp_Email,denFlag,blFlag,stdFlag,visFlag,vlFlag,dvFlag,path,empPath);
		//  Assert.assertEquals(true, Result);
	
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
			*/
		//browserObject.close();
	  }

}
