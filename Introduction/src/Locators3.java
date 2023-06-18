import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rajes/SeleniumDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Sibling child to parent traverse
		Thread.sleep(2000);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
		//moving from Child to parent only possible in xpath
		// xpath- //header/div/button[1]/parent::div
		System.out.println("Success !!!");
		driver.close();

	}

}
