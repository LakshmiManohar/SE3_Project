package com.utilities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Tests11 {
  @Test
  public void f() {
	  
	  System.out.println("Test Case 1");
  }
  @Test
  public void f2() {
	  
	  System.out.println("Test Case 2");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("After Test");
  }

}
