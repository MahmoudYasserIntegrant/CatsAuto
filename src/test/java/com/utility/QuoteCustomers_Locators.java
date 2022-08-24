package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuoteCustomers_Locators {
	
	public WebDriver browserObject ;
	
	public By GroupNumber_Link = By.id("ctl00_DefaultContent_uxCustomerList_ctl02_uxCustomerNumberCommand");
	public By QuoteNewGroup_Button = By.id("ctl00_DefaultContent_uxAddCommand");
	public By GroupQuotes_Link = By.xpath("//a[@name='Group Quotes']");
	public By GroupEnrollment_Link = By.xpath("//a[@name='Group Enrollment']");
	
}
