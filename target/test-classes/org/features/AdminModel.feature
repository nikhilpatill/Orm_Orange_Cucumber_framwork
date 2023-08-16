
Feature: Login Functionality

 
   Scenario: verify Dashboad page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"
    Then varify DashboadPagee "Title" IsDisplayed "OrangeHRM"
    Then varify DashboadPagee "dashboadTxt" IsDisplayed "Dashboard"
       

   Scenario: verify Dashboad page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    Then varify DashboadPagee "Url" IsDisplayed "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers"
  
   
   Scenario: verify Admin page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    Then AdminModule page has "User Management","Job","Organization ","Qualifications","More"   
    
  
   Scenario: verify AdminPage in JobModule page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click JobBtn 
    Then JobModule page has "Job Titles","Pay Grades","Employment Status","Job Categories","Work Shifts"
    
       
   Scenario: verify AdminPage in OrganizationModule page
    Given user_is_on_Admin_module_page
    When Enter LoginPageee Username_field
    When Enter LoginPageee Password_field
    When Enter LoginPageee submitBtn
    When Click Admin_module 
    When Click OrganizationBtn 
    Then OrganizationModule page has "General Information","Locations","Structure"