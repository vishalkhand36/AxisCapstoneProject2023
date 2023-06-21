package org1.PageObject.RegisterUser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FillDetails {
	WebDriver driver;

	  public FillDetails(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Verify account Enter Account Information visible
	@FindBy(xpath="//b[normalize-space()='Enter Account Information']")
	public WebElement buttonvisible;
	
	// Fill details: Title, Password, Date of birth
	@FindBy(xpath="//input[@id='id_gender1']")
	public WebElement clicktitle;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement enterpassword;
	
	@FindBy(xpath= "//select[@id='days']")
	public WebElement enterDay;
	
	@FindBy(xpath= "//select[@id='months']")
	public WebElement entermMonths;
	
	@FindBy(xpath= "//select[@id='years']")
	public WebElement enterYears;

	// Select check box 'Sign up for our newsletter!'
	@FindBy(xpath = "//*[text()='Sign up for our newsletter!']")
	 WebElement cheeckbox1;

    // Select check box 'Receive special offers from our partners!'
     @FindBy(xpath = "//*[text()='Receive special offers from our partners!']")
     WebElement cheeckbox2;

    // Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zip code, Mobile Number
	@FindBy(xpath="//input[@id='first_name']")
	public WebElement enterfirstname;
	
	@FindBy(xpath="//input[@id='last_name']")
	public WebElement enterlastname;
	
	@FindBy(xpath="//input[@id='company']")
	public WebElement enterCompany;
	
	@FindBy(xpath="//input[@id='address1']")
	public WebElement enterAddress;
	
	@FindBy(xpath="//input[@id='address2']")
	public WebElement enterAddress2;
	
	@FindBy(xpath="//input[@id='state']")
	public WebElement enterState;
	
	@FindBy(xpath="//input[@id='city']")  
	public WebElement enterCity;
	
	@FindBy(xpath="//input[@id='zipcode']")
	public WebElement enterZipcode;
	
	@FindBy(xpath="//input[@id='mobile_number']")
	public WebElement enterMobileNo;
	
	//click create button
	
	@FindBy(xpath="//*[text()='Create Account']")
	public WebElement clickcreatebutton ; 
	
	
	public void VisiblesignupCheck()
	{
		System.out.println(buttonvisible.isDisplayed());
    	Assert.assertTrue(buttonvisible.isDisplayed(),("ENTER ACCOUNT INFORMATION"));
	}
	public void filldetialsAccountuser() throws InterruptedException 
	{
		clicktitle.click();
		enterpassword.sendKeys("Vishu@5151");
		
		Select day = new Select(enterDay);
		day.selectByVisibleText("18");
		  
		Select month = new Select(entermMonths);
		month.selectByVisibleText("July");
		  
		Select year = new Select(enterYears);
		year.selectByVisibleText("2000");
		
		Thread.sleep(3000);
		cheeckbox1.click();
		cheeckbox2.click();
		enterfirstname.sendKeys("Vishal");
		enterlastname.sendKeys("Khand");
		enterCompany.sendKeys("Axis");
		enterAddress.sendKeys("Auaranagabad, Maharastra");
		enterAddress2.sendKeys("Aurangpura");
		enterState.sendKeys("Maharastra");
		enterCity.sendKeys("Aurangabad");
		enterZipcode.sendKeys("443202");
		enterMobileNo.sendKeys("9322142595");
		Thread.sleep(3000);
		clickcreatebutton.click();
		Thread.sleep(3000);
	}  
	  

}
