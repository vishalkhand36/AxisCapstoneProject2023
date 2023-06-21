package org1.PageObject.RegisterUser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageDeleteAcc {
	WebDriver driver;

	  public HomePageDeleteAcc(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Verify that 'Logged in as user name' is visible
	@FindBy(xpath="//b[normalize-space()='Vishal Khand']")
	public WebElement verifyusername;
	
	// Click 'Delete Account' button
	@FindBy(xpath="//a[normalize-space()='Delete Account']")
	public WebElement deleteAccButtton;

	// Verify that 'ACCOUNT DELETED!' is visible
	@FindBy(xpath="//b[normalize-space()='Account Deleted!']")
	public WebElement verifyAccDelete;
	
	// click 'Continue' button
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	public WebElement clickContinue;
	
	

	public void AccountButtonVerify() throws InterruptedException 
	{
		System.out.println(verifyusername.isDisplayed());
    	Assert.assertTrue(verifyusername.isDisplayed(),("Logged in as Vishal Khand"));
    	
    	Thread.sleep(1000);
    	deleteAccButtton.click();
    	
    	System.out.println(verifyusername.isDisplayed());
    	Assert.assertTrue(verifyusername.isDisplayed(),("ACCOUNT DELETED!"));  
    	Thread.sleep(3000);
    	
    	clickContinue.click();
    	Thread.sleep(1000);
    	
	}

}
