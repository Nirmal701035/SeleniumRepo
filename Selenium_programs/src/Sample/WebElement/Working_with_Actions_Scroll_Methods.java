package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Actions_Scroll_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		Actions action = new Actions(driver);
		// scroll by amount, it takes x and y axis for horizontal and vertical and
		// scroll
//		action.scrollByAmount(0, 500).perform();

		// scrollToElement this method is used to scroll till a particular web-element
		// eg: scroll till add to cart is visible
		action.scrollToElement(driver.findElement(By.xpath("//h3[contains(text(),\"Information\")]"))).perform();

		Thread.sleep(2000);

		driver.quit();
	}

}
