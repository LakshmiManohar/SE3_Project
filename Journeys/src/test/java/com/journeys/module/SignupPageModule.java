package com.journeys.module;

import org.openqa.selenium.WebDriver;

import com.journeys.locators.SignupPageLocators;
import com.user.actions.Actions;

public class SignupPageModule extends Actions implements SignupPageLocators {

	WebDriver driver;
	
	public SignupPageModule(WebDriver driver){
		
		super(driver);
		this.driver = driver;
	}
	
	public void signUp(String userName,String password,String url){
		
		getUrl(url);
		safeType(USERNAME,userName);
		safeType(PASSWORD,password);
		safeClick(SUBMIT);
		
	}

}
