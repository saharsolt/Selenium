package testNGListener;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest {
WebDriver driver;

@BeforeMethod //1  4  7  10
public void setup() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\webdriver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://www.amazon.com/");
}

@Test  //2 
public void getAmazonTitle() {
	String title = driver.getTitle();
	System.out.println(title);
}

@Test  //5
public void amazonLogoTest() {
	boolean b = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).isDisplayed();
	System.out.println(b);
}

@Test  //8
public void sellingLink() {
	boolean b = driver.findElement(By.linkText("Sell products on Amazon")).isDisplayed();
	System.out.println(b);
}

@Test  //11
public void mailLink() {
	boolean b = driver.findElement(By.linkText("mail")).isDisplayed();
	System.out.println(b);
}

@AfterMethod  //3 6 9 12
public void tearDown() {
	driver.quit();
}
}
