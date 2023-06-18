import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Invoking Browser
		// Chrome --ChromeDriver -> Method

		// Webdriver methods + class methods

		// Chrome
		System.setProperty("webdriver.chrome.driver", "/Users/rajes/SeleniumDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Firefox Launch
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "/Users/rajes/SeleniumDriver/geckodriver.exe"); WebDriver driver = new
		 * FirefoxDriver();
		 */

		// Edge browser

		/*
		 * System.setProperty("webdriver.edge.driver", "/Users/rajes/SeleniumDriver/msedgedriver.exe"); 
		 * WebDriver driver1 = new EdgeDriver();
		 */

		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		// driver.quit();

	}

}
