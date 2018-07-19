package com.journeys.testsuite;

import org.testng.annotations.Test;

import com.base.Setup.BaseSetup;
import com.journeys.module.SignupPageModule;
import com.page.data.dataSetup;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SignupTestsuite extends BaseSetup{
	
	SignupPageModule spM;
	dataSetup dst;

  @Test
  public void Login() {
	  
	  spM.signUp(dst.userName, dst.password,dst.url);
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	  dst = new dataSetup();
	  spM = new SignupPageModule(driver);
	    
  }

  @AfterTest
  public void afterTest() {
  }

}
