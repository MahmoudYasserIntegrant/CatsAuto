package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPageLocators {
	
	public WebDriver browserObject ;
	
	public String URL = "http://10.1.22.181/HIAS_Agent/loblogonview.aspx";
	public By Usernamepath = By.id("ctl00_DefaultContent_uxUserNameField");
	public By Passwordpath = By.xpath("//input[@type='password']");
	

    /*public WebElement getElement(String objectName,String locator) throws Exception
    {
        WebElement temp = null;
        if(locator.equalsIgnoreCase("id"))
        {
            temp = browserObject.findElement(By.id(objectName));
            return temp;
        }else if(locator.equalsIgnoreCase("xpath")) {
            temp = browserObject.findElement(By.xpath(objectName)); 
            return temp;
        }else if(locator.equalsIgnoreCase("name")){
            temp= browserObject.findElement(By.name(objectName));
            return temp;
        }
        return temp;
    }*/

}
