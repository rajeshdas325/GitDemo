import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rajes/SeleniumDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		/*
		 * driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
		 * List<WebElement> options =
		 * driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); //
		 * =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); for
		 * (WebElement option : options) {
		 * 
		 * if (option.getText().equalsIgnoreCase("India")) { option.click(); break; } }
		 */

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options)

		{

			if (option.getText().equalsIgnoreCase("India"))

			{

				option.click();

				break;

			}

		}

		// driver.close();

	}

}
