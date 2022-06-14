package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgentsAssignment_Locators {
	
public WebDriver browserObject ;
	
	public By AgentLookup_Btn = By.id("ctl00_DefaultContent_uxShowLookupAgentCommand");
    public By Done_Btn = By.id("ctl00_DefaultContent_uxAgentsAssignmentSaveBar_uxSaveAndClose");
    
	//Agent Lookup pop-up Locators
    public By AgentLookup_Container = By.id("ctl00_DefaultContent_uxAgentLookupContainer");
	public By LicenseNo_Text = By.id("ctl00_DefaultContent_uxLicenseNumberField");
    public By States_List = By.id("ctl00_DefaultContent_uxStatesList");
    public By AgentLookup2_Btn = By.id("ctl00_DefaultContent_uxLookupAgentCommand");
    public By AgentName = By.id("ctl00_DefaultContent_uxAgentNameField");
    public By SelectAgent_Btn = By.id("ctl00_DefaultContent_uxAgentLookupSaveBar_uxSaveAndClose");

}
