package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.EmpGroupQuotesLocators;
import com.utility.QuoteCustomers_Locators;
import com.utility.QuotingSideBarMenu_Locators;

public class EmployergroupQuotes extends EmpGroupQuotesLocators {
	
	public EmployergroupQuotes (WebDriver browserObject){
		
		this.browserObject = browserObject;
	}
	
/*	public void navigatetoNewQuotingGroupDetailsScreen()
	{
		browserObject.findElement(NavigateToQuoteGroupDetailsBtn).click();
		WebDriverWait  wait = new WebDriverWait(browserObject, 10);
		wait.until(ExpectedConditions.titleContains("Customer Details"));
	}*/

	
	public void GenerateQuoteDocument()
	{
	//	browserObject.findElement(NavigateToQuoteGroupDetailsBtn).click();
	/*
	 * WebDriverWait wait = new WebDriverWait(browserObject, 10);
	 * wait.until(ExpectedConditions.titleContains("Customer Details"));
	 */
		WebElement quotesTbl = browserObject.findElement(By.id("ctl00_DefaultContent_uxCustomerQuotesList"));

		List<WebElement> rows = quotesTbl.findElements(By.tagName("tr"));
		int count =rows.size();
		System.out.println("rows count:"+ count);
//		for (WebElement row : rows)
//		{
//			
//			
//			/*
//			 * if (row.getText().contains(searchText)) { row.click(); break; }
//			 */
//		}
	}
}
