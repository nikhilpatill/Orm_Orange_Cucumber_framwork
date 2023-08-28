package org.pages;

import java.util.ArrayList;
import java.util.List;

import org.WaitUtility.WaitGenericMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseUtility;

public class AdminPage {
	private WebDriver driver;
	private BaseUtility bu = new BaseUtility();
	private WaitGenericMethod wt=new WaitGenericMethod();
	
	//1.WebElements
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement placeholder_Username_txt;
	
	@FindBy(xpath ="//input[@placeholder='Password']")
	private WebElement placeholder_Password_txt;
	

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//span[text()=\"Admin\"]")
	private WebElement AdminBtn;
	
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	private WebElement dashboadTxt;
	
	@FindBy(xpath ="//span[text()='User Management ']")
	private WebElement User_ManagementBtn;
	
	@FindBy(xpath ="//a[normalize-space()='Job Titles']")
	private WebElement Job_TitlesBtn;
	
	

	@FindBy(xpath ="//a[@role=\"menuitem\"and text()=\"Pay Grades\"]")
	private WebElement Pay_GradesBtn;
	
		

	@FindBy(xpath ="//a[@role=\"menuitem\"and text()=\"Employment Status\"]")
	private WebElement Employment_StatusBtn;
	
		

	@FindBy(xpath ="//a[@role=\"menuitem\"and text()=\"Job Categories\"]")
	private WebElement Job_CategoriesBtn;
	
	
		

	@FindBy(xpath ="//a[@role=\"menuitem\"and text()=\"Work Shifts\"]")
	private WebElement Work_ShiftsBtn;
	
		

	@FindBy(xpath ="//a[@role=\"menuitem\"and text()=\"Users\"]")
	private WebElement UserBtn;
	

	@FindBy(xpath ="//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
	private WebElement UserRoll;
	
	
	
		
		
	@FindBy(xpath ="//nav[@role=\"navigation\"]/ul/li[2]/span/i")
	private WebElement JobBtn;
	
	
	@FindBy(xpath ="//nav[@role=\"navigation\"]/ul/li[3]/span[text()=\"Organization \"]")
	private WebElement OrganizationBtn;
	
	@FindBy(xpath = "//nav[@role=\"navigation\"]/ul/li[7]/span/i")
	private WebElement ConfigurationBtn;
	
	
	@FindBy(xpath ="//a[@role=\"menuitem\"and text()=\"General Information\"]")
	private WebElement General_InformationBtn;
	
	@FindBy(xpath ="//a[@role=\"menuitem\"and text()=\"Locations\"]")
	private WebElement LocationsBtn;
	
	@FindBy(xpath ="//a[@role=\"menuitem\"and text()=\"Structure\"]")
	private WebElement StructureBtn;
	
	
	
	@FindBy(xpath = "//nav[@role=\"navigation\"]/ul/li[4]/span/i")
	private WebElement QualificationsBtn ;
	
	@FindBy(xpath ="//ul[@role=\"menu\"]/li/a[@role=\"menuitem\"and text()=\"Skills\"]")
	private WebElement SkillsBtn;
	

	@FindBy(xpath ="//ul[@role=\"menu\"]/li/a[@role=\"menuitem\"and text()=\"Education\"]")
	private WebElement EducationBtn;
	

	@FindBy(xpath ="//ul[@role=\"menu\"]/li/a[@role=\"menuitem\"and text()=\"Licenses\"]")
	private WebElement LicensesBtn;
	

	@FindBy(xpath ="//ul[@role=\"menu\"]/li/a[@role=\"menuitem\"and text()=\"Languages\"]")
	private WebElement LanguagesBtn;
	

	@FindBy(xpath ="//ul[@role=\"menu\"]/li/a[@role=\"menuitem\"and text()=\"Memberships\"]")
	private WebElement MembershipsBtn;
	
//	
	@FindBy(xpath ="//div[@data-v-957b4417]/input[@class=\"oxd-input oxd-input--active\"]")
	private WebElement SystemUser_UsernameInputField;
	
	@FindBy(xpath ="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]/i")
	private WebElement SystemUser_ADD_BTN;
	
	
	
	@FindBy(xpath ="//ul[@role=\"menu\"]/li[1]/a")
	private WebElement Email_Configurationbtn;
	
	@FindBy(xpath ="//ul[@role=\"menu\"]/li[2]/a")
	private WebElement EmailSubscriptionsbth ;
	
	@FindBy(xpath ="//ul[@role=\"menu\"]/li[3]/a")
	private WebElement Localization ;
	
	@FindBy(xpath ="//ul[@role=\"menu\"]/li[4]/a")
	private WebElement Language_Packages ;
	
	@FindBy(xpath ="//ul[@role=\"menu\"]/li[5]/a")
	private WebElement Modules ;
	
	@FindBy(xpath ="//ul[@role=\"menu\"]/li[6]/a")
	private WebElement Social_Media_Authentication ;
	
	@FindBy(xpath ="//ul[@role=\"menu\"]/li[7]/a")
	private WebElement Register_OAuth_Client ;
	
	@FindBy(xpath ="//ul[@role=\"menu\"]/li[8]/a")
	private WebElement LDAP_Configuration;
	
	@FindBy(xpath ="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
	private WebElement Save_Btn;
	
	
	
	
	@FindBy(xpath = "//ul[@role=\"menu\"]/li/a")
	private List<WebElement>Qualifications_navOption;
	
	@FindBy(xpath = "//label [@class=\"oxd-label\"]")
	private List<WebElement> System_Users_labels;
	
	@FindBy(xpath = "//label[@class=\"oxd-label oxd-input-field-required\"]")
	private List<WebElement> ADDUsers_labels;
	
	
	
	@FindBy(xpath = "//nav[@role=\"navigation\"]/ul/li")
	private List<WebElement> Admin_navOption;
	
	@FindBy(xpath = "//ul[@role=\"menu\"]/li")
	private List<WebElement> AdminJobOptions;
	
	@FindBy(xpath = "//ul[@role=\"menu\"]/li")
	private List<WebElement> Admin_organizationOption;
	
	
	
	@FindBy(xpath = "//ul[@role=\"menu\"]/li")
	private List<WebElement> Admin_Configuration ;
	
	

	//2.Constructor
	
	public AdminPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver,LoginPage.class);
		//OR
		PageFactory.initElements(driver,this);
	}


	//3.Page Action Methods
	

	
	public String dashboadTxt()
	{
		return dashboadTxt.getText();
		
	}

	

	public String placeholder_Username_txt()
	{
		return placeholder_Username_txt.getText();
		
	}
	
	public void  placeholder_Username_inputField()
	{
	 placeholder_Username_txt.sendKeys("admin");
		
	}
	
	public void  placeholder_Password_inputField()
	{
		 placeholder_Password_txt.sendKeys("admin123");
		
	}

	public String placeholder_Password_txt()
	{
		return placeholder_Password_txt.getText();
		
	}
	
	
	public void Email_Configurationbtn ()                             
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//ul[@role=\"menu\"]/li[1]/a");
		bu.clickByJS(driver,Email_Configurationbtn);
		
	}
	
	
	public void UserRoll ()                             
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]");
		bu.clickByJS(driver,UserRoll);
		
	}
	
	
	
	public void EmailSubscriptionsbth ()                              
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//ul[@role=\"menu\"]/li[2]/a");
		bu.clickByJS(driver,EmailSubscriptionsbth);
		
	}
	
	public void Localization ()                               //nav[@role=\"navigation\"]/ul/li[2]/span[text()=\"Job\"]
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//ul[@role=\"menu\"]/li[3]/a");
		bu.clickByJS(driver,Localization);
		
	}
	
	public void  Language_Packages()                               //nav[@role=\"navigation\"]/ul/li[2]/span[text()=\"Job\"]
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//ul[@role=\"menu\"]/li[4]/a");
		bu.clickByJS(driver,Language_Packages);
		
	}
	
	public void Modules ()                             
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//ul[@role=\"menu\"]/li[5]/a");
		bu.clickByJS(driver,Modules);
		
	}
	
	public void Social_Media_Authentication ()                              
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//ul[@role=\"menu\"]/li[6]/a");
		bu.clickByJS(driver,Social_Media_Authentication);
		
	}
	
	public void Register_OAuth_Client ()                               //nav[@role=\"navigation\"]/ul/li[2]/span[text()=\"Job\"]
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//ul[@role=\"menu\"]/li[7]/a");
		bu.clickByJS(driver,Register_OAuth_Client);
		
	}
	
	public void LDAP_Configuration ()                               //nav[@role=\"navigation\"]/ul/li[2]/span[text()=\"Job\"]
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//ul[@role=\"menu\"]/li[8]/a");
		bu.clickByJS(driver,LDAP_Configuration);
		
	}
	
	
	
	
	
	
	
	
	
	public void  JobBtn()                               //nav[@role=\"navigation\"]/ul/li[2]/span[text()=\"Job\"]
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//nav[@role=\"navigation\"]/ul/li[2]/span/i");
		bu.clickByJS(driver,JobBtn);
		
	}
	
	public void  QualificationsBtn()                               //nav[@role=\"navigation\"]/ul/li[2]/span[text()=\"Job\"]
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//nav[@role=\"navigation\"]/ul/li[4]/span/i");
		bu.clickByJS(driver,QualificationsBtn);
		
	}
	
	public void SkillsBtn ()                              
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//ul[@role=\"menu\"]/li/a[@role=\"menuitem\"and text()=\"Skills\"]");
		bu.clickByJS(driver,SkillsBtn);
		
	}
	
	public void Save_Btn()                              
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
		bu.clickByJS(driver,Save_Btn);
		
	}
	
	
	public void  EducationBtn()                              
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//ul[@role=\"menu\"]/li/a[@role=\"menuitem\"and text()=\"Education\"]");
		bu.clickByJS(driver,EducationBtn);
		
	}
	
	public void  LanguagesBtn()                              
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//ul[@role=\"menu\"]/li/a[@role=\"menuitem\"and text()=\"Languages\"]");
		bu.clickByJS(driver,LanguagesBtn);
		
	}
	public void LicensesBtn()                              
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//ul[@role=\"menu\"]/li/a[@role=\"menuitem\"and text()=\"Licenses\"]");
		bu.clickByJS(driver,LicensesBtn);
		
	}
	public void MembershipsBtn ()                              
	{
		wt.waitForclickableWebElement(driver, 55, "xpath","//ul[@role=\"menu\"]/li/a[@role=\"menuitem\"and text()=\"Memberships\"]");
		//bu.clickByJS(driver,MembershipsBtn);
		bu.clickByActions(driver,MembershipsBtn );
	}
	
	
	public void  ConfigurationBtn()
	{
		wt.waitForclickableWebElement(driver, 35, "xapth", "//nav[@role=\"navigation\"]/ul/li[7]/span/i");
		bu.clickByJS(driver, ConfigurationBtn);
		
	}
	
	
	
	public void OrganizationBtn()
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//nav[@role=\"navigation\"]/ul/li[3]/span/i");
		bu.clickByJS(driver,OrganizationBtn);
		
	}
	
	public void  User_ManagementBtn()
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//span[text()='User Management ']");
		bu.clickByJS(driver,User_ManagementBtn);
		
		
	}
	
	public void  UserBtn()
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//a[@role=\"menuitem\"and text()=\"Users\"]");
		bu.clickByJS(driver,UserBtn);
		
		
	}
	
	
	public void Job_TitlesBtn()
	{
		wt.waitForclickableWebElement(driver, 50, "xpath","//a[normalize-space()='Job Titles']");
		bu.clickByJS(driver,Job_TitlesBtn);
		
		
		
	}
	
	
	public void Pay_GradesBtn ()
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//a[@role=\"menuitem\"and text()=\"Pay Grades\"]");
		bu.clickByJS(driver,Pay_GradesBtn);
		
		
	}
	
	public void Employment_StatusBtn ()
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//a[@role=\"menuitem\"and text()=\"Employment Status\"]");
		bu.clickByJS(driver,Employment_StatusBtn);
		
		
	}
	
	public void Job_CategoriesBtn ()
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//a[@role=\"menuitem\"and text()=\"Job Categories\"]");
		bu.clickByJS(driver,Job_CategoriesBtn);
		
		
	}
	
	public void Work_ShiftsBtn()
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//a[@role=\"menuitem\"and text()=\"Work Shifts\"]");
		bu.clickByJS(driver,Work_ShiftsBtn);
		
		
	}
	
	
	public void General_InformationBtn()
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//a[@role=\"menuitem\"and text()=\"General Information\"]");
		bu.clickByJS(driver,General_InformationBtn);
		
		
	}
	
	public void LocationsBtn()
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//a[@role=\"menuitem\"and text()=\"Locations\"]" );
		bu.clickByJS(driver,LocationsBtn);
		
		
	}
	
	public void StructureBtn()
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//a[@role=\"menuitem\"and text()=\"Structure\"]");
		bu.clickByJS(driver,StructureBtn);
		
		
	}
	
	
	
	
	public void  submitBtn()
	{
		submitBtn.click();
		
	}
	
	public void  SystemUser_ADD_BTN()
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]/i");
		bu.clickByJS(driver,SystemUser_ADD_BTN);
		
		
		
	}
	

	public void  AdminBtn()
	{
		AdminBtn.click();
		
	}
	
	public String CurrentUrl()
	{
		return driver.getCurrentUrl();
		
		
		
	}
	
	public String Title()
	{
		return driver.getTitle();
		
		
		
	}
	
	
	public ArrayList<String> Admin_navOptionname()
	{
		
		return bu.getAllTextFromList(Admin_navOption);
		
		
		
	}
	
	public ArrayList<String> AdminJobOptions()
	{
		return bu.getAllTextFromList(AdminJobOptions);
		
	}
	
	public ArrayList<String> Admin_organizationOption()
	{
		return bu.getAllTextFromList(Admin_organizationOption);
		
	}
	
	
		
	
	public ArrayList<String> Admin_ConfigurationOption()
	{
		return bu.getAllTextFromList(Admin_Configuration);
		
	}
	
	
	public ArrayList<String> Qualifications_navOption()
	{
		return bu.getAllTextFromList(Qualifications_navOption);
		
	}
	
	public ArrayList<String> System_Users_labels()
	{
		return bu.getAllTextFromList(System_Users_labels);
		
	}
	
	public ArrayList<String> ADDUsers_labels()
	{
		return bu.getAllTextFromList(ADDUsers_labels);
		
	}

	

}
