package Sample.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_with_Synchronization {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		
		//WebDriverWait is nothing but explicit wait (it's a class)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		//if it runs before 15 seconds it won't wait unlike Thread.sleep which will wait even the task is done
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@type=\"submit\"]"))));
		
//		driver.findElement(By.id("small-searchterms")).sendKeys("books");
//		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		Thread.sleep(2000);
		driver.close();
	}
}
