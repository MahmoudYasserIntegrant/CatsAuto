package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageLocators {
	
	public WebDriver browserObject ;
	
	public String URL = "http://10.1.22.181/HIAS_Agent/loblogonview.aspx?ReturnUrl=%2fHIAS_Agent%2fPublicPolicy%2fSoldGroupsView.aspx";
	public By Usernamepath = By.xpath("//input[@id='ctl00_DefaultContent_uxUserNameField']");
	public By Passwordpath = By.xpath("//input[@type='password']");

}
