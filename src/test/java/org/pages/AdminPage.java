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
	
	@FindBy(xpath ="//nav[@role=\"navigation\"]/ul/li[2]/span[text()=\"Job\"]")
	private WebElement JobBtn;
	

	@FindBy(xpath ="//nav[@role=\"navigation\"]/ul/li[3]/span[text()=\"Organization \"]")
	private WebElement OrganizationBtn;
	
	
	
	@FindBy(xpath = "//nav[@role=\"navigation\"]/ul/li")
	private List<WebElement> Admin_navOption;
	
	@FindBy(xpath = "//ul[@role=\"menu\"]/li")
	private List<WebElement> AdminJobOptions;
	
	@FindBy(xpath = "//ul[@role=\"menu\"]/li")
	private List<WebElement> Admin_organizationOption;
	
	

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
	
	public void  JobBtn()
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//nav[@role=\"navigation\"]/ul/li[2]");
		//SJobBtn.click();
		bu.clickByJS(driver, AdminBtn);
		
	}
	
	public void OrganizationBtn()
	{
		wt.waitForclickableWebElement(driver, 35, "xpath","//nav[@role=\"navigation\"]/ul/li[2]");
		//SJobBtn.click();
		bu.clickByJS(driver,OrganizationBtn);
		
	}
	
	
	
	public void  submitBtn()
	{
		submitBtn.click();
		
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
	
	
		
	
	
	
	
	




}
