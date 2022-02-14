package pages;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.utility.EmployerSettingLocators;

public class EmployerSettingPage extends EmployerSettingLocators {
	
	public EmployerSettingPage(WebDriver browserObject)
	{
		this.browserObject = browserObject;
	}
	public void WaitForElements(By byElement) {
		FluentWait wait = new FluentWait(browserObject);
		//Specify the timout of the wait
		wait.withTimeout(5000, TimeUnit.MILLISECONDS);
		//Sepcify polling time
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		//Specify what exceptions to ignore
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(byElement));

	}
	
	@SuppressWarnings("deprecation")
	public void SendLetters(String SendLettersbyMail) 
	{
	
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		WaitForElements(SendLettersByMailYestitle);


		if(SendLettersbyMail.equalsIgnoreCase(browserObject.findElement(SendLettersByMailYestitle).getText()))
		{
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			System.out.println("This is the default selection");
			browserObject.findElement(SendLettersByMailYesRadioBtn).click();
		}
		
		else {
			/*
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			WaitForElements(SendLettersByMailNoRadioBtn);

				browserObject.findElement(SendLettersByMailNoRadioBtn).click();
			 }

	    }
	
	public void SendInvoices(String SendInvoicesByMail) 
	{
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		WaitForElements(SendInvoicesByMailYestitle);

		if(SendInvoicesByMail.equalsIgnoreCase(browserObject.findElement(SendInvoicesByMailYestitle).getText()))

		{
			/*
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
			System.out.println("This is the default selection");
			browserObject.findElement(SendInvoiceByMailYesRadioBtn).click();
		}
		else {
			/*
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			WaitForElements(SendInvoicesByMailNoRadioBtn);

				browserObject.findElement(SendInvoicesByMailNoRadioBtn).click();
			 }
	}
	
	
	
	public void SelectOptOut(String OptOutEmailNotification) 
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(OptOutEmailNotification.equalsIgnoreCase(browserObject.findElement(OptOutEmailNotificationYestitle).getText()))
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("This is the default selection");
			browserObject.findElement(OptOutEmailNotificationYesRadioBtn).click();
		}
		
		else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				browserObject.findElement(OptOutEmailNotificationNoRadioBtn).click();
			 }

	}
	
	
	public void SelectElectronicPayment (String ACHSelection , String BankRoutionNumber , String BankAccountNum ,
			String ReenterBankAccountNum ,String BankAccountType , String IAuthorize , String CalendarDay ) 
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(ACHSelection.equalsIgnoreCase(browserObject.findElement(EnableACHTitle).getText()))
			{
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
							browserObject.findElement(EnableACHRadioBtn).click();
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							}
							browserObject.findElement(BankRoutingNumTextBox).click();
							browserObject.findElement(BankRoutingNumTextBox).sendKeys(Keys.chord(Keys.CONTROL , "a"));
							browserObject.findElement(BankRoutingNumTextBox).sendKeys(Keys.BACK_SPACE);
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							}
							
							browserObject.findElement(BankRoutingNumTextBox).sendKeys(BankRoutionNumber);
							
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							}
							browserObject.findElement(BankAccountNumTextBox).click();
							browserObject.findElement(BankAccountNumTextBox).sendKeys(Keys.chord(Keys.CONTROL , "a"));
							browserObject.findElement(BankAccountNumTextBox).sendKeys(Keys.BACK_SPACE);
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							}
							browserObject.findElement(BankAccountNumTextBox).sendKeys(BankAccountNum);
							
							browserObject.findElement(ReenterBankAccountNumTextBox).click();
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							}
							browserObject.findElement(ReenterBankAccountNumTextBox).sendKeys(ReenterBankAccountNum);
							
							browserObject.findElement(BankAccountTypeDDL).click();
							browserObject.findElement(BankAccountTypeDDL).sendKeys(BankAccountType);
							
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							
							
							WebElement dataWidget = browserObject.findElement(CalendarTable);
							//@SuppressWarnings("unused")
							//List <WebElement> rows=dataWidget.findElements(By.tagName("tr"));
							List <WebElement> columns=dataWidget.findElements(By.tagName("td"));
							for (WebElement cell: columns){
								System.out.println(cell.getText());
								
							  if(cell.getText().equals(CalendarDay) && !cell.getAttribute("class").equals("Disabled-Date"))
							  { 
								  cell.click(); 
								    break;
							  }
							
							}


		 if(IAuthorize.equalsIgnoreCase(browserObject.findElement(IAuthorizeNotitle).getText()))

								{
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									System.out.println("This is the default selection");
									browserObject.findElement(IAuthorizeNoRadioBtn).click();
								}
								
								else {
										try {
											Thread.sleep(1000);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
											browserObject.findElement(IAuthorizeYesRadioBtn).click();
										}

							
		 						try {
									Thread.sleep(3000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
		 					
							browserObject.findElement(EmpGrpSettingsSaveBtn).click();
			}
		
		else{

						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

			
				browserObject.findElement(DisableACHRadioBtn).click();
				

				
				browserObject.findElement(EmpGrpSettingsSaveBtn).click();
			}
	}
}
	
	


