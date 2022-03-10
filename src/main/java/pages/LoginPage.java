package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class LoginPage extends ProjectSpecificWrappers  {

	public LoginPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("ToolsQA")){
			reportStep("This is not Login Page", "Fail");
		}
		PageFactory.initElements(driver, test);
	}
	
		@FindBy(id="userName")
		WebElement userNameElement;
	
		@FindBy(id="password")
		WebElement passwordElement;
		
		@FindBy(xpath="//button[@id='login']")
		WebElement loginButton;
		
		
	public LoginPage enterUserName() {
		enterById("userName", username);
		return this;
	}
	
	public LoginPage enterPassword(){
		enterById("password", password);
		return this;
		
	}
	
	public ProfilePage clickLogin(){
		clickById("login");		
		return new ProfilePage(driver, test);
	}
	
	public LoginPage clickLoginForFailure(){
		clickById("login");
		return this;
	}
	
	public LoginPage clickNewUser(){
		clickById("newUser");
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
