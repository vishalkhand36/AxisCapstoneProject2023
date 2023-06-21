package org.TestCase.AE;
import org.AE.Base.AutomationGrid;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org4.PageObject.RemoveProductCart.AddToCart1;
import org4.PageObject.RemoveProductCart.RemoveToCart;

public class AETestCase4 extends AutomationGrid {
    public AddToCart1 ac;
    public RemoveToCart RTC;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUpGrid(Port);
		
		ac = new AddToCart1(driver);
		RTC = new RemoveToCart(driver);
	} 
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
		
		// class1
		ac.addToCart();
		
		// class2
		RTC.removeproduct();

	}



}


