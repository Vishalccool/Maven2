package com.sauceDemo.TestCLasses;

import org.testng.annotations.Test;


public class TC01VerifyLoginFunctioanlity extends BaseClass1
{
	
	@Test
	public void checktitle()
	{
		String actalTitle = "Swag Labs";
		String expectedTitle = driver.getTitle();
		if(expectedTitle.equals(actalTitle))
		{
			System.out.println("Login test is passed");
		}
		else
		{
			System.out.println("Login test is failed");
		}		
		
	}
	
	
}



