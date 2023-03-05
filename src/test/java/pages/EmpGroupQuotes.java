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
	WebDriverWait wait;
	boolean quoteFound=false;
	String [] GridQuote;

public EmpGroupQuotes(WebDriver browserObject) {
		
		this.browserObject= browserObject;
		
	}

public int GetQuotesGeneratedCount(String QuoteNbr) throws InterruptedException, IOException
{
	String [] GridQuote=QuoteNbr.split(",");
	String [] denquoteArr = new String[10];
	  String [] visquoteArr = new String[10];
	  String [] histQuotes= new String[10];
	  String []result=new String[50];
	 int denlen=0;
	 int vislen=0;
	  List<String> HistCount = null;
	  int HistoryrowsCount = browserObject.findElements(By.xpath("//table[@id='ctl00_DefaultContent_uxQuotingDocumentHistoryList']//tr")).size();
		Thread.sleep(2000);
//		System.out.println("count:"+ HistoryrowsCount);
		
		
		WebElement GeneratedQuotesHistory_grid = browserObject.findElement(HistGrid_table);
		List<WebElement> Histrows=GeneratedQuotesHistory_grid.findElements(By.tagName("tr"));
		List <WebElement>Histcols=GeneratedQuotesHistory_grid.findElements(By.tagName("td"));
		//List<WebElement> rowCells = browserObject.findElements(By.xpath("//*[@id=\"ctl00_DefaultContent_uxQuotingDocumentHistoryList\"]/tbody/tr[2]/td"));
		int generatedrowsCount =0;
		for (int rowIndex=1;rowIndex<HistoryrowsCount;rowIndex++)
		{
			WebElement tbl = browserObject.findElement(By.id("ctl00_DefaultContent_uxQuotingDocumentHistoryList"));
			List<WebElement> rows = tbl.findElements(By.tagName("tr"));
			List<WebElement> cells = rows.get(rowIndex).findElements(By.tagName("td"));

	
		String denQuote= cells.get(1).getText().trim();
		//check empty string in java
		if (denQuote !=" ")
		{
		denquoteArr=denQuote.split(" ");
		denlen= denQuote.length();
		}

		
		String VisQuote=cells.get(2).getText().trim();
		if (VisQuote !=" ")
		{
		visquoteArr=VisQuote.split(" ");
		 vislen= VisQuote.length();
		
		}
	
		
		histQuotes=merge(denquoteArr,visquoteArr);
		Arrays.sort(histQuotes);
		Arrays.sort(GridQuote);
		if (Arrays.equals(GridQuote,histQuotes))
		{
			generatedrowsCount++;
		}
	}
	System.out.println("count:"+ generatedrowsCount);
return generatedrowsCount;


}
@SuppressWarnings({ "unused", "unlikely-arg-type", "null" })

public void GenerateQuoteDocuments (String QuoteNbr) throws InterruptedException, IOException
{
	
	//String [] quotes= QuoteNbr.split(",");
//	int quotes_len=quotes.length;
	
	
	
	int rowsCount = browserObject.findElements(By.xpath("//table[@id='ctl00_DefaultContent_uxCustomerQuotesList']//tr")).size();

	
	String [] GridQuote=QuoteNbr.split(",");
	for(int i=0; i<GridQuote.length;i++)
	
	{	
		
		
	for (int rowIndex=1;rowIndex<rowsCount;rowIndex++)
		{
			WebElement tbl = browserObject.findElement(By.id("ctl00_DefaultContent_uxCustomerQuotesList"));
			List<WebElement> rows = tbl.findElements(By.tagName("tr"));
			List<WebElement> cells = rows.get(rowIndex).findElements(By.tagName("td"));
			String Quote= cells.get(1).getText();
			
			if (Quote !="")
			{
				
					if (GridQuote[i].equalsIgnoreCase(Quote))
					{
						Thread.sleep(2000);
						System.out.print("Qoute " +Quote + " GridQoute " + GridQuote[i]);
						cells.get(0).click();
						Thread.sleep(2000);
					//	if(Quote == "15") {
						//	System.out.print("Wrong Qoute " +Quote + " GridQoute " + GridQuote[i]);
							
					//	}
						
					//	Thread.sleep(3000);
						
						
					}
				}
			}
		}
		

try {	
	
	WebElement element = (new WebDriverWait(browserObject, 100))
			   .until(ExpectedConditions.elementToBeClickable(GenerateQuote_btn));
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
  List<String> HistCount = null;
  int HistoryrowsCount = browserObject.findElements(By.xpath("//table[@id='ctl00_DefaultContent_uxQuotingDocumentHistoryList']//tr[2]/td")).size();
	Thread.sleep(2000);
//	System.out.println("count:"+ HistoryrowsCount);
	List<WebElement> rowCells = browserObject.findElements(By.xpath("//*[@id=\"ctl00_DefaultContent_uxQuotingDocumentHistoryList\"]/tbody/tr[2]/td"));
	
	
	String denQuote= rowCells.get(1).getText();
	if (denQuote !=" ")
	{
	denquoteArr=denQuote.split(" ");
	int dquoteLen= denQuote.length();
	}

	
	String VisQuote=rowCells.get(2).getText();
	if (VisQuote !=" ")
	{
	visquoteArr=VisQuote.split(" ");
	int vquoteLen= VisQuote.length();
	
	}
	
//	System.out.println(VisQuote);

	histQuotes=merge(denquoteArr,visquoteArr);
	Arrays.sort(GridQuote);
	Arrays.sort(histQuotes);
	if (Arrays.equals(GridQuote, histQuotes))
	{ 
		System.out.println("Equal!");
		WebElement QuoteDownloadbtn = browserObject.findElement(QuoteDownload_btn);
		browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		QuoteDownloadbtn.click();
	}

			
	
  
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

		for (int hrowIndex=1;hrowIndex<HistoryrowsCount;hrowIndex++)
		{
			
			 String hquote= rowCells.get(1).getText();

			if (hquote.equals(QuoteNbr))
			{
				HistCount.add(hquote);
				System.out.println("Array size" + HistCount.size());
				
			}
			}
			
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
	    	 
	        return hquotes;
}



}
