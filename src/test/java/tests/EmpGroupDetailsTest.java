package tests;
import org.testng.annotations.Test;
import com.utility.ExcelLib;
import pages.CatsMenu;
import pages.CensusScreen;
import pages.EmployerSettingPage;
import pages.AgentsAssignment;
import pages.CATSLoginPage;
import pages.EmpGroupQuotes;
import pages.GroupDetails;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;



public class EmpGroupDetailsTest extends ExcelLib {
	WebDriver browserObject ;
	CATSLoginPage CATSLOGIN;
	CatsMenu CMenu ;
	EmpGroupQuotes EGQuotes;
	GroupDetails GrDetails;
	AgentsAssignment AgAssign;

	@BeforeMethod
	  public void beforeClass() {
		  
		 System.setProperty("webdriver.chrome.driver", "D:\\Local\\git\\CatsAuto\\chromedriver.exe");
		// DesiredCapabilities dc = new DesiredCapabilities();
		// dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		// browserObject = new ChromeDriver(dc);
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();			
		 CATSLOGIN = new CATSLoginPage(browserObject);
		 CATSLOGIN.NavigatetoURL();
		 
	  }
	
	  @Test(dataProvider = "GroupDetails")
	  public void AddgroupDetails(String username,String password,String CustName,String Address1,String Address2,String Zipcode,String PayrollNum,String SICcode,String SelectChk,String Flag) throws InterruptedException, IOException{

		  CATSLOGIN = new CATSLoginPage(browserObject);
		  CMenu = new CatsMenu(browserObject);
		  EGQuotes = new EmpGroupQuotes(browserObject);
		  AgAssign=new AgentsAssignment(browserObject);
		  GrDetails=new GroupDetails(browserObject);
		  CATSLOGIN.Login(username , password);	
		  CMenu.createNewGroupQuote();
		  AgAssign.GroupAgentAssignment();
		  GrDetails.Addgroupdetails(CustName,Address1,Address2,Zipcode,PayrollNum,SICcode,SelectChk,Flag);
		  
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
