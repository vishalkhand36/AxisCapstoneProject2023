package org4.PageObject.RemoveProductCart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart1 {
	
	WebDriver driver;
	
	public AddToCart1 (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product1;
	
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']")
	public WebElement continueb;
	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product2;

	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product3;

	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product4;
	
	@FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/a[1]")
	public WebElement product5;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	public WebElement cart;
	
	
	public void addToCart() 
	{
		
			
		product1.click();
		continueb.click();
		
		product2.click();
		continueb.click();
		
		product3.click();
		continueb.click();
		
		product4.click();
		continueb.click();
		
		product5.click();
		continueb.click();
		
		cart.click();    // Add to cart click
	
	}	
	
	

}