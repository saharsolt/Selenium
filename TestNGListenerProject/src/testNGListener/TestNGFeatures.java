package testNGListener;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test
	public void login() {
		System.out.println("Log in");
		//int i = 9/0;  if login method fails, homepageTest method will be skipped.
	}
	
	@Test(dependsOnMethods="login")
	public void homePageTest() {
		System.out.println("Homepage test");
	}

}
