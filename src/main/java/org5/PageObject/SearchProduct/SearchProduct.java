package org5.PageObject.SearchProduct;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchProduct {
    WebDriver driver;
    
    public SearchProduct(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
    
    // Create the Page Object Model 
    
    @FindBy(xpath = "//*[text()=' Products']")
	public WebElement products_Search;
    
    @FindBy(xpath = "//*[@id = 'search_product']")
    public WebElement Search;
    
    @FindBy(xpath = "//*[@id = 'submit_search']")
    public WebElement Search_Submit;

    @FindBy(xpath = "//*[text() = 'Searched Products']")
    public WebElement Visible;
    
    @FindBy(xpath = "//*[text() = 'Continue Shopping']")
    public WebElement conti;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[1]")
    public WebElement add1;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[3]")
    public WebElement add2;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[5]")
    public WebElement add3;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[7]")
    public WebElement add4;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[9]")
    public WebElement add5;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[11]")
    public WebElement add6;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[13]")
    public WebElement add7;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[15]")
    public WebElement add8;
    
    @FindBy(xpath = "(//*[text() = 'Add to cart'])[17]")
    public WebElement add9;
    
    @FindBy(xpath = "//*[text() = ' Cart']")
    public WebElement cart;
    
    public void clickProduct5()
    {
    	products_Search.click();
    
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
    	Search.sendKeys("dress");
    	Search_Submit.click();
    	
    }
   public void searchProductVisible5()
   {
	   Assert.assertTrue(Visible.isDisplayed(), "The Search Product is enabled");
   }
    public void addToCart5()
    {
    	add1.click();
    	conti.click();
    	
    	add2.click();
    	conti.click();
    	
    	add3.click();
    	conti.click();
    	
    	add4.click();
    	conti.click();
    	
        add5.click();
        conti.click();
        
        add6.click();
        conti.click();
        
        add7.click();
        conti.click();
        
        add8.click();
        conti.click();
        
        add9.click();
        conti.click();
        

    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
  
    }
    
    public void clickCart5()
    {
    	cart.click();
    }

}