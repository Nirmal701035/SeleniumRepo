package Sample.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
				
		//typecast to get the capabilities of takeScreenshort interface to the driver instance
		
		//Step.1: Typecasting
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//Step.2: temporary Location
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		//Step.3: destination file
		File destinationfile = new File("./Screenshots/Homepage.png");
		//Step.4: to copy from temporary location to the folder we have to use copy method
		FileHandler.copy(srcfile, destinationfile);
		
		System.out.println("Home page launched successfully");
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		//Screenshot after clicking the search button
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File destfile1 = new File("./Screenshots/one.png");
		FileHandler.copy(src1, destfile1);
		System.out.println("Second screen shot");
		
		driver.close();
	}
}
