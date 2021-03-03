package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class Locators_Repo {
	
	public WebDriver browserObject ;

	//CATS Menu Page Locators

		public Actions Action;
		public By SoldGroups = By.xpath("//*[@id=\"ctl00_uxMenun1\"]/table/tbody/tr/td/a");
		public By GroupNumberTextBox = By.name("ctl00$DefaultContent$uxSoldGroupNumberField");
		public By SoldGroupsSearchBtn = By.name("ctl00$DefaultContent$uxSearchCommand");
		public By SoldGroupsEnrollmentHyberLink = By.id("ctl00_DefaultContent_uxSoldGroupsList_ctl02_uxEnrollmentCommand");
		public By EmployerGroupSettingsBtn = By.id("ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsCommand");
		
	//CATSLogin Page Locators
	public String URL = "http://10.1.22.181/HIAS_Agent/loblogonview.aspx?ReturnUrl=%2fHIAS_Agent%2fPublicPolicy%2fSoldGroupsView.aspx";
	public By Usernamepath = By.xpath("//input[@id='ctl00_DefaultContent_uxUserNameField']");
	public By Passwordpath = By.xpath("//input[@type='password']");
	
	
	
	

}
