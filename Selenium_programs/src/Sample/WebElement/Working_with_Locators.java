package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Locators {

	public static void main(String[] args) throws InterruptedException {
		//Test Case: launch chrome browser, Navigate to the URL(some webpage)
		//enter somthing in the search fied.
		
		//launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//enter the text in search text field
		//Name Locator  
//		WebElement searchfield=driver.findElement(By.name("q"));
//		searchfield.sendKeys("mobiles");
		
		//ID Locator
//		driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
		
		//Link Text Locator
		//Case: click on Register
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.linkText("Log in")).click();
		
		//Partial linkText()
		driver.findElement(By.partialLinkText("Shopping")).click();
		Thread.sleep(2000);
		
		//TagName Locator()
		//Enter text in the subscribe text field
		driver.findElement(By.tagName("input")).sendKeys("test@123");
		//note:it will always choose the first one in that name.<input> might be present more than once.
		
		//className() Locator
		driver.findElement(By.className("search-box-text")).sendKeys("cars");
		//it won't accept space in-between but accept partial word before the space.
		
		driver.close();
		
	}

}
