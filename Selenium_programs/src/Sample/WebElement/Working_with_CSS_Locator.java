package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_CSS_Locator {
	public static void main(String[] args) {
		
		//launch the chrome Driver
		WebDriver driver = new ChromeDriver();
		
		//Navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//CSS Locator
//		driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).sendKeys("computers");
//		driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
		
		//using id valuse(# represents id)
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("mobiles");
		
		//using class values(. represents class)
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		
	}

}
