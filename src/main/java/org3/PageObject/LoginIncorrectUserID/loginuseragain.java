package org3.PageObject.LoginIncorrectUserID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginuseragain {
	
	WebDriver driver;

	  public loginuseragain(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	// Click on sign up/login button 
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	public WebElement clickbutton1;
	
	// verify "Login to your account" visible
	@FindBy(xpath="//h2[normalize-space()='Login to your account']")
	public WebElement loginvisible;

	
    // Enter correct email address and password [that was used for creating the registration flow]
	@FindBy(xpath="//input[@name='email']")
	public WebElement enteremail;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement enterpass;

	
    // Click 'login' button
	@FindBy(xpath= "//button[normalize-space()='Login']")
	public WebElement clickloginbutton;
	
	
    public void HomePagesignup2()
	{
    	clickbutton1.click();
	}
    public void VisiblesignupCheck2()
    {
    	System.out.println(loginvisible.isDisplayed());
    	Assert.assertTrue(loginvisible.isDisplayed(),("Login to your account"));
    }
    public void enteremailandpassword2()
    {
    	enteremail.sendKeys("visalk3@gmail.com");
    	enterpass.sendKeys("Vishu@51");
    }
    public void loginclick2() 
    {
    	clickloginbutton.click();
    }
}
