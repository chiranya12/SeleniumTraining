package Com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	// Preconditions--starting with @Before

	@BeforeSuite
	public void setup() {
		System.out.println("setup system property for chrome");
	}

	@BeforeTest
	public void login() {
		System.out.println("login method");
	}

	@BeforeClass
	public void lauchBrowser() {
		System.out.println("lunch chrome browser");
	}
  
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	}

	// Test case--starting with @Test
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}

	// after conditions--starting with @After

	@AfterMethod
	public void logout() {
		System.out.println("logout from app");

	}

	@AfterTest
	public void deleteallcookies() {
		System.out.println("delete all cookies");
	}

	@AfterClass
	public void closebrowser() {
		System.out.println("close browser ");
	}

	@AfterSuite
	public void generatetestreort() {
		System.out.println("generate test report");
	}
}
