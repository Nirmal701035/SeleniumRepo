package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_AutoSuggestion_DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
//[
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		//finding the search field
//		driver.findElement(By.id("small-searchterms")).sendKeys("comp");
//		//hear thread.sleep is quit mandate because it will take some time to give auto-suggestion
//		//if no time given we might get NoSuchElement Exception
//		Thread.sleep(1000);
//		//clicking a particular web-element in auto-suggestion drop down
//		driver.findElement(By.xpath("(//a[contains(text(),\"Build your own expensive computer\")])[2]")).click();
//]
		//using flip-kart
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("puma");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[contains(text(),\" t shirt\")]")).click();
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
