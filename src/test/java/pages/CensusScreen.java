package pages;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.utility.CensusScreenLocators;

public class CensusScreen extends CensusScreenLocators{
	
	
	public CensusScreen(WebDriver browserObject) {
		
		this.browserObject= browserObject;
	}
	
	
  	public void CoverageCountNums (String VisCell1 , String VisCell2 , String VisCell3 , String VisCell4 ,
  			String DenCell1 , String DenCell2 , String DenCell3 , String DenCell4 ,
  			String LBasCell1 ,String LBasCell2,String LBasCell3 ,String LBasCell4 ,
  			String LVolCell1 ,String LVolCell2,String LVolCell3 ,String LVolCell4 ,
			  String STDCell1 ,String STDCell2,String STDCell3 ,String STDCell4,
			  String LTDCell1 ,String LTDCell2,String LTDCell3 ,String LTDCell4,
			  String ADDCell1 ,String ADDCell2,String ADDCell3 ,String ADDCell4)
  	{			
  		WebElement element1 = browserObject.findElement(VisionCell1);
  		 browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
  		 
   		WebElement element2 = browserObject.findElement(VisionCell2);
 		 browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

 		 
   		WebElement element3 = browserObject.findElement(VisionCell3);
 		 browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

 		 
   		WebElement element4 = browserObject.findElement(VisionCell4);
 		 browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
 		 
 		//////////////////////////////////////////////////////////////////////////
 		 
   		WebElement element5 = browserObject.findElement(DentalCell1);
 		 browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

 		 
  		WebElement element6 = browserObject.findElement(DentalCell2);
		 browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

  		WebElement element7 = browserObject.findElement(DentalCell3);
		 browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;


  		WebElement element8 = browserObject.findElement(DentalCell4);
		 browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		 
		 
		 //////////////////////////
		 
		 
	   	WebElement element9 = browserObject.findElement(BasicCell1);
	   	browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

	 		 
	  	WebElement element10 = browserObject.findElement(BasicCell2);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

		WebElement element11 = browserObject.findElement(BasicCell3);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;


	  	WebElement element12 = browserObject.findElement(BasicCell4);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		
		////////////////////////////////////////////////////////////
		
	   	WebElement element13 = browserObject.findElement(VoluntaryCell1);
	   	browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

	 		 
	  	WebElement element14 = browserObject.findElement(VoluntaryCell2);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

		WebElement element15 = browserObject.findElement(VoluntaryCell3);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;


	  	WebElement element16 = browserObject.findElement(VoluntaryCell4);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		
		//////////////////////////////////
		
	   	WebElement element17 = browserObject.findElement(ShortTermDisablilityCell1);
	   	browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

	 		 
	  	WebElement element18 = browserObject.findElement(ShortTermDisablilityCell2);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

		WebElement element19 = browserObject.findElement(ShortTermDisablilityCell3);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;


	  	WebElement element20 = browserObject.findElement(ShortTermDisablilityCell4);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		
		////////////////////////////////////////////////////////////////////////
		
	   	WebElement element21 = browserObject.findElement(LongTermDisablilityCell1);
	   	browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

	 		 
	  	WebElement element22 = browserObject.findElement(LongTermDisablilityCell2);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

		WebElement element23 = browserObject.findElement(LongTermDisablilityCell3);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;


	  	WebElement element24 = browserObject.findElement(LongTermDisablilityCell4);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		
		///////////////////////////////////////////////////////////////////////////////
		
	   	WebElement element25 = browserObject.findElement(ADnDCell1);
	   	browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

	 		 
	  	WebElement element26 = browserObject.findElement(ADnDCell2);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

		WebElement element27 = browserObject.findElement(ADnDCell3);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;


	  	WebElement element28 = browserObject.findElement(ADnDCell4);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

  			
  		  if(element1.isEnabled())
  		  { 	
  			  element1.click();
  			  element1.clear();
  			  element1.sendKeys(VisCell1);
  			  
  			  element2.click();
  			  element2.clear();
  			  element2.sendKeys(VisCell2);
  			  
  			  element3.click();
  			  element3.clear();
  			  element3.sendKeys(VisCell3);
  			  
  			  element4.click();
  			  element4.clear();
  			  element4.sendKeys(VisCell4);

  		  }if (element5.isEnabled()) 
  		  {
  			  element5.click();
  			  element5.clear();
  			  element5.sendKeys(DenCell1);
  			  
  			  element6.click();
  			  element6.clear();
  			  element6.sendKeys(DenCell2);
  			  
  			  element7.click();
  			  element7.clear();
  			  element7.sendKeys(DenCell3);
  			  
  			  element8.click();
  			  element8.clear();
  			  element8.sendKeys(DenCell4);
  			  
  		  }if (element9.isEnabled()) 
  		  {
  			  element9.click();
  			  element9.clear();
  			  element9.sendKeys(LBasCell1);
  			  
  			  element10.click();
  			  element10.clear();
  			  element10.sendKeys(LBasCell2);
  			  
  			  element11.click();
  			  element11.clear();
  			  element11.sendKeys(LBasCell3);
  			  
  			  element12.click();
  			  element12.clear();
  			  element12.sendKeys(LBasCell4);
  			  
  		  }if (element13.isEnabled()) 
  		  {
  			  element13.click();
  			  element13.clear();
  			  element13.sendKeys(LVolCell1);
  			  
  			  element14.click();
  			  element14.clear();
  			  element14.sendKeys(LVolCell2);
  			  
  			  element15.click();
  			  element15.clear();
  			  element15.sendKeys(LVolCell3);
  			  
  			  element16.click();
  			  element16.clear();
  			  element16.sendKeys(LVolCell4);
  		  }if (element17.isEnabled()) 
  		  {
  			  element17.click();
  			  element17.clear();
  			  element17.sendKeys(STDCell1);
  			  
  			  element18.click();
  			  element18.clear();
  			  element18.sendKeys(STDCell2);
  			  
  			  element19.click();
  			  element19.clear();
  			  element19.sendKeys(STDCell3);
  			  
  			  element20.click();
  			  element20.clear();
  			  element20.sendKeys(STDCell4);
  		  }if (element21.isEnabled()) 
		  {
			  element21.click();
			  element21.clear();
			  element21.sendKeys(LTDCell1);
			  
			  element22.click();
			  element22.clear();
			  element22.sendKeys(LTDCell2);
			  
			  element23.click();
			  element23.clear();
			  element23.sendKeys(LTDCell3);
			  
			  element24.click();
			  element24.clear();
			  element24.sendKeys(LTDCell4);
		  }if (element25.isEnabled()) 
		  {
			  element25.click();
			  element25.clear();
			  element25.sendKeys(ADDCell1);
			  
			  element26.click();
			  element26.clear();
			  element26.sendKeys(ADDCell2);
			  
			  element27.click();
			  element27.clear();
			  element27.sendKeys(ADDCell3);
			  
			  element28.click();
			  element28.clear();
			  element28.sendKeys(ADDCell4);
		  }
  		  else {

  			  browserObject.findElement(DoneBtn).click();
  		  }
  		  
  		  
  		  
  		  
  		  

  	}

		
	
	

}
