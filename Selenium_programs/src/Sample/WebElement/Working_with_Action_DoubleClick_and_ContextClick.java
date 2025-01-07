package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Action_DoubleClick_and_ContextClick {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);

		WebElement doubleclick = driver
				.findElement(By.xpath("//button[contains(text(),\"Double-Click Me To See Alert\")]"));

		Actions action = new Actions(driver);

		// double clicking
//		action.doubleClick(doubleclick).build().perform();
//		Thread.sleep(3000);

		// Double click or context click

		WebElement context = driver.findElement(By.xpath("//span[contains(text(),\"right click me\")]"));
		
		action.contextClick(context).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()=\"Edit\"]"))).click().perform();
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
