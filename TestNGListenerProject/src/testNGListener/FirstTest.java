package testNGListener;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;


@Listeners(testNGListener.Listener.class)
public class FirstTest{
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "D:\\Selenium\\webdriver\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url = "https://www.amazon.com/";
		driver.get(url);
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void login() {
	
		WebElement signin = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div[2]/span/span/a"));
		signin.click();
		String email = "sahar.solt@gmail.com";
		WebElement checkbox = driver.findElement(By.id("ap_email"));
		checkbox.sendKeys(email);
		WebElement button = driver.findElement(By.id("continue"));
		button.click();
		WebElement passbox = driver.findElement(By.id("ap_password"));
		passbox.sendKeys("*");
		WebElement login = driver.findElement(By.id("signInSubmit"));
		login.click();	
  }
	
	@Test(priority=2)
	public void searchItem() throws InterruptedException {
	  Actions action = new Actions(driver);
	  WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	  action.moveToElement(searchbox).perform();
	  searchbox.sendKeys("bicycle");
	  WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
	  searchbtn.click();
	  WebElement item = driver.findElement(By.linkText("RoyalBaby Freestyle Kids Bike 12 14 16 18 20 Inch Bicycle for Boys Girls Ages 3-12 Years, Multiple Color Options"));
	  item.click();
	  
	  WebElement addbtn = driver.findElement(By.cssSelector("#add-to-cart-button"));
	  addbtn.click();
	  WebElement cardbtn = driver.findElement(By.cssSelector("#sw-gtc > span > a"));
	  cardbtn.click();
	  
	  WebElement element=driver.findElement(By.xpath("/descendant::input[@value = 'Compare with similar items']"));
	  element.click();
	  Thread.sleep(2000);
	  Actions actions = new Actions(driver);
	  actions.moveToElement(element).perform();
	  
	  Thread.sleep(5000);
	  
	  WebElement addsimilar = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div/div/table/tbody/tr[6]/td[3]"));
	  addsimilar.click();
	  Thread.sleep(5000);
	  WebElement deleteitem = driver.findElement(By.xpath("/descendant::input[@value = 'Delete']"));
	  deleteitem.click();  
	  Thread.sleep(5000);
  }
  
  	@Test(priority=3, dependsOnMethods="searchItem")
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

