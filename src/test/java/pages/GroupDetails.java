package pages;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.utility.GroupDetailsLocators;

public class GroupDetails extends GroupDetailsLocators{
	WebDriver browserObject ;
	WebDriverWait wait;
	
	 String [] coverageArr = new String[10];
	
	public GroupDetails(WebDriver browserObject) {
		this.browserObject = browserObject;
	}

	
	public void Addgroupdetails(String CustName,String Address1,String Address2,String Zipcode,String PayrollNum,String SICcode, String SelectChk,String Flag) throws InterruptedException{
		
		browserObject.findElement(CustName_txt).sendKeys(CustName);
		wait = new WebDriverWait(browserObject, 300);
	    wait.until(ExpectedConditions.titleContains("Customer Details"));
	  //  Thread.sleep(1000);
		
		wait = new WebDriverWait(browserObject, 300);			
		wait.until(ExpectedConditions.presenceOfElementLocated(Address1_txt));
		browserObject.findElement(Address1_txt).sendKeys(Address1);
		
		//Thread.sleep(1000);
		wait = new WebDriverWait(browserObject,300);			
		wait.until(ExpectedConditions.presenceOfElementLocated(Address2_txt));
		browserObject.findElement(Address2_txt).sendKeys(Address2);
	//	Thread.sleep(1000);
		wait = new WebDriverWait(browserObject, 300);			
		wait.until(ExpectedConditions.presenceOfElementLocated(Zipcode_txt));
		browserObject.findElement(Zipcode_txt).sendKeys(Zipcode);
		browserObject.findElement(Zipcode_txt).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		wait = new WebDriverWait(browserObject, 300);			
		wait.until(ExpectedConditions.presenceOfElementLocated(PplPayrollNum_txt));
		browserObject.findElement(PplPayrollNum_txt).sendKeys(PayrollNum);
	//	Thread.sleep(1000);
		wait = new WebDriverWait(browserObject, 300);			
		wait.until(ExpectedConditions.presenceOfElementLocated(SICCode_txt));
		browserObject.findElement(SICCode_txt).sendKeys(SICcode);
		browserObject.findElement(SICCode_txt).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
		WebElement Coveragetbl = browserObject.findElement(CoverageSelTable);
		List<WebElement> rows=Coveragetbl.findElements(By.tagName("tr"));
		List <WebElement>cols=Coveragetbl.findElements(By.tagName("td"));
		List <WebElement>coverage_chckboxes=Coveragetbl.findElements(By.tagName("label"));
		
		coverageArr=Flag.split(",");
		int covArrlen=coverageArr.length;
		
	if (SelectChk.equalsIgnoreCase("0"))
	{
		for(int coverageindex=0;coverageindex<covArrlen;coverageindex++)
		{
			
				for (WebElement checkboxcell: coverage_chckboxes)
				{
					
					if(checkboxcell.getText().equalsIgnoreCase(coverageArr[coverageindex]))
					{
						checkboxcell.click();
						break;
					}
					
				}
			}			
		}
	
		else
		{
			
			wait = new WebDriverWait(browserObject, 300);			
			wait.until(ExpectedConditions.presenceOfElementLocated(SelAll_Chk));
			browserObject.findElement((SelAll_Chk)).click();
			Thread.sleep(1000);
		}
		
		
		wait = new WebDriverWait(browserObject, 300);			
		wait.until(ExpectedConditions.presenceOfElementLocated(NextBtn));
		browserObject.findElement((NextBtn)).click();	
	
  }
}
