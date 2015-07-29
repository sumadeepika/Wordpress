package com.selenium.Wordpress.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.selenium.Wordpress.Login;
import com.selenium.common.CommonCode;
import com.selenium.common.Configuration;

public class TestNGAnnotationTest {

	public WebDriver driver = Configuration.browser();
	public Login login;
	public CommonCode common;
	
	public TestNGAnnotationTest(){
		login = new Login();
		PageFactory.initElements(driver, this);
		common = new CommonCode();
	}
	
	@BeforeSuite(alwaysRun=true)
	public void invokeURL(){
		
		Reporter.log("In Before Suite", true);
		driver.manage().window().maximize();
		driver.get(Configuration.LoginURL());
	
		
	}
	
	/*@BeforeMethod(alwaysRun=true)
	public void logintoEbay() {
		Reporter.log("In Before Method", true);
		try {
			if(driver.findElement(By.id(Elements.afterLogin_dropdown)).isDisplayed())
			{
				login.logOut();
			}
			
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		login.loginApp();
		

	}

	@AfterMethod(alwaysRun = true)
	public void logOut() {
		Reporter.log("In After Method", true);
		try {
			if(driver.findElement(By.id("userName")).isDisplayed())
			{
				login.loginApp();
			}
			
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		login.logOut();
	}
	
	@AfterSuite(alwaysRun=true)
	public void quit(){
		Reporter.log("In After Suite", true);
		common.sleep(2000);
		driver.quit();
	}*/
	
	
}
