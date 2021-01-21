package com.bookstore.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bookstore.qa.base.TestBase;
import com.bookstore.qa.pages.LoginPage;
import com.bookstore.qa.pages.ProfilePage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	ProfilePage profilePage;
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		profilePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "ToolsQA");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
