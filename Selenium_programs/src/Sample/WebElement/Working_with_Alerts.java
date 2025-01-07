package Sample.WebElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Alerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

//......//Simple Alert		
//		driver.get("https://demowebshop.tricentis.com/");
//				
//		//click on search button without entering anything on the search text field
//		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//		Thread.sleep(2000);
//		//handle the alert
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		System.out.println("Alert was handled");
		
//......//Confirmation Alert
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("788954");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		driver.close();
	}

}
