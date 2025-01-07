package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		WebElement searchfield = driver.findElement(By.id("small-searchterms"));
		
//		action.moveToElement(searchfield).click().sendKeys("mobiles").perform();
		
		
		//keys up AND keys Down
		action.moveToElement(searchfield).click()
		//now we have to press the shift key to make it to upper case
		.keyDown(Keys.SHIFT).sendKeys("mobiles").keyUp(Keys.SHIFT).perform();

	}

}
