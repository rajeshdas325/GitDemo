import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assment2_UI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rajes/Downloads/chromedriver_win32_2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		/*
		 * //Name,Email.Password //driver.findElement(By.cssSelector(
		 * ".form-control.ng-pristine.ng-invalid.ng-touched")).sendKeys("Rahul Shetty");
		 * driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rahul Shetty"
		 * ); driver.findElement(By.xpath("//input[@name='email']")).sendKeys(
		 * "rahulsh123@gmail.com");
		 * driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys
		 * ("Password@123#");
		 * 
		 * //Checkbox,radiobutton
		 * driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		 * driver.findElement(By.xpath("//input[@id='inlineRadio2']")).click();
		 * 
		 * //Dropdown static 
		 * Select dropdown= new Select(driver.findElement(By.xpath(
		 * "//select[@id='exampleFormControlSelect1']")));
		 * //dropdown.selectByValue("Female"); dropdown.selectByIndex(1);
		 * 
		 * //Calender bday WebElement
		 * dateBox=driver.findElement(By.xpath("//input[@name='bday']"));
		 * dateBox.click(); Thread.sleep(2000); dateBox.sendKeys("03021998");
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.cssSelector(".btn-success")).click();
		 * 
		 * System.out.println(driver.findElement(By.cssSelector(".alert-success")).
		 * getText()); Thread.sleep(2000);
		 */

		driver.findElement(By.name("name")).sendKeys("rahul");

		driver.findElement(By.name("email")).sendKeys("hello@abc.com");

		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");

		driver.findElement(By.id("exampleCheck1")).click();

		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select abc = new Select(dropdown);

		abc.selectByVisibleText("Female");

		driver.findElement(By.id("inlineRadio1")).click();

		driver.findElement(By.name("bday")).sendKeys("02/02/1992");

		driver.findElement(By.cssSelector(".btn-success")).click();

		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		Thread.sleep(2000);
		driver.close();

	}

}
