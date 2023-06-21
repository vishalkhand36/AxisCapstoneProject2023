package org.TestCase.AE;
import java.net.MalformedURLException;
import org.AE.Base.AutomationGrid;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org3.PageObject.LoginIncorrectUserID.loginuseragain;

public class AETestCase3 extends AutomationGrid {
	public loginuseragain homelogin1;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUpGrid(Port);
		
		homelogin1 = new loginuseragain(driver);
	} 
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
        // Class 1
		homelogin1.HomePagesignup2();
		homelogin1.VisiblesignupCheck2();
		homelogin1.enteremailandpassword2();
		homelogin1.loginclick2();
	}



}

