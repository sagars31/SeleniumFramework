package com.bookstore.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bookstore.qa.base.TestBase;
import com.bookstore.qa.pages.LoginPage;
import com.bookstore.qa.pages.ProfilePage;

public class ProfilePageTest extends TestBase {

	LoginPage loginPage;
	ProfilePage profilePage;
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=-1)
	public void addBookToProfileTest(){
		profilePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "ToolsQA");
	}
	@Test(priority=2)
	public void removeBookFromProfileTest(){
		profilePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "ToolsQA");
	}
	@Test(priority=3)
	public void searchBookInProfileTest(){
		profilePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "ToolsQA");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
