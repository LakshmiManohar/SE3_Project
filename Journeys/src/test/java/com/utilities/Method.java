package com.utilities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Method {
  @Test
  public void f() {
	  
	  System.out.println("Test Case1");
  }
  @Test
  public void f2() {
	  
	  System.out.println("Test Case2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Method Starts");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("Method Ends");
  }

}
