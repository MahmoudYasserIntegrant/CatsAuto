package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.QuoteCustomers_Locators;
import com.utility.QuotingSideBarMenu_Locators;

public class QuoteCustomers extends QuoteCustomers_Locators {
	
	public QuoteCustomers (WebDriver browserObject)
	{
		this.browserObject= browserObject;
	}
	
	public void NavigateToGroup()
	{
		WebDriverWait wait = new WebDriverWait(browserObject, 10);
		browserObject.findElement(GroupNumber_Link).click();
		
		wait.until(ExpectedConditions.titleContains("Customer Details"));
	}
	
	public void NavigateToAgentsAssignmentScreen()
	{
		WebDriverWait wait = new WebDriverWait(browserObject, 10);
		
		browserObject.findElement(QuoteNewGroup_Button).click();
		wait.until(ExpectedConditions.titleContains("Agents Assignment"));
	}
	

}
