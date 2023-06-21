package org.TestCase.AE;
import org.AE.Base.AutomationGrid;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org5.PageObject.SearchProduct.SearchProduct;

public class AETestCase5 extends AutomationGrid {
	public SearchProduct SProduct;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUpGrid(Port);
		
		SProduct = new SearchProduct(driver);
	} 
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
        // Class 1
		SProduct.clickProduct5();
		SProduct.searchProductVisible5();
		SProduct.addToCart5();
		SProduct.clickCart5();
		
	}



}


