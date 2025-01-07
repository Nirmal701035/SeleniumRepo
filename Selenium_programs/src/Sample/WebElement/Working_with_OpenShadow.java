package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_OpenShadow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoapps.qspiders.com/");

		driver.findElement(By.xpath("(//main[@data-aos=\"zoom-in\"])[2]")).click();

		// identify the shadow host
		SearchContext shadow = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		
		//finding the shadow web-element and performing action
		shadow.findElement(By.cssSelector("input[type='text']")).sendKeys("Ragul");

		Thread.sleep(2000);
		driver.quit();

	}

}
