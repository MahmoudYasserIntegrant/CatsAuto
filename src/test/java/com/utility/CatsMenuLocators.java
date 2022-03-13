package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CatsMenuLocators {
	
	
	public WebDriver browserObject ;

	//CATS Menu Page Locators

		public Actions Action;
		public By SoldGroups = By.xpath("//*[@id=\"ctl00_uxMenun1\"]/table/tbody/tr/td/a");
		public By GroupNumberTextBox = By.name("ctl00$DefaultContent$uxSoldGroupNumberField");
		public By SoldGroupsSearchBtn = By.name("ctl00$DefaultContent$uxSearchCommand");
		public By SoldGroupsEnrollmentHyberLink = By.id("ctl00_DefaultContent_uxSoldGroupsList_ctl02_uxEnrollmentCommand");
		public By EmployerGroupSettingsBtn = By.id("ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsCommand");
		public By AgentLetters = By.xpath("//*[@id=\"ctl00_uxMenun5\"]/table/tbody/tr/td/a");

}
