package org.TestCase.AE;
import org.AE.Base.AutomationGrid;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org6.PageObject.ReviewProduct.AddReviewProdcut2;
import org6.PageObject.ReviewProduct.AddReviewProduct;

public class AETestCase6 extends AutomationGrid {
	public AddReviewProduct ARP;
	public AddReviewProdcut2 ARP2;
	
    WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup2(String Port) throws MalformedURLException
	{
		driver=setUpGrid(Port);
		
		ARP=new AddReviewProduct(driver);
		ARP2=new AddReviewProdcut2(driver);
	}

	
	@Test
	public void DemoScenario() 
	{
		ARP.PerformReview();
		ARP2.EnterReview();
	}

	
	

}