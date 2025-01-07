package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_iframe_WebElementMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Iframe.html");
		Thread.sleep(2000);
		
		//switch to frame by Web-Element
		driver.switchTo().frame(driver.findElement(By.id("fr1")));
		
		driver.findElement(By.id("newsletter-email")).sendKeys("Akaraezhilarasi");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Google")).click();
		
	}

}
