package com.user.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Actions {
	
	WebDriver driver;
	
	public Actions(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void safeClick(By ele){
		
		try{
			
			driver.findElement(ele).click();
		}catch(Exception e){
			
			System.out.println("Failed to click the Element"+e.getMessage());
		}
	}
	
	public void safeType(By ele,String text){
		
		try{
			
			driver.findElement(ele).sendKeys(text);
		}catch(Exception e){
			System.out.println("Failed to type the text"+e.getMessage());
		}
	}
	
	public void getUrl(String url){
		
		try{
			driver.get(url);
		}catch(Exception e){
			System.out.println("Failed to open the URL"+e.getMessage());
		}
	}
}
