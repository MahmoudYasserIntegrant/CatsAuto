package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.QuotingSideBarMenu_Locators;

public class QuotingSideBarMenu extends QuotingSideBarMenu_Locators {
	
	public QuotingSideBarMenu (WebDriver browserObject)
	{
		this.browserObject= browserObject;
	}
	
	public void NavigateToAgentsAssignment()
	{
		WebDriverWait wait = new WebDriverWait(browserObject, 10);
		browserObject.findElement(AgentsAssignment_SideBarItem).click();
		
		wait.until(ExpectedConditions.titleContains("Agents Assignment"));
	}
}
