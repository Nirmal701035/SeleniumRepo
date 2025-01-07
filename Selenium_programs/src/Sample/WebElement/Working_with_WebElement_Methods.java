package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//27/11/24

public class Working_with_WebElement_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Action methods
//		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("small-searchterms")).clear();
//		
//		driver.findElement(By.id("small-searchterms")).sendKeys("phone");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@class=\"button-1 search-box-button\"]")).submit();

		// web-element getters
		// we can use this for the validation that after performing the method that the
		// output value is visible/ received or not
		// for eg: if the transaction is completed we should get the text msg as
		// Transaction successful right. to check that we are going to use getText()
		// method.
//		String text= driver.findElement(By.linkText("Register")).getText();
//		System.out.println(text);//Register
//		Thread.sleep(2000);

		// get the text from the search field
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
	    String text1=driver.findElement(By.xpath("//h1[text()=\"Search\"]")).getText();
	    System.out.println(text1);

		// getAttribute()
		// is used to get the attribute values by taking attribute as an argument
//		String att=driver.findElement(By.xpath("//input[@id=\"pollanswers-1\"]")).getAttribute("type");
//		System.out.println(att);
//		

		// get css values
		// is used to get the css valuse like color,font,etc..... by taking web-element
		// as the argument
//		System.out.println(driver.findElement(By.linkText("Register")).getCssValue("color"));

		// Verification in this we have 3 methods

//		System.out.println(driver.findElement(By.id("small-searchterms")).isEnabled());
//		System.out.println(driver.findElement(By.id("small-searchterms")).isDisplayed());
//		System.out.println(driver.findElement(By.id("small-searchterms")).isSelected());

		// we can give this in if condition to check

		// check if the search text field is displayed
//		if (driver.findElement(By.id("small-searchterms")).isDisplayed()) {
//			driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
//			Thread.sleep(2000);
//		}

		// check if the search Button is Enabled
//		if (driver.findElement(By.id("small-searchterms")).isEnabled()) {
//			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//			Thread.sleep(2000);
//		}

//		driver.navigate().back();

//		driver.findElement(By.id("pollanswers-1")).click();
//		System.out.println(driver.findElement(By.id("pollanswers-1")).isSelected());

//		driver.quit();

	}

}
