package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.AgentsAssignment_Locators;

public class AgentsAssignment extends AgentsAssignment_Locators{

	public AgentsAssignment(WebDriver browserObject)
	{
		this.browserObject = browserObject;
	}
	
	public void AddAgentAssignment(String LicenseNo, String State)
	{
	    browserObject.findElement(AgentLookup_Btn).click();
	    
	   // WebElement Lookup_popup = browserObject.findElement(AgentLookup_Container);
	    WebDriverWait wait = new WebDriverWait(browserObject, 10);			
		wait.until(ExpectedConditions.elementToBeClickable(LicenseNo_Text));
		browserObject.findElement(LicenseNo_Text).sendKeys(LicenseNo);
		
		Select statesList = new Select(browserObject.findElement(States_List));
		statesList.selectByValue(State);
		
	    browserObject.findElement(AgentLookup2_Btn).click();	
	    
		wait.until(ExpectedConditions.elementToBeClickable(SelectAgent_Btn));
	    browserObject.findElement(SelectAgent_Btn).click();
	    
		wait.until(ExpectedConditions.invisibilityOfElementLocated(AgentLookup_Container));
		browserObject.findElement(Done_Btn).click();
	    wait.until(ExpectedConditions.titleContains("Customer Quotes"));
		
		
	}
}
