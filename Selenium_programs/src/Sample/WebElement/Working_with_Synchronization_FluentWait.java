package Sample.WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Working_with_Synchronization_FluentWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement text = driver.findElement(By.xpath("//strong[contains(text(),\"Newsletter\")]"));
		
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(15));
		
		
		wait.until(ExpectedConditions.visibilityOf(text));
		driver.close();
	}

}
