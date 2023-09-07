package org.stepDefinations;

import java.util.ArrayList;

import org.hooks.AppHooks;
import org.openqa.selenium.WebDriver;
import org.pages.AdminPage;
import org.pages.LoginPage;
import org.testng.Assert;
import org.utilities.BaseUtility;
import org.utilities.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AdminStepDef {
	
	public static WebDriver driver;
	private AdminPage ap;
	

	
	
	@Given("user_is_on_Admin_module_page")
	public void user_is_on_Admin_module_page() {
		 
		ap = new AdminPage(AppHooks.driver);
	}
	
	@When("Enter LoginPageee Username_field")
	public void enter_login_pageee_username_field() {
	   
	  ap.placeholder_Username_inputField();
	
	}
	
	
	
	
	
	
	@When("Enter LoginPageee submitBtn")
	public void enter_login_pageee_submit_btn() {
	ap.submitBtn();
	}
	
	
    
    @When("Enter LoginPageee Password_field")
    public void enter_login_pageee_password_field() {
        ap.placeholder_Password_inputField();
    }
    
    @When("Click JobBtn")
    public void click_JobBtn() {
       
    	ap.JobBtn();
    }
    
    @When("Click Job_TitlesBtn")
    public void click_Job_TitlesBtn() {
       
    	ap.Job_TitlesBtn();
    }
  
    @When("Click Job_CategoriesBtn")
    public void click_Job_CategoriesBtn() {
       
    	ap.Job_CategoriesBtn();
    }
    
    @When("Click Pay_GradesBtn")
    public void click_Pay_GradesBtn() {
       
    	ap.Pay_GradesBtn();
    }
    @When("Click Employment_StatusBtn")
    public void click_Employment_StatusBtn() {
       
    	ap.Employment_StatusBtn();
    }
    
    @When("Click Work_ShiftsBtn")
    public void Work_ShiftsBtn() {
       
    	ap.Work_ShiftsBtn();
    }
    
    
    
    @When("Click General_InformationBtn")
    public void click_General_InformationBtn() {
       
    	ap.General_InformationBtn();
    }
    
    
    @When("Click OrganizationBtn")
    public void click_OrganizationBtn() {
       
    	ap.OrganizationBtn();
    }
    
    @When("Click StructureBtn")
    public void click_StructureBtnBtn() {
       
    	ap.StructureBtn();
    }
    
    
    @When("Click LocationsBtn")
    public void click_LocationsBtnBtn() {
       
    	ap.LocationsBtn();
    }
    
    @When("Click LDAP_Configuration")
    public void click_LDAP_Configuration() {
       
    	ap.LDAP_Configuration();
    }
    
    
    @When("Click ConfigurationBtn")
    public void click_ConfigurationBtn() {
       
    	ap.ConfigurationBtn();
    }
    
    @When("Click Email_Configurationbtn")
    public void click_Email_Configurationbtn() {
       
    	ap.Email_Configurationbtn();
    }
    
    @When("Click EmailSubscriptionsbth")
    public void click_EmailSubscriptionsbth() {
       
    	ap.EmailSubscriptionsbth();
    }
   
    @When("Click Localization")
    public void click_Localization() {
       
    	ap.Localization();
    }
    
    @When("Click Language_Packages")
    public void click_Language_Packages() {
       
    	ap.Language_Packages();
    }
    @When("Click Modules")
    public void click_Modules() {
       
    	ap.Modules();
    }
    
    @When("Click Social_Media_Authentication")
    public void click_Social_Media_Authentication() {
       
    	ap.Social_Media_Authentication();
    }
    
    
    
    @When("Click Register_OAuth_Client")
    public void click_Register_OAuth_Client() {
       
    	ap.Register_OAuth_Client();
    }
    
    
    
    
    @When("Click Admin_module")
    public void click_admin_module() {
       
    	ap.AdminBtn();
    }
    
    @When("Click QualificationsBtn")
    public void click_QualificationsBtn() {
       
    	ap.QualificationsBtn();
    }
    
    
    
    @When("Click SkillsBtn")
    public void click_SkillsBtn() {
       
    	ap.SkillsBtn();
    }
    

    @When("Click EducationBtn")
    public void click_EducationBtn() {
       
    	ap.EducationBtn();
    }

    @When("Click LicensesBtn")
    public void click_LicensesBtn() {
       
    	ap.LicensesBtn();
    }

    @When("Click LangesBtn")
    public void click_LangesBtn() {
       
    	ap.LanguagesBtn();
    }

    @When("Click membershipBtn")
    public void click_membershipBtn() {
       
    	ap.MembershipsBtn();
    }
    
    
    
    
    
    
    
    
    @When("Click UserBtn")
    public void click_UserBtn() {
       
    	ap.UserBtn();;
    }
    
  
    
    @When("Click Save_Btn")
    public void click_UserRoll() {
       
    	ap.UserRoll();
    }
    
    
    
    @When("Click SystemUser_ADD_BTN")
    public void SystemUser_ADD_BTN() {
       
    	ap.SystemUser_ADD_BTN();
    }
  
   
    @When("Click User_ManagementBtn")
    public void click_User_ManagementBtn() {
       
    	ap.User_ManagementBtn();
    }
    
    
    @Then("ADDUsers_labels page has {string},{string},{string},{string},{string},{string}")
    public void ADDUsers_labels_page_has(String tag1, String tag2, String tag3, String tag4,String tag5,String tag6) {
       
    	ArrayList<String> ele=ap.ADDUsers_labels();
    	
    	AppHooks.ac.assertEquals(ele.get(0), tag1);

    	AppHooks.ac.assertEquals(ele.get(1), tag2);

    	AppHooks.ac.assertEquals(ele.get(2), tag3);

    	AppHooks.ac.assertEquals(ele.get(3), tag4);
    	
    	AppHooks.ac.assertEquals(ele.get(4), tag5);
    	
    	AppHooks.ac.assertEquals(ele.get(5), tag6);
    	
    	
    	
    }
    
    @Then("System_Users_labels page has {string},{string},{string},{string}")
    public void system_users_labels_page_has(String tag1, String tag2, String tag3, String tag4) {
       
    	ArrayList<String> ele=ap.System_Users_labels();
    	
    	AppHooks.ac.assertEquals(ele.get(0), tag1);

    	AppHooks.ac.assertEquals(ele.get(1), tag2);

    	AppHooks.ac.assertEquals(ele.get(2), tag3);

    	AppHooks.ac.assertEquals(ele.get(3), tag4);
    	
    	
    	
    }
    
    
    
    
    
    
   
    @Then("Qualifications_navOption page has {string},{string},{string},{string},{string}")
    public void Qualifications_navOption_module_page_has(String tag1, String tag2, String tag3, String tag4, String tag5)
    {
    
    	ArrayList<String> ele= ap.Qualifications_navOption();
    	AppHooks.ac.assertEquals(ele.get(0),tag1);
    	AppHooks.ac.assertEquals(ele.get(1),tag2);
    	AppHooks.ac.assertEquals(ele.get(2),tag3);
    	AppHooks.ac.assertEquals(ele.get(3),tag4);
    	AppHooks.ac.assertEquals(ele.get(4),tag5);
    	
    	
    	
    }
    
    
    
    @Then("ConfigurationModule page has {string},{string},{string},{string},{string},{string},{string},{string}")
    public void configuration_module_page_has(String tag1, String tag2, String tag3, String tag4, String tag5,String tag6,String tag7,String tag8)
    {
    	ArrayList<String> ele=ap.Admin_ConfigurationOption();
    	AppHooks.ac.assertEquals(ele.get(0),tag1);
    	AppHooks.ac.assertEquals(ele.get(1),tag2);
    	AppHooks.ac.assertEquals(ele.get(2),tag3);
    	AppHooks.ac.assertEquals(ele.get(3),tag4);
    	AppHooks.ac.assertEquals(ele.get(4),tag5);
    	AppHooks.ac.assertEquals(ele.get(5),tag6);
    	AppHooks.ac.assertEquals(ele.get(6),tag7);
    	AppHooks.ac.assertEquals(ele.get(7),tag8);
    	
    	
        
    
    }
    @Then("AdminModule page has {string},{string},{string},{string},{string}")
    public void AdminModule_page_has(String tag1, String tag2, String tag3, String tag4, String tag5) {
       
    	  ArrayList<String> element= ap.Admin_navOptionname();
    	  
    	 AppHooks.ac.assertEquals(element.get(0),tag1); 
    	 AppHooks.ac.assertEquals(element.get(1),tag2); 
    	 AppHooks.ac.assertEquals(element.get(2),tag3); 
    	 AppHooks.ac.assertEquals(element.get(3),tag4); 
    	 AppHooks.ac.assertEquals(element.get(4),tag5); 
    	 
    	  
    }

    @Then("JobModule page has {string},{string},{string},{string},{string}")
    public void JobModule_page_has(String tag1, String tag2, String tag3, String tag4, String tag5) {
       
    	  ArrayList<String> element= ap.AdminJobOptions();
    	  
    	 AppHooks.ac.assertEquals(element.get(0),tag1);  //true
    	 AppHooks.ac.assertEquals(element.get(1),tag2); 
    	 AppHooks.ac.assertEquals(element.get(2),tag3); 
    	 AppHooks.ac.assertEquals(element.get(3),tag4); 
    	 AppHooks.ac.assertEquals(element.get(4),tag5); 
    	 
    	  
    }

   
    @Then("OrganizationModule page has {string},{string},{string}")
    public void OrganizationModule_page_has(String tag1, String tag2, String tag3) {
       
    	  ArrayList<String> element= ap.Admin_organizationOption();
    	  
    	 AppHooks.ac.assertEquals(element.get(0),tag1); 
    	 AppHooks.ac.assertEquals(element.get(1),tag2); 
    	 AppHooks.ac.assertEquals(element.get(2),tag3); 
    	
    	  
    }

   
    
    
    @Then("varify DashboadPagee {string} IsDisplayed {string}")
    public void varify_dashboad_pagee_is_displayed(String http, String val) {
        
    	if(http.equalsIgnoreCase("Url"))
        {
       	 AppHooks.ac.assertEquals(ap.CurrentUrl(), val);
       	 AppHooks.ac.assertAll();
        }
        else if(http.equalsIgnoreCase("Title"))
        {
       	 AppHooks.ac.assertEquals(ap.Title(), val);
       	 AppHooks. ac.assertAll();
        }        
        else if(http.equalsIgnoreCase("dashboadTxt"))
        {
       	 AppHooks.ac.assertEquals(ap.dashboadTxt(), val);
       	 AppHooks.ac.assertAll();
        }
    	
    }
         
         
       
  
        
}
	
	
	
	
	
	
	
