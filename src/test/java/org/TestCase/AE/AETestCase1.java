package org.TestCase.AE;

import java.net.MalformedURLException;

import org.AE.Base.AutomationGrid;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org1.PageObject.RegisterUser.AccountVerify;
import org1.PageObject.RegisterUser.FillDetails;
import org1.PageObject.RegisterUser.HomePageDeleteAcc;
import org1.PageObject.RegisterUser.SignupPage;

public class AETestCase1 extends AutomationGrid {
	public SignupPage homesignup;
	public FillDetails Filluserdetails;
	public AccountVerify VerifyAccount;
	public HomePageDeleteAcc deleteaccverify;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setupMethod(String Port) throws MalformedURLException
	{
		driver=setUpGrid(Port);
		
		homesignup = new SignupPage(driver);
		Filluserdetails = new FillDetails(driver);
		VerifyAccount = new AccountVerify(driver);
		deleteaccverify = new HomePageDeleteAcc(driver);
	}
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
        // Class 1
		homesignup.HomePagesignup();
		homesignup.VisiblesignupCheck();
		homesignup.EnterNameEmail();
		homesignup.Clickenter();
		
		// Class 2
		Filluserdetails.VisiblesignupCheck();
		Filluserdetails.filldetialsAccountuser();
		
		// Class 3
		VerifyAccount.AccountButtonVerify();
		
		// Class 4
		deleteaccverify.AccountButtonVerify();
	}



}

