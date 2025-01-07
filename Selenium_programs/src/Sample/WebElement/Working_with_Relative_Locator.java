package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Working_with_Relative_Locator {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 
		 //toLeftOf() demo: here search text-field is the left of search button
		 //using the details of search button we are trying to target search text-field 
//		 driver.findElement(RelativeLocator.with(By.tagName("input"))
//				 .toLeftOf(By.xpath("//input[@type=\"submit\"]"))).sendKeys("books");
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		 
		 //similarly we can perform to toRightOf() method to
		 
		 
		 //to the above() locator
		 //Excellent radio button
//		 driver.findElement(RelativeLocator.with(By.tagName("input"))
//				 .above(By.id("pollanswers-2"))).click();
		 //similarly we can use below() locator
		 
		 //near() locator is used to locate nearby WebElements
		 //go and click register link which is near Log in link
		 driver.findElement(RelativeLocator.with(By.tagName("a")).near(By.linkText("Log in"))).click();
		 
	}

}
