package Sample.WebElement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_MultipleWindow_Practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);

		Set<String> childwindows = driver.getWindowHandles();
		System.out.println(childwindows);

		for (String window : childwindows) {
			driver.switchTo().window(window);
			if (driver.getTitle().contains("Facebook")) {
				driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys("ragul@.com");
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@class=\"button-1 search-box-button\"]")).click();

		Thread.sleep(4000);
		driver.quit();

	}

}
