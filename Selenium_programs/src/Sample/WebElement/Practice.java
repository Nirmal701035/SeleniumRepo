package Sample.WebElement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		String parent = driver.getWindowHandle();

		driver.findElement(By.partialLinkText("BUSES")).click();

		Set<String> child = driver.getWindowHandles();

		for (String window : child) {
			driver.switchTo().window(window);
			// for child window
			if (driver.getTitle().contains("IRCTC Bus - Online Bus Ticket Booking | Bus Reservation")) {

				// for Chennai
				driver.findElement(By.id("departFrom")).sendKeys("Chennai");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//div[contains(text(),\"Chennai\")])[1]")).click();

				// for Delhi
				driver.findElement(By.id("goingTo")).sendKeys("Delhi");
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//div[contains(text(),\"Delhi\")])[1]")).click();

				// Depart date
				driver.findElement(By.id("departDate")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//a[@class=\"ui-state-default\"])[1]")).click();

				// Search button
				driver.findElement(By.xpath("(//button[@type=\"submit\"])[3]")).click();

				Thread.sleep(2000);
				driver.close();

			}

		}
		driver.switchTo().window(parent);
		driver.close();

	}
}
