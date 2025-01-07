package Sample.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_Screenshot_WebElement {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement search =	driver.findElement(By.id("newsletter-email"));
		search.sendKeys("ezhil@gmail.com");
		
		//typecasting
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = search.getScreenshotAs(OutputType.FILE);
		File desti = new File("./Screenshots/search.png");
		FileHandler.copy(src, desti);
		
		
		WebElement button = driver.findElement(By.id("newsletter-subscribe-button"));
		button.click();
		
		File src1 = button.getScreenshotAs(OutputType.FILE);
		File desti1 = new File("./Screenshots/button.png");
		FileHandler.copy(src1, desti1);
		
		
		
		
		driver.close();
		
		
		
	}

}
