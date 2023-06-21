package org1.PageObject.RegisterUser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AccountVerify {
	WebDriver driver;

	  public AccountVerify(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    // Verify that account created is visible
	@FindBy(xpath="//b[normalize-space()='Account Created!']")
	public WebElement accountcreatedverify;
	
	// Click 'Continue' button
	@FindBy(xpath="//a[@class='btn btn-primary']")
	public WebElement continueButtonclick;

	
	public void AccountButtonVerify() 
	{
		System.out.println(accountcreatedverify.isDisplayed());
    	Assert.assertTrue(accountcreatedverify.isDisplayed(),("ACCOUNT CREATED!"));
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
    	
    	continueButtonclick.click();
	}

}
