package pages;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.EmpGroupQuotes_Locators;
import com.utility.QuoteCustomers_Locators;

public class EmpGroupQuotes extends EmpGroupQuotes_Locators{

	String colText="";

public EmpGroupQuotes(WebDriver browserObject) {
		
		this.browserObject= browserObject;
		
	}

@SuppressWarnings({ "unused", "unlikely-arg-type", "null" })
public void GenerateQuoteDocuments (String QuoteNbr) throws InterruptedException, IOException{
	
	String [] quotes= QuoteNbr.split(",");
	int quotes_len=quotes.length;
	
	for (int quoteIndex=0;quoteIndex<quotes_len;quoteIndex++)
	{
		WebElement tbl = browserObject.findElement(By.id("ctl00_DefaultContent_uxCustomerQuotesList"));
		List<WebElement> rows = tbl.findElements(By.tagName("tr"));
		int rowsCount = browserObject.findElements(By.xpath("//table[@id='ctl00_DefaultContent_uxCustomerQuotesList']//tr")).size();

		for (int rowIndex=1;rowIndex<rowsCount;rowIndex++)
		{
			boolean quoteFound= false;
			List<WebElement> cols = rows.get(rowIndex).findElements(By.tagName("td"));
			if (cols.size()>=2)
			{
			for(int colIndex=1; colIndex<3; colIndex++) {
		       colText=cols.get(colIndex).getText();
				if (colText.equalsIgnoreCase(quotes[quoteIndex]))
				{
					Thread.sleep(1000);
					cols.get(colIndex-1).click();
					Thread.sleep(2000);
					quoteFound=true;
					break;
					
				
				}
		     }
			}
			
			if(quoteFound)
			{
				break;
			}

		}
		
		
	}
	
	
	

try {	

	WebElement element = browserObject.findElement(GenerateQuote_btn);
	 browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
	element.click();
	Thread.sleep(2000);

	 WebDriverWait wait = new WebDriverWait(browserObject,2000);
	if (wait.until(ExpectedConditions.alertIsPresent())==null)
			{
		System.out.println("Alert not displayed");
		
			}
	else 
		browserObject.switchTo().alert().accept();
		
	
}
   catch (NoAlertPresentException ne){
	System.out.println("Alert not displayed");
	ne.printStackTrace();
	}

Thread.sleep(2000);
///******* Assert that the checked quote after being generated ,a row is added in the generated quote document history grid 
 
    String [] denquoteArr = new String[10];
    String [] visquoteArr = new String[10];
    String [] histQuotes= new String[10];
	int HistoryrowsCount = browserObject.findElements(By.xpath("//table[@id='ctl00_DefaultContent_uxQuotingDocumentHistoryList']//tr[2]/td")).size();
	Thread.sleep(2000);
//	System.out.println("count:"+ HistoryrowsCount);
	List<WebElement> rowCells = browserObject.findElements(By.xpath("//*[@id=\"ctl00_DefaultContent_uxQuotingDocumentHistoryList\"]/tbody/tr[2]/td"));
	
	/*
	 * HistoryQuotes.add(rowCells.get(1).toString());
	 * System.out.println("First string in Array"+ HistoryQuotes.get(1).toString());
	 * HistoryQuotes.add(rowCells.get(2).toString());
	 * System.out.println("Second string in Array"+
	 * HistoryQuotes.get(2).toString()); if (HistoryQuotes.equals(quotes) == true) {
	 * WebElement element = browserObject.findElement(QuoteDownload_btn);
	 * browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
	 * element.click(); }
	 */
	
	String denQuote= rowCells.get(1).getText();
	if (denQuote !="")
	{
	denquoteArr=denQuote.split(" ");
	int dquoteLen= denQuote.length();
	}

	
	String VisQuote=rowCells.get(2).getText();
	if (VisQuote !="")
	{
	visquoteArr=VisQuote.split(" ");
	int vquoteLen= VisQuote.length();
	
	}
	
//	System.out.println(VisQuote);

	histQuotes=merge(denquoteArr,visquoteArr);

	if (Arrays.equals(quotes, histQuotes))
	{ 
		System.out.println("Equal!");
		WebElement element4 = browserObject.findElement(QuoteDownload_btn);
		browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
		element4.click();
	}
	/*
	 * for( int rowIndex=1; rowIndex<8; rowIndex++) {
	 * colText=rowCells.get(rowIndex).getText(); System.out.println(colText);
	 * HistoryQuotes.add(colText); if (HistoryQuotes.get(rowIndex).equals(quotes) ==
	 * true) { WebElement
	 * download_lnk=rowCells.get(rowIndex+6).findElement(By.tagName("a"));
	 * download_lnk.click(); break;
	 * 
	 * } }
	 */
		//HistoryQuotes.add(colText);	
		
	
	/*if (HistoryQuotes.equals(quotes) == true) {
		
			//WebElement download_lnk=rowCells.get(j+6).findElement(By.tagName("a"));
		//	download_lnk.click();
			
			
	
	
    
	

/*	   
//Assert file download in chrome Downloads
//Get Parent Window Handle
		String parentWindow = browserObject.getWindowHandle();
		// Open New Tab in Same Browser and go to "chrome://downloads" to check Download
		// status
		JavascriptExecutor jsExecutor = (JavascriptExecutor) browserObject;
		jsExecutor.executeScript("window.open()");
		// Get all windowHandles
		Set<String> allWinowHandles = browserObject.getWindowHandles();
		// Switch to new Window Handle
		for (String winHandle : allWinowHandles) {
			// Switch to second window
			if (!winHandle.equals(parentWindow)) {
				browserObject.switchTo().window(winHandle);
			}
		}
		// navigate to chrome downloads
		browserObject.get("chrome://downloads");
		JavascriptExecutor downloadWindowExecutor = (JavascriptExecutor) browserObject;
		// Wait for Download till 100% completion
		double percentageProgress = (double) 0;
		while (percentageProgress != 100) {
			percentageProgress = (Long) downloadWindowExecutor.executeScript(
					"return document.querySelector('downloads-manager').shadowRoot.querySelector('#downloadsList downloads-item').shadowRoot.querySelector('#progress').value");
			System.out.println("Completed Percentage" + percentageProgress);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
*/

	
	
}

private String[] merge(String[] denquoteArr, String[] visquoteArr) {
	String[]hquotes = new String [denquoteArr.length+visquoteArr.length];
	  int i;
	  
	  for(i = 0; i < denquoteArr.length; i++) {
		  hquotes[i] = denquoteArr[i];
      }
      for(i = 0; i < visquoteArr.length; i++) {
    	  hquotes[denquoteArr.length + i] = visquoteArr[i];
      }
      
      
		/*
		 * for(i=0; i<denquoteArr.length; i++) { hquotes[i] = denquoteArr[i]; }
		 * 
		 * 
		 * for(int j=0; j<visquoteArr.length; j++) {hquotes[i++]=visquoteArr[j]; }
		 */
	    	 
	        return hquotes;
}



}
