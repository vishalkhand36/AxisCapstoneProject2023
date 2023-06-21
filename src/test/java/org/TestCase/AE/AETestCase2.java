package org.TestCase.AE;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.AE.Base.AutomationGrid;

import org2.PageObject.LoginCorrectUserID.HomePageDeleteAcc2;
import org2.PageObject.LoginCorrectUserID.loginuser;

public class AETestCase2 extends AutomationGrid {
	public loginuser homelogin1;
	public HomePageDeleteAcc2 deleteccount;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUpGrid(Port);
		
		homelogin1 = new loginuser(driver);
		deleteccount = new HomePageDeleteAcc2(driver);
	} 
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
        // Class 1
		homelogin1.HomePagesignup1();
		homelogin1.VisiblesignupCheck();
		homelogin1.enteremailandpassword();
		homelogin1.loginclick();
		
		// class 2
		deleteccount.AccountButtonVerify();
	}



}

