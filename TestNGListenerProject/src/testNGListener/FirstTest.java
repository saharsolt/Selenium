package testNGListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListener.Listener.class)
public class FirstTest{
  
  @Test
  public void f() {
	  WebDriver driver = new FirefoxDriver();
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
	  passbox.sendKeys("");
	  WebElement login = driver.findElement(By.id("signInSubmit"));
	  login.click();
	  Actions action = new Actions(driver);
	  System.out.println("sahar");
	  WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	  action.moveToElement(searchbox).perform();
	  searchbox.sendKeys("hat");
	  WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
	  searchbtn.click();
	  WebElement item = driver.findElement(By.linkText("Flexfit Men's Athletic Baseball Fitted Cap"));
	  item.click();
	  action.moveToElement(driver.findElement(By.id("native_dropdown_selected_size_name"))).click().perform();
	  action.moveToElement(driver.findElement(By.id("native_dropdown_selected_size_name_2"))).click();
	  //Select dropdownSize = new Select (driver.findElement(By.id("native_dropdown_selected_size_name_2")));
	  //dropdownSize.selectByIndex(-1);
	  dropdownSize.selectByVisibleText("X-Large-XX-Large");
	  WebElement addbtn = driver.findElement(By.cssSelector("#add-to-cart-button"));
	  addbtn.click();
	  WebElement cardbtn = driver.findElement(By.cssSelector("#sw-gtc > span > a"));
	  cardbtn.click();
	  WebElement Comparelnk = driver.findElement(By.cssSelector(" #comparison-lite-modal-B00MZKECVG > input"));
	  Comparelnk.click();
	  WebElement addsimilar = driver.findElement(By.cssSelector("#a-popover-content-2 > div > div > div > table > tbody > tr:nth-child(6) > td:nth-child(5) > span > span > span > input"));
	  addsimilar.click();
	  WebElement deleteitem = driver.findElement(By.cssSelector("#sc-item-C836e72a2-d752-4444-a3a3-e20dcc0a03a2 > div.sc-list-item-content > div > div.a-column.a-span10 > div > div > div.a-fixed-left-grid-col.a-col-right > div.a-row.sc-action-links > span.a-size-small.sc-action-delete > span > input"));
	  deleteitem.click();
	  
	  WebElement hoveritem = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	  action.moveToElement(hoveritem).perform();
	  WebElement signoutbtn = driver.findElement(By.cssSelector("#nav-item-signout > span"));
	  signoutbtn.click();
	  
	  driver.close();
	  
  }
 
}

