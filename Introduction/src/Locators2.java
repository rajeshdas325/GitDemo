import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name = "rahul";
		System.setProperty("webdriver.chrome.driver", "/Users/rajes/SeleniumDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// implicite wait - 2sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		String Passwd = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(Passwd);
		// Locator using classname
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		// Locator using tagname
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("div[class=\"login-container\"] h2")).getText());
		/*
		 * //Assert.assertEquals(driver.findElement(By.
		 * cssSelector("div[class=\"login-container\"] h2")).getText(),"Hello " + name +
		 * ","); // Locating using Text linked
		 */		
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		System.out.println("Sucess! !!");
		driver.close();
	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String PasswdText = driver.findElement(By.cssSelector("form p")).getText();
		String[] PasswdSplit = PasswdText.split("'");
		String Passwd = PasswdSplit[1].split("'")[0];
		System.out.println(Passwd);
		return Passwd;

	}

}
