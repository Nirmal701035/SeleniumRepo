package Sample.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Synchronization_ImplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement button = driver.findElement(By.id("newsletter-subscribe-button"));
		
		driver.quit();
	}

}
