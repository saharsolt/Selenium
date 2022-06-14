package testNGListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTitleTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\webdriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
	}

	@Test
	public void getAmazonTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.","The title is not matched");
	}
	
	@Test
	public void amazonLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).isDisplayed();
		Assert.assertTrue(b);
		Assert.assertEquals(b,true);
	}
	
	@AfterMethod 
	public void tearDown() {
		driver.quit();
	}
}
