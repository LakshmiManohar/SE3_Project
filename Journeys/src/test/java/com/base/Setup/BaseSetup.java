package com.base.Setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.page.data.dataSetup;

public class BaseSetup {
	
	public WebDriver driver;
	public dataSetup ds;
	
@BeforeSuite
public void setup(){

	try{
	ds = new dataSetup();
	System.setProperty("webdriver.chrome.driver",ds.chromeDiver);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(ds.url);
	}
	catch(Exception e){
		
		System.out.println("Failed to Launch the Chrome browser"+e.getMessage());
	}
	
}

@AfterSuite
public void teardown(){
	driver.close();
}
	

}
