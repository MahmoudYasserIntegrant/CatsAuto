package com.utility;

import org.openqa.selenium.By;

public class GroupDetailsLocators {
	
	

	public By CustName_txt = By.xpath("//*[@id=\"ctl00_DefaultContent_uxCustomerNameField\"]");
	
	public By Address1_txt = By.id("ctl00_DefaultContent_uxAddressOneField");
	
	public By Address2_txt = By.id("ctl00_DefaultContent_uxAddressTwoField");
	
	public By Zipcode_txt = By.id("ctl00_DefaultContent_uxZipCodeField");
	
	public By PplPayrollNum_txt = By.id("ctl00_DefaultContent_uxNumberOfPeopleOnPayrollField");
	
	public By SICCode_txt = By.id("ctl00_DefaultContent_uxSicCodeField");
	
	public By SICLookupBtn = By.id("ctl00_DefaultContent_uxSicLookupCommand");
	
	public By CoverageSelTable = By.id("ctl00_DefaultContent_uxCoverageLineCheckBoxList");
	
	public By NextBtn = By.name("ctl00$DefaultContent$uxCustomerDetailsSaveBar$uxSaveAndNew");
	
	public By SelAll_Chk = By.xpath("//*[@id=\"ctl00_DefaultContent_uxSelectAllCoveragesLinesList\"]");
	
	
	

	

}
