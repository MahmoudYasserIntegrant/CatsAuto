package com.utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupEnrollLocators {
	
	public WebDriver browserObject ;
	
	
	public String dentalCov  = "1";
	public String visionCov  = "1";
	public String BLCov  = "1";
	public String volCov  = "1";
	public String stdCov  = "1";

	public By DentalCov_CheckBox = By.xpath("//input[@id='ctl00_DefaultContent_uxChkDental']");
	
	public By VisionCov_CheckBox = By.xpath("//input[@id='ctl00_DefaultContent_uxChkVision']");
	
	public By LifeBasicCov_CheckBox = By.xpath("//input[@id='ctl00_DefaultContent_uxChkBasicLife']");
	
	public By LifeVolCov_CheckBox = By.xpath("//input[@id='ctl00_DefaultContent_uxChkVoluntaryLife']");
	
	public By STDCov_CheckBox = By.xpath("//input[@id='ctl00_DefaultContent_uxChkSTD']");
	
	
	
	

}
