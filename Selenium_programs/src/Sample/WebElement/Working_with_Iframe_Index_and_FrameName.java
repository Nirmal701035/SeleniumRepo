package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Iframe_Index_and_FrameName {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///D:/Iframe.html");

////		// switch to frame by [index]
//		driver.switchTo().frame(0);
//
//		// continue with regular approach
//
//		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
//		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//		Thread.sleep(2000);
//
//		// switching back to the main page
//		driver.switchTo().defaultContent();
//
//		// clicking the google link
//		driver.findElement(By.linkText("Google")).click();
		
		
//		//switch to frame by [name]
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		
		//regular approach
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//switching back
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Google")).click();

		Thread.sleep(2000);
		driver.close();
	}

}
