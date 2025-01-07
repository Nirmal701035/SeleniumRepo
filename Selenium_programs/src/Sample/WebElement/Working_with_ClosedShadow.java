package Sample.WebElement;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_ClosedShadow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);

		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");

		// we cannot identify the closed shadow root-element directly
		// step1: identify the web-element which is outside(not the parent like we did in open
		// shadow) the shadow-root
		
		driver.findElement(By.xpath("//h1[text()=\"Login\"]")).click();
		
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("Ragul");
	}

}
