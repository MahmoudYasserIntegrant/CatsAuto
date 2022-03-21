package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgentLettersLocators {
	
	public WebDriver browserObject ;
	
	public By LetterNameDDL = By.id("ctl00_DefaultContent_uxLetterNameList");
	public By SearchBtn = By.id("ctl00_DefaultContent_uxSearchCommand");
	public By AgentTable = By.id("ctl00_DefaultContent_uxAgentLettersList");
	public By letterlink = By.xpath("//*[@id=\"ctl00_DefaultContent_uxAgentLettersList_ctl02_uxAgentLetterCommand\"]");
	

}
