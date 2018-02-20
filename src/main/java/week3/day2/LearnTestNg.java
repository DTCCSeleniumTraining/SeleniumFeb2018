package week3.day2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnTestNg {
  @Test
  public void test0() {
	  System.out.println("@Test0");
  }
  @Test
  public void abc() {
	  System.out.println("@abc");
  }
  @Test
  public void test2() {
	  System.out.println("@Test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" @AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" @BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" @AfterSuite");
  }

}