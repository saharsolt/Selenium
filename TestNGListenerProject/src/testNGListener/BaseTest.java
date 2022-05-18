package testNGListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver = new FirefoxDriver();
	@Test
  public void login() {
	System.setProperty("webdriver.firefox.driver", "D:\\Selenium\\webdriver\\geckodriver.exe");
	String url = "https://www.amazon.com/";
	driver.get(url);
	WebElement signin = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div[2]/span/span/a"));
	signin.click();
	String email = "sahar.solt@gmail.com";
	WebElement checkbox = driver.findElement(By.id("ap_email"));
	checkbox.sendKeys(email);
	WebElement button = driver.findElement(By.id("continue"));
	button.click();
	WebElement passbox = driver.findElement(By.id("ap_password"));
	passbox.sendKeys("pass");
	WebElement login = driver.findElement(By.id("signInSubmit"));
	login.click();
  }
}
