//package com.sauceDemo.TestCLasses;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//
//import com.sauceDemo.POMClasses.HomePageClass;
//import com.sauceDemo.POMClasses.LoginPageClass;
//
//public class BaseClass 
//{
//WebDriver driver;
//	
//	@BeforeClass
//	public void setupUpMethod()
//	{	
//		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation\\chromedriver_win32\\chromedriver.exe");
//		driver =  new ChromeDriver();
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("URL is opened");
//	}	
//	
//	@BeforeMethod
//	public void loginMethod()
//	{	
//		LoginPageClass login = new LoginPageClass(driver);
//		login.sendUsername();
//		login.sendPassword();
//		login.clickLoginButton();	
//	 }
//	
//	@AfterMethod
//	public void logoutMethod()
//	{
//		HomePageClass home = new HomePageClass(driver);
//		home.clickSettingButton();
//		home.clickLogoutButton();	
//	}
//	
//	
//	@AfterClass
//	public void tearDown()
//		{
//			driver.quit();
//		}	
//
//}
