package org4.PageObject.RemoveProductCart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RemoveToCart {
	
	WebDriver driver;
	
	public RemoveToCart (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//tbody/tr[@id='product-1']/td[6]/a[1]/i[1]")  
	public WebElement remove1;
	
	@FindBy(xpath = "//tbody/tr[@id='product-2']/td[6]/a[1]/i[1]")  
	public WebElement remove2;
	
	@FindBy(xpath = "//tr[@id='product-3']//i[@class='fa fa-times']")  
	public WebElement remove3;
	
	@FindBy(xpath = "//tr[@id='product-4']//i[@class='fa fa-times']")  
	public WebElement remove4;
	
	@FindBy(xpath = "//tr[@id='product-5']//i[@class='fa fa-times']")  
	public WebElement remove5;
	
	@FindBy(xpath = "//b[contains(text(),'Cart is empty!')]")
	public WebElement empty;
	
	public void removeproduct()
	{
		remove1.click();
		remove2.click();
		remove3.click();
		remove4.click();
		remove5.click();
		
		System.out.println(empty.isDisplayed()+"Successfully Product is Removed From Cart ");
		Assert.assertFalse(empty.isDisplayed(), "Product is Not Removed From Cart ");
		
	}
}