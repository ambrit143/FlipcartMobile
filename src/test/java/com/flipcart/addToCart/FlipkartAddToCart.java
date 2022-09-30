package com.flipcart.addToCart;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.flipkart.genericUtility.BaseClass;
import com.flipkart.objectRepoitory.Flipkart;

public class FlipkartAddToCart extends BaseClass{
@Test
public void flipkartAddToCart() {
	String searchProductName = excelUtility.getDataFromExcel("flipkart", 1, 1);
	Reporter.log("Search Product Name is :"+searchProductName,true);
	
	Flipkart flipcart=new Flipkart();
	flipcart.clickSearch();
	flipcart.searchProductName(searchProductName);
	
	
	String productName = flipcart.getProductName();
	Reporter.log("ProductName is:"+productName ,true);
	flipcart.clickParticularProductName();
	flipcart.clickOnAddToCart();
	flipcart.clickOnSkipBtn();
	flipcart.clickOnGoToCart();
	String cartProductName = flipcart.getMyCartProductName(productName);
	Reporter.log("Cart Product Name is:"+ cartProductName,true);
	
	Assert.assertEquals(productName, cartProductName);
	
	
}
}
