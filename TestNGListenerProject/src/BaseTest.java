import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseTest {
  @Test
  public void login() {
	WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.firefox.driver", "D:\\Selenium\\webdriver\\geckodriver.exe");
	String url = "https://www.amazon.com/";
	driver.get(url);
	WebElement signin = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[13]/div[2]/a/span"));
	signin.click();
	String email = "sahar.solt@gmail.com";
	WebElement checkbox = driver.findElement(By.id("ap_email"));
	checkbox.sendKeys(email);
	WebElement button = driver.findElement(By.id("continue"));
	button.click();
  }
}
