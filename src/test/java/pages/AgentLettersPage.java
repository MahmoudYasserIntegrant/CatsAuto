package pages;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.utility.AgentLettersLocators;

public class AgentLettersPage extends AgentLettersLocators {
	public String Lname = "";
	public String Sname = "";
	

	public AgentLettersPage(WebDriver browserObject) {
		this.browserObject = browserObject;
	}

	public void downloadAgentLetter(String LetterName) {

		// WebElement element = (new WebDriverWait(browserObject, 100))
		// .until(ExpectedConditions.elementToBeClickable(By.id("ctl00_DefaultContent_uxLetterNameList")));

		// Select LetterDDL = new
		// Select(browserObject.findElement(By.id("ctl00_DefaultContent_uxLetterNameList")));
		// LetterDDL.selectByVisibleText(LetterName);
		// element = (new WebDriverWait(browserObject, 100))
		// .until(ExpectedConditions.elementToBeClickable(By.id("ctl00_DefaultContent_uxSearchCommand")));
//		element.click();
		WebDriverWait wait = new WebDriverWait(browserObject, 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_DefaultContent_uxAgentLettersList")));
		// WebElement AgLettersTable = browserObject.findElement(AgentTable);

		/*
		 * WebElement element = (new WebDriverWait(browserObject, 200))
		 * .until(ExpectedConditions.visibilityOfElementLocated(By.linkText(LetterName))
		 * );
		 */

		int current_page_no = 1;
		int index=0;

		//first get all the <a> elements
	/*	List<WebElement> linkList=browserObject.findElements(By.tagName("a"));

		//now traverse over the list and check
		for(int i=0 ; i<linkList.size() ; i++)
		{
		    if(linkList.get(i).getAttribute("href").contains("Page"))
		    {
		        linkList.get(i).click();
		        try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        break;
		    }
		}*/
		List<WebElement> linksList = browserObject.findElements(By.xpath(".//a[contains(@href,'Page')]"));
	//	List<WebElement> linksList = browserObject.findElements(By.get.cssSelector("a[href*=Page]"));

		int pages_count = linksList.size() + 1;
		while (current_page_no <= pages_count) {
			List<WebElement> links = browserObject.findElements(By.tagName("a"));
			System.out.println("Links Size:" + links.size());
			System.out.println(" Page: " + current_page_no);
			for (int j = 0; j < links.size(); j++) {
				Lname = links.get(j).getText();
				if (LetterName.equalsIgnoreCase(Lname)) {
					System.out.println("Download: " + Lname);
					// System.out.println(LetterName);
					links.get(j).click();
					break;
				}

			}
			 
			if (current_page_no < pages_count) {
				index=current_page_no - 1;
				linksList.get(index).click();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("New Page :" + linksList.size());

			} else {
				break;
			}
			System.out.println("Current Page:" + current_page_no);
			current_page_no += 1;
			System.out.println("Next Page:" + current_page_no);

		}
		
		/*
		 * else {
		 * 
		 * 
		 * if (links.get(i).getAttribute("href").contains("Page")) {
		 * 
		 * links.get(i).click(); try { Thread.sleep(1000); } catch (InterruptedException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * List<WebElement> newlinks = browserObject.findElements(By.tagName("a")); for
		 * (int j=0;j<newlinks.size();j++) { Sname = newlinks.get(j).getText(); if
		 * (LetterName.equalsIgnoreCase(Sname)) { System.out.println(Sname);
		 * System.out.println(LetterName); newlinks.get(j).click(); break;
		 * 
		 * 
		 * } } }
		 * 
		 * } } // if (LetterName.equalsIgnoreCase(element.getText())) //
		 * element.click();
		 * 
		 * try { Thread.sleep(500); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * //browserObject.navigate().refresh(); /*List<WebElement> allrows =
		 * AgLettersTable.findElements(By.tagName("tr"));
		 * 
		 * for(WebElement row: allrows){ List<WebElement> Cells =
		 * row.findElements(By.tagName("td"));
		 * 
		 * for(WebElement Cell:Cells){
		 * 
		 * if(Cell.getText().equalsIgnoreCase(LetterName)) {
		 * browserObject.findElement(By.linkText(LetterName)).click(); //
		 * browserObject.findElement(By.linkText(LetterName)).click();
		 * 
		 * /* List<WebElement> elements = browserObject.findElements(By.tagName("a"));
		 * for (int i = 0; i < elements.size(); i++) { String Lname =
		 * elements.get(i).getText(); System.out.println(Lname); }
		 * 
		 * if (Lname.equalsIgnoreCase(LetterName)) { elements.get(i).click(); break; } }
		 */

		// }
		// break;
		// }

		// }
		
		// Get Parent Window Handle
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
	
	}

}
