package Testing.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		
		//maximize the page of the browser
		dr.manage().window().maximize();
		dr.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		//Find the element in the website
		dr.findElement(By.id("input-firstname")).sendKeys("Janani");
		dr.findElement(By.id("input-lastname")).sendKeys("R S");
		dr.findElement(By.id("input-email")).sendKeys("janani14@gmail.com");
		dr.findElement(By.id("input-password")).sendKeys("password");
		dr.findElement(By.id("input-newsletter-yes")).click();	
		
		Thread.sleep(5000);
		dr.quit();

	}

}
