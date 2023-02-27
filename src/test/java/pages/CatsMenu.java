package pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.utility.CatsMenuLocators;


public class CatsMenu extends CatsMenuLocators  {
	

	public CatsMenu(WebDriver browserObject) {
		
		this.browserObject= browserObject;
		Action = new Actions(browserObject);
	}
	

	public void NavigateToSoldGroups() {
		
		 
		WebElement element = (new WebDriverWait(browserObject, 50))
				   .until(ExpectedConditions.elementToBeClickable(By.linkText("Sold Groups")));
		Action.moveToElement(element).build().perform();	
		WebElement element1 = browserObject.findElement(SoldGroups);
		 browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		 element1.click();	
	}

	public void NavigateToEmployerSettingsScreen(String CustomerNum) {
		
		WebElement element = browserObject.findElement(GroupNumberTextBox);
		browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
		element.sendKeys(CustomerNum);
		
	
		WebElement element1 = browserObject.findElement(SoldGroupsSearchBtn);
		browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
		element1.click();
				
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement element2 = browserObject.findElement(SoldGroupsEnrollmentHyberLink);
		browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
		element2.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement element3 = browserObject.findElement(EmployerGroupSettingsBtn);
		browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
		element3.click();
	}
      public void NavigateToAgentLetters() {
		
		WebElement element = (new WebDriverWait(browserObject, 100))
				   .until(ExpectedConditions.elementToBeClickable(By.linkText("Letters")));
		element.click();
	 }
      
      public void NavigateToCustomerDetails() {
  		
  		WebElement element = (new WebDriverWait(browserObject, 100))
  				   .until(ExpectedConditions.elementToBeClickable(By.linkText("Group Details")));
  		element.click();
  	 }
      
      public void createNewGroupQuote() {
    	  
    	  WebElement element = (new WebDriverWait(browserObject, 100))
 				   .until(ExpectedConditions.elementToBeClickable(QuoteNewGroupBtn));
 		element.click();
      }
    
      public void NavigatetoCensusScreen(String QuoteGroupNum)
      {
    	  
  		WebElement element = (new WebDriverWait(browserObject, 50))
				   .until(ExpectedConditions.elementToBeClickable(By.linkText("Quoting")));
		Action.moveToElement(element).build().perform();	
		WebElement element1 = browserObject.findElement(Quoting);
		 browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		 element1.click();
		 
			WebElement element2 = browserObject.findElement(GroupNumberQuotingTextBox);
			browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
			element2.sendKeys(QuoteGroupNum);
			
		
			WebElement element3 = browserObject.findElement(QuoteGroupsSearchBtn);
			browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
			element3.click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  
			WebElement element4 = browserObject.findElement(QuoteGroupNumberHyberLink);
			browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
			element4.click();
			
			
			WebElement element5 = browserObject.findElement(CensusSideBarMenu);
			browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
			element5.click();			
      }
      


      public void NavigatetoGroupQuotes(String CustomerNum)
      {
    	  
    	  WebElement element = (new WebDriverWait(browserObject, 30))
				   .until(ExpectedConditions.elementToBeClickable(By.linkText("Quoting")));
		Action.moveToElement(element).build().perform();
		
		WebElement element1 = browserObject.findElement(Quoting);
		 browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		 element1.click();
		 
			WebElement element2 = browserObject.findElement(GroupNumberQuotingTextBox);
			browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
			element2.sendKeys(CustomerNum);
			
		
			WebElement element3 = browserObject.findElement(QuoteGroupsSearchBtn);
			browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
			element3.click();
			
				try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			WebElement element4 = browserObject.findElement(QuoteGroupNumberHyberLink);
			browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
			element4.click();
	
			WebDriverWait wait = new WebDriverWait(browserObject, 50);
			browserObject.findElement(GroupQuotes_Link).click();
			wait.until(ExpectedConditions.titleContains("Employer Group Quotes"));
			

      }
      
      public void NavigatetoGroupEnrollment(String CustomerNum)
      {
    	  
    	  WebElement element = (new WebDriverWait(browserObject, 30))
				   .until(ExpectedConditions.elementToBeClickable(By.linkText("Quoting")));
		Action.moveToElement(element).build().perform();
		
		WebElement element1 = browserObject.findElement(Quoting);
		 browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		 element1.click();
		 
			WebElement element2 = browserObject.findElement(GroupNumberQuotingTextBox);
			browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
			element2.sendKeys(CustomerNum);
			
		
			WebElement element3 = browserObject.findElement(QuoteGroupsSearchBtn);
			browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
			element3.click();
			
				try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			WebElement element4 = browserObject.findElement(QuoteGroupNumberHyberLink);
			browserObject.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS) ;
			element4.click();
			
		 	WebDriverWait wait = new WebDriverWait(browserObject,1000);
 		 	browserObject.findElement(GroupEnroll_Link).click();
 		 	wait.until(ExpectedConditions.elementToBeClickable(GroupEnroll_Link));
			

			

      }

}


