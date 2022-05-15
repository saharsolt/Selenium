package testNGListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListener.Listener.class)
public class FirstTest extends BaseTest{
  
  @Test(dependsOnMethods = {"login"})
  public void f() throws InterruptedException{
	  
	  System.out.println("sahar");
	  WebElement searchbox = driver.findElement(By.cssSelector("#nav-search-bar-form > div.nav-fill > div.nav-search-field"));
	  searchbox.sendKeys("hat");
	  WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
	  searchbtn.click();
	  WebElement item = driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(10) > div > div > div > div > div.a-section.a-spacing-small.s-padding-left-small.s-padding-right-small > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span"));
	  item.click();
	  WebElement itemsize = driver.findElement(By.cssSelector("#size_name_0 > span > input"));
	  itemsize.click();
	  WebElement addbtn = driver.findElement(By.id("submit.add-to-cart-announce"));
	  addbtn.click();
	  WebElement cardbtn = driver.findElement(By.cssSelector("#sw-gtc > span > a"));
	  cardbtn.click();
	  WebElement Comparelnk = driver.findElement(By.cssSelector(" #comparison-lite-modal-B00MZKECVG > input"));
	  Comparelnk.click();
	  WebElement addsimilar = driver.findElement(By.cssSelector("#a-popover-content-2 > div > div > div > table > tbody > tr:nth-child(6) > td:nth-child(5) > span > span > span > input"));
	  addsimilar.click();
	  WebElement deleteitem = driver.findElement(By.cssSelector("#sc-item-C836e72a2-d752-4444-a3a3-e20dcc0a03a2 > div.sc-list-item-content > div > div.a-column.a-span10 > div > div > div.a-fixed-left-grid-col.a-col-right > div.a-row.sc-action-links > span.a-size-small.sc-action-delete > span > input"));
	  deleteitem.click();
	  Actions action = new Actions(driver);
	  WebElement hoveritem = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	  action.moveToElement(hoveritem).perform();
	  WebElement signoutbtn = driver.findElement(By.cssSelector("#nav-item-signout > span"));
	  signoutbtn.click();
	  
  }
  @Test
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);			
	}
}

