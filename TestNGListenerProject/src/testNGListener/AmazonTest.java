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

@Test(priority=1,groups="Title")  //2 
public void getAmazonTitle() {
	String title = driver.getTitle();
	System.out.println(title);
}

@Test(priority=3,groups="Logo")  //8
public void amazonLogoTest() {
	boolean b = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).isDisplayed();
	System.out.println(b);
}

@Test(priority=2,groups="Links") //5
public void sellingLink() {
	boolean b = driver.findElement(By.linkText("Sell products on Amazon")).isDisplayed();
	System.out.println(b);
}

@Test(priority=3,groups="Links")  //11
public void mailLink() {
	boolean b = driver.findElement(By.linkText("mail")).isDisplayed();
	System.out.println(b);
}

@Test(priority=3,groups="Test")
public void test1() {
	System.out.println("test1");
}

@Test(priority=3,groups="Test")
public void test2() {
	System.out.println("test2");
}

@AfterMethod  //3 6 9 12
public void tearDown() {
	driver.quit();
}
}
