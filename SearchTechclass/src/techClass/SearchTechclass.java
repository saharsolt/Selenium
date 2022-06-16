package techClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchTechclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.firefox.driver", "D:\\Selenium\\webdriver\\geckodriver.exe");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.className("gLFyf gsfi"));
		searchbox.sendKeys("techclass.io");
		WebElement searchBtn = driver.findElement(By.className("gNO89b"));
		searchBtn.click();
		WebElement techclassLnk = driver.findElement(By.linkText("TechClass Digital Academy | Training the future experts ..."));
		techclassLnk.getText();
		//String actual = "TechClass Digital Academy | Training the future experts ...";
		if (techclassLnk.isDisplayed()) {
			System.out.print("techclass.io is shown in the search list ");
			
		}
		driver.close();
		System.exit(0);
	}

}
