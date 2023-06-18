import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/rajes/SeleniumDriver/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		//implicite wait  - 2sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Locator using ID
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		//Locator using name
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		
		//Locator using classname
		driver.findElement(By.className("signInBtn")).click();
		
		//Locator using CSS selector ->tagname.classname
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //p[@class="error"]
		
		//Locator link text -> when have <a>
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Locator Xpath
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("John");
		
		//Locator Customized CSS
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("JohnD@gmail.com") ;
		
		//Locator Xpath and CSS with same attribute
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("789465123");
		driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).clear();
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("569874123");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		//Locators Xpath using parent to child tag name
		driver.findElement(By.xpath("//form/input[2]")).sendKeys("John123@mail.com");
		
		//Sleep
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//Locators using css parent child tagg
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); 
		//xpath parent child 
		driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();
		
		Thread.sleep(1000);
		//Id -> tagname#id      ->   input#inputUsername
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		//Attribute constant value in Css using * with regular exp.
		driver.findElement(By.cssSelector("input[type*=\"pass\"]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		//Attribute constant value in Xpath using contains(,)
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		System.out.println("\nSuccess !!!");
		driver.close();
		
		
		

	}

}
