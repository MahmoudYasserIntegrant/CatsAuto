package com.utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class EmpGroupQuotes_Locators {
	
	public WebDriver browserObject ;

	public By GenerateQuote_btn = By.xpath("//*[@id=\"ctl00_DefaultContent_uxPrintCommand\"]");
	public By QuoteDownload_btn = By.xpath("//*[@id=\"ctl00_DefaultContent_uxQuotingDocumentHistoryList_ctl02_uxDownload\"]");
	
}
