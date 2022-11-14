package pages;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utility.GroupEnrollLocators;

public class GroupEnrollmentScreen extends GroupEnrollLocators{
	
	String colText="";
	public GroupEnrollmentScreen(WebDriver browserObject) {
		
		this.browserObject= browserObject;
		
	}


	
	 
	public void selectcov( String DenCov, String VisionCov ,String BasicLCov,String VolCov, String StdCov) throws InterruptedException 
	{	
		
		if (DenCov.equalsIgnoreCase("Yes"))
		{
			WebElement dentalCov = browserObject.findElement(DentalCov_CheckBox);
			if (!dentalCov.isSelected())
			{
				Thread.sleep(5000);
				browserObject.findElement(DentalCov_CheckBox).click();
			}
			
		}
		
		if (VisionCov.equalsIgnoreCase("Yes"))
		{
			WebElement visionCov = browserObject.findElement(VisionCov_CheckBox);
			if(!visionCov.isSelected())
			{
				Thread.sleep(5000);
				browserObject.findElement(VisionCov_CheckBox).click();
			}
				
		}
		
		if (BasicLCov.equalsIgnoreCase("Yes"))
		{
			WebElement BLCov = browserObject.findElement(LifeBasicCov_CheckBox);
			if(!BLCov.isSelected())
			{
				Thread.sleep(5000);
				browserObject.findElement(LifeBasicCov_CheckBox).click();
			}

		}
		
		if (VolCov.equalsIgnoreCase("Yes"))
		{
			WebElement volCov = browserObject.findElement(LifeVolCov_CheckBox);
			if(!volCov.isSelected())
			{
				Thread.sleep(5000);
				browserObject.findElement(LifeVolCov_CheckBox).click();
			}

		}
		
		if (StdCov.equalsIgnoreCase("Yes"))
		{
			WebElement stdCov = browserObject.findElement(STDCov_CheckBox);
			if(!stdCov.isSelected())
			{
				Thread.sleep(6000);
				browserObject.findElement(STDCov_CheckBox).click();
			}	
		}

	
	}
	
	
	public void selectforenrollment(String Quotes) throws InterruptedException {
		
		String [] GridQuote;
		int rowsCount = browserObject.findElements(Quote_Document_Grid_Row).size();

			for (int rowIndex=1;rowIndex<rowsCount;rowIndex++)
			{
				WebElement QuoteGrid = browserObject.findElement(Quote_Document_Grid);
				List<WebElement> rows = QuoteGrid.findElements(By.tagName("tr"));
				List<WebElement> cell = rows.get(rowIndex).findElements(By.tagName("td"));
				String Quote= cell.get(1).getText();
				if (Quote !="")
				{
					GridQuote=Quote.split(" ");
					for(int i=0; i<GridQuote.length;i++) 
					{
						if (GridQuote[i].equalsIgnoreCase(Quotes))
						{
							Thread.sleep(3000);
							cell.get(8).click();
							Thread.sleep(3000);
						}
					}
				}
		
			}
	}
	
	public void selectDenQuotes(String Single,String DualChoice,String DualChoicePlus,String DenQuotes) throws InterruptedException 
	{

		if (Single.equalsIgnoreCase("Yes"))
		{
			Thread.sleep(3000);
			browserObject.findElement(DenSingle_RadioBtn).click();
			Thread.sleep(5000);

			
			int QuoteCount = browserObject.findElements(DentalChk_Box_Grid_row).size();
			for (int QuoteIndex=0;QuoteIndex<QuoteCount;QuoteIndex++)
			{
				WebElement SingleGrid = browserObject.findElement(DentalRadioGrid);
				List<WebElement> rows = SingleGrid.findElements(By.tagName("tr"));
				List<WebElement> cell = rows.get(0).findElements(By.tagName("td"));
				String Quote= cell.get(QuoteIndex).getText();
					for(int i=0; i<Quote.length();i++) 
					{
						if (Quote.equalsIgnoreCase(DenQuotes))
						{
							Thread.sleep(5000);
							cell.get(QuoteIndex).click();
							Thread.sleep(5000);
						}
					}					
			}
			
			
			browserObject.findElement(SubmitDentQuoteBtn).click();
			
		}
		
		//doulchoice
		if (DualChoice.equalsIgnoreCase("Yes"))
		{
			Thread.sleep(3000);
			browserObject.findElement(DenDual_RadioBtn).click();
			Thread.sleep(5000);

			int QuoteCount = browserObject.findElements(DentalChk_Box_Grid_row).size();
			for (int QuoteIndex=0;QuoteIndex<QuoteCount;QuoteIndex++)
			{
				WebElement SingleGrid = browserObject.findElement(DentalRadioGrid);
				List<WebElement> rows = SingleGrid.findElements(By.tagName("tr"));
				List<WebElement> cell = rows.get(0).findElements(By.tagName("td"));
				String Quote= cell.get(QuoteIndex).getText();
					for(int i=0; i<Quote.length();i++) 
					{
						if (Quote.equalsIgnoreCase(DenQuotes))
						{
							Thread.sleep(5000);
							cell.get(QuoteIndex).click();
							Thread.sleep(5000);
						}
					}					
			}
			
			
			browserObject.findElement(SubmitDentQuoteBtn).click();
			
		}
		
		//dual+
	
		if (DualChoicePlus.equalsIgnoreCase("Yes"))
		{
			Thread.sleep(3000);
			browserObject.findElement(DenDualPlus_RadioBtn).click();
			Thread.sleep(5000);

			
			int QuoteCount = browserObject.findElements(DentalChk_Box_Grid_row).size();
			for (int QuoteIndex=0;QuoteIndex<QuoteCount;QuoteIndex++)
			{
				WebElement SingleGrid = browserObject.findElement(DentalRadioGrid);
				List<WebElement> rows = SingleGrid.findElements(By.tagName("tr"));
				List<WebElement> cell = rows.get(0).findElements(By.tagName("td"));
				String Quote= cell.get(QuoteIndex).getText();
					for(int i=0; i<Quote.length();i++) 
					{
						if (Quote.equalsIgnoreCase(DenQuotes))
						{
							Thread.sleep(5000);
							cell.get(QuoteIndex).click();
							Thread.sleep(5000);
						}
					}					
			}
			
			
			browserObject.findElement(SubmitDentQuoteBtn).click();
			
		}
		else {
			System.out.print("No Dental Quote(s) radio buttons are selected");
			}
	
	}
	 

	public void UploadFiles() throws InterruptedException
	{			
		Actions actions = new Actions(browserObject);
		
		WebElement BLCov = browserObject.findElement(LifeBasicCov_CheckBox);
		if(BLCov.isSelected())
		{ 
			WebElement uploadBasicLBtn = browserObject.findElement(BasicL_ChooseFile);
			actions.moveToElement(uploadBasicLBtn).click().perform();
			Thread.sleep(5000);
			try {
				Runtime.getRuntime().exec("D:\\git\\CatsAuto\\Autoit\\LifeBasicUpload.exe");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if(browserObject.findElement(BasicL_Upload).isDisplayed())
			{
				Thread.sleep(5000);
				browserObject.findElement(BasicL_Upload).click();
			}	
		}
		
		WebElement volCov = browserObject.findElement(LifeVolCov_CheckBox);
		if(volCov.isSelected())
		{
			WebElement uploadVolBtn = browserObject.findElement(Vol_ChooseFile);
			actions.moveToElement(uploadVolBtn).click().perform();
			Thread.sleep(5000);
			try {
				Runtime.getRuntime().exec("D:\\git\\CatsAuto\\Autoit\\LifeBasicUpload.exe");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if(browserObject.findElement(Vol_Upload).isDisplayed())
			{
				Thread.sleep(5000);
				browserObject.findElement(Vol_Upload).click();
			}
			
		}
		
		WebElement stdCov = browserObject.findElement(STDCov_CheckBox);
		if(stdCov.isSelected())
		{
			WebElement uploadSTDBtn = browserObject.findElement(STD_ChooseFile);
			actions.moveToElement(uploadSTDBtn).click().perform();
			Thread.sleep(5000);
			try {
				Runtime.getRuntime().exec("D:\\git\\CatsAuto\\Autoit\\LifeBasicUpload.exe");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if(browserObject.findElement(STD_Upload).isDisplayed())
			{
				Thread.sleep(5000);
				browserObject.findElement(STD_Upload).click();
			}
		}	
	}
}
