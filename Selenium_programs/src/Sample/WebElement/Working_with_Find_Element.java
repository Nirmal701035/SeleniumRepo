package Sample.WebElement;

//28/11/24
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Find_Element {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		driver.manage().window().maximize();

		// to check the list of radio buttons
//		List<WebElement> radio=driver.findElements(By.xpath("//input[@name=\"pollanswers-1\"]"));
//		//System.out.println(radio);
//		iteration
//		for(int i=0; i<radio.size();i++)
//		{
//		System.out.println(radio.get(i).isSelected());
//		}

		// To get the links on the webpage
//		List<WebElement> anchor=driver.findElements(By.xpath("//a"));
		// iteration
//		for(int i=0;i<anchor.size();i++) {
//			System.out.println(anchor.get(i).getText());
//		}

		// another iteration
//		for(WebElement element:anchor) {
//		System.out.println(element.getAttribute("href"));
//		}

//		List<WebElement> radio = driver.findElements(By.xpath("//input[@name=\"pollanswers-1\"]"));
//		
//		//iteration using forEach method
//		for(WebElement i:radio)
//		{
//			i.click();
//			Thread.sleep(2000);
//			System.out.println(i.isSelected());
//		}

		List<WebElement> button = driver.findElements(By.xpath("//input[@type=\"button\"]"));
		for (WebElement element : button) {
			System.out.println(element.getAttribute("value"));
		}

		driver.quit();
	}

}
