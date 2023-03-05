package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.AgentsAssignment_Locators;

public class AgentsAssignment extends AgentsAssignment_Locators{

	public AgentsAssignment(WebDriver browserObject)
	{
		this.browserObject = browserObject;
	}
	
	WebDriverWait wait;
	
	public void AssignAgent(String LicenseNo, String State)
	{
	    browserObject.findElement(AgentLookup_Btn).click();
	    
	    wait = new WebDriverWait(browserObject, 10);			
		wait.until(ExpectedConditions.elementToBeClickable(LicenseNo_Text));
		browserObject.findElement(LicenseNo_Text).sendKeys(LicenseNo);
		
		Select statesList = new Select(browserObject.findElement(States_List));
		statesList.selectByValue(State);
		
	    browserObject.findElement(AgentLookup2_Btn).click();	
	    
		wait.until(ExpectedConditions.elementToBeClickable(SelectAgent_Btn));
	    browserObject.findElement(SelectAgent_Btn).click();
	    
		wait.until(ExpectedConditions.invisibilityOfElementLocated(AgentLookup_Container));
		
		
	}
	
	public void NewGroupAgentAssignment(String LicenseNo, String State)
	{
		AssignAgent(LicenseNo, State);
		browserObject.findElement(Next_Btn).click();
		wait = new WebDriverWait(browserObject, 10);
	    wait.until(ExpectedConditions.titleContains("Customer Details"));
		
		
	}
	public void GroupAgentAssignment() throws InterruptedException
	{
		
		FluentWait Flwait = new FluentWait(browserObject);
		 Flwait.withTimeout(5000, TimeUnit.MILLISECONDS);
		 Flwait.pollingEvery(500, TimeUnit.MILLISECONDS);
		 Flwait.ignoring(NoSuchElementException.class);
		 Flwait.until(ExpectedConditions.elementToBeClickable(Next_Btn));
		 browserObject.findElement(Next_Btn).click();
		 Thread.sleep(1000);
		 
	
			
	}
	public void EditGroupAgentAssignment(String LicenseNo, String State)
	{
		AssignAgent(LicenseNo, State);
		browserObject.findElement(Done_Btn).click();
		wait = new WebDriverWait(browserObject, 10);
	    wait.until(ExpectedConditions.titleContains("Customer Quotes"));
		
		
	}
}
