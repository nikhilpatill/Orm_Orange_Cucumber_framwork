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
    
    @When("Click OrganizationBtn")
    public void click_OrganizationBtn() {
       
    	ap.OrganizationBtn();
    }
    
    @When("Click Admin_module")
    public void click_admin_module() {
       
    	ap.AdminBtn();
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
    	  
    	 AppHooks.ac.assertEquals(element.get(0),tag1); 
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
	
	
	
	
	
	
	
