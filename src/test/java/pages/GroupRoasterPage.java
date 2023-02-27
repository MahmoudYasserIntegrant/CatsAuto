package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.utility.GroupRoasterLocators;



public class GroupRoasterPage extends GroupRoasterLocators {
	WebDriver browserObject ;
	CATSLoginPage CATSLOGIN;
	CatsMenu CMenu ;
	FluentWait Flwait;
	WebDriverWait wait;
	Actions action;
	WebElement employerUpload_btn;
	WebElement empupload_btn;
	WebElement empChoose_btn;
	WebElement chooseBtn;
	public GroupRoasterPage(WebDriver browserObject) {
		this.browserObject = browserObject;
	}

	@SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
	public void CompleteApplicationOnline(String completeOnline, String SubmitCompleteApplications,String Agent_Chk,String Emp_Grp,String Grp_Email,String denFlag,String blFlag,String stdFlag,String visFlag,String vlFlag,String dvFlag,String path,String empPath) throws InterruptedException{
			
		WebDriverWait wait = new WebDriverWait(browserObject, 100);
		browserObject.findElement(AppRoasterBtn).click();
		 wait.until(ExpectedConditions.textToBePresentInElementLocated(AppRoasterBtn,"Applications/Roster"));
	//	Thread.sleep(1000);
		 if (completeOnline.equalsIgnoreCase("1"))
		 {
		 FluentWait Flwait = new FluentWait(browserObject);
		 Flwait.withTimeout(5000, TimeUnit.MILLISECONDS);
		 Flwait.pollingEvery(500, TimeUnit.MILLISECONDS);
		 Flwait.ignoring(NoSuchElementException.class);
		 Flwait.until(ExpectedConditions.elementToBeClickable(CompOnlineRadioBtn));
		 browserObject.findElement(CompOnlineRadioBtn).click();
		 
		 	if(Agent_Chk.equalsIgnoreCase("1") && Emp_Grp.equalsIgnoreCase("0"))
		{
		 		 wait = new WebDriverWait(browserObject,500);
		 		 browserObject.findElement(AgentChkbox).click();
		 		 wait.until(ExpectedConditions.elementToBeClickable(AgentChkbox));
				 
		 		 Flwait = new FluentWait(browserObject);
		 		 Flwait.withTimeout(1000, TimeUnit.MILLISECONDS);
				 Flwait.pollingEvery(200, TimeUnit.MILLISECONDS);
				 Flwait.ignoring(NoSuchElementException.class);
				 Flwait.until(ExpectedConditions.elementToBeClickable(SendEmailBtn));
				 browserObject.findElement(SendEmailBtn).click();
				 System.out.println("sent");
				 Thread.sleep(2000);
				// return true;
				 
		 	}
		 	else 
		 	{ 
		 		 if(Emp_Grp.equalsIgnoreCase("1") && Agent_Chk.equalsIgnoreCase("0"))
		 		 {
		 		 wait = new WebDriverWait(browserObject, 500);
		 		 browserObject.findElement(EmpGrpChkbox).click();
				 wait.until(ExpectedConditions.elementToBeClickable(EmpGrpChkbox));
				 
				 Flwait = new FluentWait(browserObject);
				 Flwait.withTimeout(2000, TimeUnit.MILLISECONDS);
				 Flwait.pollingEvery(200, TimeUnit.MILLISECONDS);
				 Flwait.ignoring(NoSuchElementException.class);
				 Flwait.until(ExpectedConditions.elementToBeClickable(GrpEmailAdd));
				 browserObject.findElement(GrpEmailAdd).sendKeys(Grp_Email);
				 
				
				 Flwait.withTimeout(1000, TimeUnit.MILLISECONDS);
				 Flwait.pollingEvery(200, TimeUnit.MILLISECONDS);
				 Flwait.ignoring(NoSuchElementException.class);
				 Flwait.until(ExpectedConditions.elementToBeClickable(SendEmailBtn));
				 browserObject.findElement(SendEmailBtn).click();
				 System.out.println("sent");
				 Thread.sleep(2000);
				// return true;
				
		 		 }
		 		 else
		 		 {
		 			 
		 			wait = new WebDriverWait(browserObject,500);
		 		 	browserObject.findElement(AgentChkbox).click();
		 		 	wait.until(ExpectedConditions.elementToBeClickable(AgentChkbox));
		 			Thread.sleep(2000);
		 			
		 			wait = new WebDriverWait(browserObject,500);
		 		 	browserObject.findElement(EmpGrpChkbox).click();
		 		 	wait.until(ExpectedConditions.elementToBeClickable(EmpGrpChkbox));

		 		 	Flwait = new FluentWait(browserObject);
					Flwait.withTimeout(2000, TimeUnit.MILLISECONDS);
					Flwait.pollingEvery(200, TimeUnit.MILLISECONDS);
					Flwait.ignoring(NoSuchElementException.class);
					Flwait.until(ExpectedConditions.elementToBeClickable(GrpEmailAdd));
					browserObject.findElement(GrpEmailAdd).sendKeys(Grp_Email);
					Thread.sleep(2000);
		 		 	
		 			Flwait = new FluentWait(browserObject);
					Flwait.withTimeout(2000, TimeUnit.MILLISECONDS);
					Flwait.pollingEvery(200, TimeUnit.MILLISECONDS);
					Flwait.ignoring(NoSuchElementException.class);
					Flwait.until(ExpectedConditions.elementToBeClickable(SendEmailBtn));
					browserObject.findElement(SendEmailBtn).click();
					System.out.println("sent");
					Thread.sleep(2000);
					//return true;
		 		 }
		 			 
		 	}
		 }
		 else
		 {
			 
				Flwait = new FluentWait(browserObject);
				Flwait.withTimeout(3000, TimeUnit.MILLISECONDS);
				Flwait.pollingEvery(300, TimeUnit.MILLISECONDS);
				Flwait.ignoring(NoSuchElementException.class);
				Flwait.until(ExpectedConditions.elementToBeClickable(SubmitCompRadioBtn));
				browserObject.findElement(SubmitCompRadioBtn).click();
				
				if (denFlag.equalsIgnoreCase("1"))
					
				{
					wait = new WebDriverWait(browserObject,500);
		 		 	browserObject.findElement(denRadioBtn).click();
		 		 	wait.until(ExpectedConditions.elementToBeClickable(denRadioBtn));
		 		 	Thread.sleep(1000);
		 		   // upload Employer application
		 		 	clickChooseEmployerFile();
		 		 	uploadEmployerAppFile(path);
					Thread.sleep(3000);
					clickUploadEmployerFile();
					Thread.sleep(2000);
					wait = new WebDriverWait(browserObject,300);
			 		browserObject.findElement(denRadioBtn).click();
			 		wait.until(ExpectedConditions.elementToBeClickable(denRadioBtn));
					clickChooseEmployeeFile();			 
					uploadEmployeeAppFile(empPath);
					Thread.sleep(3000);
					clickUploadEmployeeFile();
		 		 	//return true;
					
				}
				else if (blFlag.equalsIgnoreCase("1"))
				{
					wait = new WebDriverWait(browserObject,500);
		 		 	browserObject.findElement(blRadioBtn).click();
		 		 	wait.until(ExpectedConditions.elementToBeClickable(blRadioBtn));
		 		 	Thread.sleep(1000);
			 		   // upload Employer application
		 		 	clickChooseEmployerFile();
		 		 	uploadEmployerAppFile(path);
					Thread.sleep(3000);
					clickUploadEmployerFile();
					Thread.sleep(2000);
					wait = new WebDriverWait(browserObject,300);
			 		browserObject.findElement(blRadioBtn).click();
			 		wait.until(ExpectedConditions.elementToBeClickable(blRadioBtn));
					clickChooseEmployeeFile();			 
					uploadEmployeeAppFile(empPath);
					Thread.sleep(3000);
					clickUploadEmployeeFile();
		
					
				}
				else if (stdFlag.equalsIgnoreCase("1"))
				{
					wait = new WebDriverWait(browserObject,500);
		 		 	browserObject.findElement(stdRadioBtn).click();
		 		 	wait.until(ExpectedConditions.elementToBeClickable(stdRadioBtn));
		 		 	clickChooseEmployerFile();
		 		 	uploadEmployerAppFile(path);
					Thread.sleep(3000);
					clickUploadEmployerFile();
					Thread.sleep(2000);
					 wait = new WebDriverWait(browserObject,300);
			 		 browserObject.findElement(stdRadioBtn).click();
			 		 wait.until(ExpectedConditions.elementToBeClickable(stdRadioBtn));
					 clickChooseEmployeeFile();			 
					 uploadEmployeeAppFile(empPath);
					 Thread.sleep(3000);
					 clickUploadEmployeeFile();
				}
				else if (visFlag.equalsIgnoreCase("1"))
				{
					wait = new WebDriverWait(browserObject,500);
		 		 	browserObject.findElement(visRadioBtn).click();
		 		 	wait.until(ExpectedConditions.elementToBeClickable(visRadioBtn));
		 		 	clickChooseEmployerFile();
		 		 	uploadEmployerAppFile(path);
					Thread.sleep(3000);
					clickUploadEmployerFile();
					Thread.sleep(2000);
					wait = new WebDriverWait(browserObject,300);
			 		browserObject.findElement(visRadioBtn).click();
			 		wait.until(ExpectedConditions.elementToBeClickable(visRadioBtn));
					clickChooseEmployeeFile();			 
					uploadEmployeeAppFile(empPath);
					Thread.sleep(3000);
					clickUploadEmployeeFile();
		 		 	
				}
				
				else if (vlFlag.equalsIgnoreCase("1"))
				{
					wait = new WebDriverWait(browserObject,500);
		 		 	browserObject.findElement(vlRadioBtn).click();
		 		 	wait.until(ExpectedConditions.elementToBeClickable(vlRadioBtn));
		 		 	clickChooseEmployerFile();
		 		 	uploadEmployerAppFile(path);
					Thread.sleep(3000);
					clickUploadEmployerFile();
					Thread.sleep(2000);
					wait = new WebDriverWait(browserObject,300);
			 		browserObject.findElement(vlRadioBtn).click();
			 		wait.until(ExpectedConditions.elementToBeClickable(vlRadioBtn));
					clickChooseEmployeeFile();			
					uploadEmployeeAppFile(empPath);
					Thread.sleep(3000);
					clickUploadEmployeeFile();
		 		 	
				}
				else
				{
					wait = new WebDriverWait(browserObject,500);
		 		 	browserObject.findElement(dvRadioBtn).click();
		 		 	wait.until(ExpectedConditions.elementToBeClickable(dvRadioBtn));
		 			clickChooseEmployerFile();
		 		 	uploadEmployerAppFile(path);
					Thread.sleep(3000);
					clickUploadEmployerFile();
					Thread.sleep(2000);
					wait = new WebDriverWait(browserObject,300);
			 		browserObject.findElement(dvRadioBtn).click();
			 		wait.until(ExpectedConditions.elementToBeClickable(dvRadioBtn));
					clickChooseEmployeeFile();			 
					uploadEmployeeAppFile(empPath);
					Thread.sleep(3000);
					clickUploadEmployeeFile();
					
				}
				
		 }
				
				//return true;
			 
		 }
	
public void clickChooseEmployerFile() {
	chooseBtn = browserObject.findElement(EmployerChooseFileBtn);
	 JavascriptExecutor executor = (JavascriptExecutor)browserObject;
	 executor.executeScript("arguments[0].click();", chooseBtn);
	
}

public void clickUploadEmployerFile() {
	 action = new Actions(browserObject);
	 employerUpload_btn= browserObject.findElement(EmployerUploadBtn);
	 action.moveToElement(employerUpload_btn).click().perform();
	
}

public void clickChooseEmployeeFile() {
	action = new Actions(browserObject);
    empChoose_btn= browserObject.findElement(EmployeeChooseFileBtn);
	action.moveToElement(empChoose_btn).click().perform();	
}

public void clickUploadEmployeeFile() {
	action = new Actions(browserObject);
    empupload_btn= browserObject.findElement(EmployeeUploadBtn);
	action.moveToElement(empupload_btn).click().perform();
	 
	 
}
	
public void uploadEmployerAppFile(String path) {
		
		try 
		{
			Runtime.getRuntime().exec(path);
		}
		catch (IOException e ) {
			e.printStackTrace();
		}
	
		try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
}
		
public void uploadEmployeeAppFile(String empPath){
	try 
	{
		Runtime.getRuntime().exec(empPath);
	}
	catch (IOException e ) {
		e.printStackTrace();
	}

	try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	
	}

}
