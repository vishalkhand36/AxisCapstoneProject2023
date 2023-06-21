package org1.PageObject.RegisterUser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignupPage {
	WebDriver driver;

	  public SignupPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	// Click on sign up/login button 
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	public WebElement clickbutton;
			
	// verify "new user sign up!" visible
	@FindBy(xpath="//h2[normalize-space()='New User Signup!']")
	public WebElement signupvisible;
	
	// Enter name and email address
	@FindBy(xpath="//input[@placeholder='Name']")
	public WebElement Entername;
	@FindBy(xpath="//input[@data-qa='signup-email']")
	public WebElement Enteremail;
	
	// Click Sign up Button
	@FindBy(xpath="//button[normalize-space()='Signup']")
	public WebElement ClickSignupButton;


    public void HomePagesignup() throws InterruptedException
	{
    	clickbutton.click();
		Thread.sleep(3000);

    }
    public void VisiblesignupCheck()
    {
    	System.out.println(signupvisible.isDisplayed());
    	Assert.assertTrue(signupvisible.isDisplayed(),("New User Signup!"));
    }
    public void EnterNameEmail()
    {
    	Entername.sendKeys("Vishal Khand");
    	Enteremail.sendKeys("vishalkhand36@gmail.com");
    }
    public void Clickenter()
    {
    	ClickSignupButton.click();
    }
    
	  
}

