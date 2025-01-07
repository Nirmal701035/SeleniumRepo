package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CitiBank_Practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cityunionbank.com/");
		
		
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		
		action.moveToElement(driver.findElement(By.xpath("//button[@class=\"dropbtn\"]"))).click().perform();
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),\"Personal Banking\")]"))).click().perform();
		
		driver.findElement(By.id("uid")).sendKeys("Nirmal");
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//button[@value=\"Submit\"]")).click();
		
		
		Thread.sleep(2000);
		driver.close();
	}

}

////h3[contains(text(),"Women's bowling rankings")]/../following-sibling::div/div/div/div/following-sibling::div/div/
//following-sibling::div/div/following-sibling::div/following-sibling::div/following-sibling::div/div/
//following-sibling::div/div/div/h3/div/a/span[contains(text(),"Deepti")]



















