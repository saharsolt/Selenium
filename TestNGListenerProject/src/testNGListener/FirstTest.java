package testNGListener;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;


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
	  String email = "sahar@gmail.com";
	  WebElement checkbox = driver.findElement(By.id("ap_email"));
	  checkbox.sendKeys(email);
	  WebElement button = driver.findElement(By.id("continue"));
	  button.click();
	  WebElement passbox = driver.findElement(By.id("ap_password"));
	  passbox.sendKeys("****");
	  WebElement login = driver.findElement(By.id("signInSubmit"));
	  login.click();
	  Actions action = new Actions(driver);
	  System.out.println("sahar");
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
	 
	  driver.findElement(By.xpath("/descendant::input[@value = 'Compare with similar items']")).click();
	
	  
	    WebElement addsimilar = driver.findElement(By.className("a-button-input"));
	    addsimilar.click();
//	  WebElement deleteitem = driver.findElement(By.cssSelector("#sc-item-C6afce21c-a366-4b94-92ee-d910a112f53e > div.sc-list-item-content > div > div.a-column.a-span10 > div > div > div.a-fixed-left-grid-col.a-col-right > div.a-row.sc-action-links > span.a-size-small.sc-action-delete > span > input"));
//	  deleteitem.click();
//	  
//	  WebElement hoveritem = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
//	  action.moveToElement(hoveritem).perform();
//	  WebElement signoutbtn = driver.findElement(By.cssSelector("#nav-item-signout > span"));
//	  signoutbtn.click();
	  
	  //driver.close();
	  
  }
}

