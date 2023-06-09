package TestngFrameWork.PageObject.copy;

import java.awt.Point;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestngFrameWork.UtilsPacage.Utils;

public class ItemPage extends Utils {
	
	WebDriver driver;
	
	public ItemPage(WebDriver driver) {
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//a[text()='5 - 8 Years']") //a[text()='5 - 6 Years']
	private WebElement ItemSizeEle;
	
	@FindBy (xpath="//span[@class='G6XhRU']/following-sibling::span")
	private WebElement ItemNameEle;
	
	@FindBy (xpath="//div[@class='_25b18c']/div[1]")
	private WebElement ItemPriceEle;
	
	@FindBy (xpath="//li[@class='col col-6-12'][1]") //button[text()='Add to cart'] or //div[@class='_1AtVbE col-12-12']//button
	private WebElement AddToCartButtonEle;
	
	@FindBy (xpath="//div[@class='YUhWwv']")
	private WebElement cartButtonEle;

		
	public WebElement getItemSizeEle() {
		return ItemSizeEle;
	}

	public WebElement getItemNameEle() {
		return ItemNameEle;
	}

	public WebElement getItemPriceEle() {
		return ItemPriceEle;
	}
	
	public WebElement getAddToCartButtonEle() {
			
		return AddToCartButtonEle;
	}
	

	public void clickAddToCartButtonEle() {
		
		JavascriptExecutor Executor = (JavascriptExecutor)driver;
		Executor.executeScript("window.scrollBy(0,500)");
		Executor.executeScript("arguments[0].click();", AddToCartButtonEle);
	}
	
	
	
	
	
	public WebElement getcartButtonEle() {
		return cartButtonEle;
	}


}
