package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Locator2 {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome browser.
		// Navigate to a web Shop Application.
		// Click on register link.
		// Enter the details in the register page.
		// click on register button.
		// close the browser.

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();

		// click on register link
		driver.findElement(By.linkText("Register")).click();

//	Enter the details on the register link

		// click on gender web Element
		driver.findElement(By.id("gender-male")).click();

		// enter text in first name
		driver.findElement(By.name("FirstName")).sendKeys("Ragul");

		// enter text in last name field
		driver.findElement(By.id("LastName")).sendKeys("R");

		// enter the text in email
		driver.findElement(By.id("Email")).sendKeys("ragul@123");

		// enter the text in password field
		driver.findElement(By.name("Password")).sendKeys("secret");

		// enter the text in conform Password field
		driver.findElement(By.id("ConfirmPassword")).sendKeys("secret");

		// click on register button
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);

		driver.quit();

	}
}

