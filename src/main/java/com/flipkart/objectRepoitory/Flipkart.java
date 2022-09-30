package com.flipkart.objectRepoitory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.genericUtility.UtilityObjectClass;

public class Flipkart {
	

	@FindBy(xpath="//android.widget.TextView[@text='Search for products']")
	private WebElement search;

	@FindBy(xpath="//android.widget.EditText[@text='Search for Products, Brands and More']")
	private WebElement enterName;

	@FindBy(xpath="(//android.widget.TextView[contains(@text,'Heater')])[1]")
	private WebElement productName;
	
//	@FindBy(xpath="(//android.widget.TextView[@index='0'])[2]")
//	private WebElement productNameText;
	
	@FindBy(xpath="//android.widget.TextView[@text='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//android.widget.TextView[@text='SKIP']")
	private WebElement skipBtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='Go to cart']")
	private WebElement goToCart;
	
	@FindBy(xpath="//android.widget.TextView[@text='winter heater']")
	private WebElement winterHeater;
	
	
	
	public Flipkart() {
		PageFactory.initElements(UtilityObjectClass.getDriver(), this);
	}
	
	public void clickSearch() {
		search.click();
	}

	 public void searchProductName(String value) {
		 enterName.sendKeys(value);
		 winterHeater.click();

		}

	 public void clickParticularProductName() {
		 productName.click();
		}
	 public String getProductName() {
		 return productName.getText();
		}
	
	 public void clickOnAddToCart() {
		 addToCart.click();
	 }
	 public void clickOnSkipBtn() {
		 if(skipBtn.isDisplayed())
		 skipBtn.click();
	 }
	 public void clickOnGoToCart() {
		 goToCart.click();
	 }
	 public String getMyCartProductName(String productName) {
		 return UtilityObjectClass.getDriver().findElement(By.xpath("//android.widget.TextView[@text='"+productName+" ']")).getText().trim();
	 }
}

