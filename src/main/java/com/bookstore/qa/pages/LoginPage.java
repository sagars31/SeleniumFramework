package com.bookstore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookstore.qa.base.TestBase;

public class LoginPage extends TestBase {

//PageFactory-OR
	
@FindBy(id="userName")
WebElement txtUsername;

@FindBy(id="password")
WebElement txtPassword;

@FindBy(id="login")
WebElement btnLogin;

@FindBy(id="newUser")
WebElement btnNewuser;

public LoginPage(){
PageFactory.initElements(driver, this);	
}

public String validateLoginPageTitle(){
	return driver.getTitle();
}

public ProfilePage login(String Username,String Password){
	txtUsername.sendKeys(Username);
	txtPassword.sendKeys(Password);
	btnLogin.click();
	return new ProfilePage();
}

}
