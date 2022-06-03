package com.sauceDemo.TestCLasses;

import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.AddToCartPageClass;

public class TC03VerifyAddtoCartFunctionality extends BaseClass1
{
  
	@Test
	public void verifyAddtocart()
 {
	 	 
	 AddToCartPageClass add = new AddToCartPageClass(driver);
	 add.addTocart();
	 System.out.println("Product are added to cart");
	 
 }
}


