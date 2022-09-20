package pages;



import org.openqa.selenium.WebDriver;


import com.utility.GroupEnrollLocators;

public class GroupEnrollmentScreen extends GroupEnrollLocators{
	
	
	public GroupEnrollmentScreen(WebDriver browserObject) {
		
		this.browserObject= browserObject;
	}
	
	
	
	public void selectcov(String DentalCov, String VisionCov , String BasicLifeCov , String VolCov , String STDCov ) 
	{
		if (DentalCov.equalsIgnoreCase(dentalCov))
		{
			browserObject.findElement(DentalCov_CheckBox).isSelected();
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else 
			{
				browserObject.findElement(DentalCov_CheckBox).click();
			}
	
		if(VisionCov.equalsIgnoreCase(visionCov))
		{
			browserObject.findElement(VisionCov_CheckBox).isSelected();
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else 
			{
				browserObject.findElement(VisionCov_CheckBox).click();
			}
		
		if(BasicLifeCov.equalsIgnoreCase(BLCov))
		{
			browserObject.findElement(LifeBasicCov_CheckBox).isSelected();
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else
			{
				browserObject.findElement(LifeBasicCov_CheckBox).click();
			}
		
		if(VolCov.equalsIgnoreCase(volCov))
		{
			browserObject.findElement(LifeVolCov_CheckBox).isSelected();
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else
			{
				browserObject.findElement(LifeVolCov_CheckBox).click();
			}
		
		if(STDCov.equalsIgnoreCase(stdCov))
		{
			browserObject.findElement(STDCov_CheckBox).click();
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else 
			{
				browserObject.findElement(STDCov_CheckBox).click();
			}
	
	}

}
