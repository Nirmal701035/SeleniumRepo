package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Absolute_XPath_Locator 
{
	
	public static void main(String[] args) {
		//Absolute X-Path
		//This one is not reliable, consumes more time,not suitable for complex program
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[1]")).sendKeys("mobile");
		
		
	}

}
