package testNGListener;

import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.test.utility.SearchTest;

@Listeners(testNGListener.Listener.class)
public class SecondTest {
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		Thread.sleep(2000);
		System.setProperty("webdriver.firefox.driver", "D:\\Selenium\\webdriver\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url = "https://www.amazon.com/";
		driver.get(url);
	}
	
	@Test
	public void login() {
	
		WebElement signin = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div[2]/span/span/a"));
		signin.click();
		String email = "sahar.solt@gmail.com";
		WebElement checkbox = driver.findElement(By.id("ap_email"));
		checkbox.sendKeys(email);
		WebElement button = driver.findElement(By.id("continue"));
		button.click();
		WebElement passbox = driver.findElement(By.id("ap_password"));
		passbox.sendKeys("******");
		WebElement login = driver.findElement(By.id("signInSubmit"));
		login.click();	
  }
	
	@DataProvider
	public Iterator<String> getTestData() {
		ArrayList<String> data = SearchTest.getDataFromFile();
		return data.iterator();
	}
	
	@Test(dataProvider="getTestData")
	public void search(String searchItem) {
		Actions action = new Actions(driver);
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchbox).perform();
		searchbox.clear();
		searchbox.sendKeys(searchItem);
		WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
		searchbtn.click();
	}
	
	@Test(dependsOnMethods="login")
	public void logOut() throws InterruptedException {
		
		Actions action = new Actions(driver);
		WebElement hoveritem = driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		action.moveToElement(hoveritem).perform();
		Thread.sleep(2000);
		WebElement signOut = driver.findElement(By.xpath("//span[normalize-space()='Sign Out']"));
		signOut.click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
