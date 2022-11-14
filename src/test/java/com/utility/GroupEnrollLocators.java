package com.utility;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GroupEnrollLocators {
	
	public WebDriver browserObject ;


	public By DentalCov_CheckBox = By.xpath("//input[@id='ctl00_DefaultContent_uxChkDental']");
	public By VisionCov_CheckBox = By.xpath("//input[@id='ctl00_DefaultContent_uxChkVision']");
	public By LifeBasicCov_CheckBox = By.name("ctl00$DefaultContent$uxChkBasicLife");
	public By LifeVolCov_CheckBox = By.xpath("//input[@id='ctl00_DefaultContent_uxChkVoluntaryLife']");
	public By STDCov_CheckBox = By.xpath("//input[@id='ctl00_DefaultContent_uxChkSTD']");
	public By Quote_Document_Grid  = By.xpath("//table[@id='ctl00_DefaultContent_uxQuotingDocumentHistoryList']");
	public By Quote_Document_Grid_Row  = By.xpath("//table[@id='ctl00_DefaultContent_uxQuotingDocumentHistoryList']//tr");
	
	
	public By DenSingle_RadioBtn = By.xpath("//input[@id='ctl00_DefaultContent_uxRblDentalQoutes_0']");
	public By DenDual_RadioBtn = By.xpath("//input[@id='ctl00_DefaultContent_uxRblDentalQoutes_1']");
	public By DenDualPlus_RadioBtn = By.xpath("//input[@id='ctl00_DefaultContent_uxRblDentalQoutes_2']");
	
	public By DentalRadioGrid  = By.xpath("//table[@id='ctl00_DefaultContent_uxChKDentalQoutes']");
	public By DentalChk_Box_Grid_row  = By.xpath("//table[@id='ctl00_DefaultContent_uxChKDentalQoutes']//tr//td");
	
	public By SubmitDentQuoteBtn  = By.id("ctl00_DefaultContent_uxSubmitDentalQoutesCommand");
	
	public By BasicL_ChooseFile  = By.xpath("//input[@id='ctl00_DefaultContent_uxFileUploadBasicLifeControl']");
	public By Vol_ChooseFile  = By.xpath("//input[@id='ctl00_DefaultContent_uxFileUploadVoluntaryLifeControl']");
	public By STD_ChooseFile  = By.xpath("//input[@id='ctl00_DefaultContent_uxFileUploadSTDControl']");

	public By BasicL_Upload  = By.xpath("//input[@id='ctl00_DefaultContent_uxSubmitBasicLifeQuote']");
	public By Vol_Upload  = By.xpath("//input[@id='ctl00_DefaultContent_uxSubmitVoluntaryLifeQuote']");
	public By STD_Upload  = By.xpath("//input[@id='ctl00_DefaultContent_uxSubmitSTDQuote']");
	
	
	
	


	
	
	
	
	

}
