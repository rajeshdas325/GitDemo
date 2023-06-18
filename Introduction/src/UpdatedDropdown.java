import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



// Using TESTNG Framework

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rajes/Downloads/chromedriver_win32_3/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	
		//CHECK BOX selection
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected();
		//Assert.assertTrue(driver.findElement(By.cssSelector("driver.findElement(By.cssSelector(\"input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		System.out.println("SeniorCitizenDiscount = "+driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		
		//Count no of check box
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Thread.sleep(2000);
		// Select drop down div pax info
		// select Adult as 4 hrefIncAdt
		// Select done
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		/*System.out.println("Part2 !!!");
		while (i < 5) {

			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}*/
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
		
		
	}

}
