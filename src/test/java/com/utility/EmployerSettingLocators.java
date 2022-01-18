package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class EmployerSettingLocators {
	

	
	public WebDriver browserObject ;


	public By SendLettersByMailYesRadioBtn = By.xpath("//input[@id='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxSendLettersbyMailOption_0']");
	public By SendLettersByMailYestitle = By.xpath("//label[@for='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxSendLettersbyMailOption_0']");
	public By SendLettersByMailNoRadioBtn = By.xpath("//input[@id='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxSendLettersbyMailOption_1']");
	
	
	public By SendInvoiceByMailYesRadioBtn = By.xpath("//input[@id='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxSendInvoicesbyMailOption_0']");
	public By SendInvoicesByMailYestitle = By.xpath("//label[@for='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxSendInvoicesbyMailOption_0']");
	public By SendInvoicesByMailNoRadioBtn = By.xpath("//input[@id='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxSendInvoicesbyMailOption_1']");
	
	public By OptOutEmailNotificationYesRadioBtn = By.xpath("//input[@id='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxOptOutOfEmailOption_0']");
	public By OptOutEmailNotificationYestitle = By.xpath("//label[@for='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxOptOutOfEmailOption_0']");
	public By OptOutEmailNotificationNoRadioBtn = By.xpath("//input[@id='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxOptOutOfEmailOption_1']");
	
	public By DisableACHRadioBtn = By.xpath("//input[@id='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxEnableOrDisableAchOption_1']");
	public By EnableACHTitle = By.xpath("//label[@for='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxEnableOrDisableAchOption_0']");
	public By EnableACHRadioBtn = By.xpath("//input[@id='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxEnableOrDisableAchOption_0']");
	public By BankRoutingNumTextBox = By.name("ctl00$DefaultContent$uxPrimaryGroupCensusUserControl$uxEmployerGroupSettingsControl$uxABANumberField");
	public By BankAccountNumTextBox = By.name("ctl00$DefaultContent$uxPrimaryGroupCensusUserControl$uxEmployerGroupSettingsControl$uxAccountNumberField");
	public By ReenterBankAccountNumTextBox = By.name("ctl00$DefaultContent$uxPrimaryGroupCensusUserControl$uxEmployerGroupSettingsControl$uxReEnterAccountNumberField");

	public By BankAccountTypeDDL = By.name("ctl00$DefaultContent$uxPrimaryGroupCensusUserControl$uxEmployerGroupSettingsControl$uxAccountTypeList");

	public By Datecal = By.xpath("//a[@title='Go to the next month']");
	public By CalendarTable  = By.xpath("//table[@id='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxMonthlyACHDebitDateCalendar']");
	

	public By IAuthorizeYesRadioBtn = By.xpath("//input[@id='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxIsSignedOption_0']");
	public By IAuthorizeNotitle = By.xpath("//label[@for='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxIsSignedOption_1']");
	public By IAuthorizeNoRadioBtn = By.xpath("//input[@id='ctl00_DefaultContent_uxPrimaryGroupCensusUserControl_uxEmployerGroupSettingsControl_uxIsSignedOption_1']");
	
	public By EmpGrpSettingsSaveBtn = By.name("ctl00$DefaultContent$uxPrimaryGroupCensusUserControl$uxEmployerGroupSettingsControl$uxEmployerGroupSettingsSaveAndExitCommand");
	

}
