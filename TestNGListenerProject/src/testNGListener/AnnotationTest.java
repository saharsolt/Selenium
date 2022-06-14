package testNGListener;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationTest {
	/*	Output:
		@BeforeSuite--Set up system property for chrome driver
		@BeforeTest--Launch Chrome Browser
		@BeforeClass--log in to app
		
		@BeforeMethod--Enter URL
		@Test--URL title of the page
		@AfterMethod--Log out from app
		
		@BeforeMethod--Enter URL
		@Test--Search the item
		@AfterMethod--Log out from app
		
		@AfterClass--Close browser
		@AfterTest--delete all cookies
		PASSED: googleTitleTest
		PASSED: search
	 */
	
	//Pre-conditions  --Starting with @Before
	@BeforeSuite //1
	public void setup() {
		System.out.println("@BeforeSuite--Set up system property for chrome driver");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("@BeforeTest--Launch Chrome Browser");
	}
	
	@BeforeClass //3
	public void login() {
		System.out.println("@BeforeClass--log in to app");
	}
	/* 
	 --@BeforeMethod
	 --@Test  1
	 --@AfterMethod
	 
	 --@BeforeMethod
	 --@Test  2
	 --@AfterMethod
	 */
	
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("@BeforeMethod--Enter URL");
	}
	
	//Test cases  --Starting with @Test
	@Test //5
	public void googleTitleTest() {
		System.out.println("@Test--URL title of the page");
	}
	
	@Test
	public void search() {
		System.out.println("@Test--Search the item");
	}
	
	//Post conditions  --Starting with @After
	@AfterMethod //6
	public void logOut() {
		System.out.println("@AfterMethod--Log out from app");
	}
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("@AfterClass--Close browser");
	}
	
	@AfterTest  //8
	public void deleteAllCookies() {
		System.out.println("@AfterTest--delete all cookies");
	}
	
	/*
	@AfterSuite //9
	public void generateTestReport() {
		System.out.println("Generate test report");
	}
	*/
	
}
