package Testing.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class selenium3 {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.opencart.com/");
		wd.manage().window().maximize();
		wd.findElement(By.xpath("//*[@id=\'content\']/h3"));
	}

}
