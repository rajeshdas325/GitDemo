import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowsActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rajes/SeleniumDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximise windows to avoid BG noise
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("https://google.com");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
				
		driver.navigate().back();
		driver.navigate().forward();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	}

}
