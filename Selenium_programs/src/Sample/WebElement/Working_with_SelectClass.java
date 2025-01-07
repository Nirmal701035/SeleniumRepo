package Sample.WebElement;

import java.util.List;

//28/11/24
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_with_SelectClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demowebshop.tricentis.com/");

		driver.manage().window().maximize();

		// click the Books
		driver.findElement(By.xpath("(//a[@href=\"/books\"])[1]")).click();

		// identify the web element
		WebElement dropdown = driver.findElement(By.id("products-orderby"));

		// create an obj of Select class
		Select obj = new Select(dropdown);
		// select by visible text
		obj.selectByVisibleText("Name: A to Z");

		// select by values
//		obj.selectByValue("https://demowebshop.tricentis.com/books?orderby=11");

		// select by index position
//		obj.selectByIndex(3);

		// example2
//		WebElement display = driver.findElement(By.id("products-pagesize"));
		// Display WebElement
//		Select obj2 = new Select(display);
		// select by value method
//		obj2.selectByValue("https://demowebshop.tricentis.com/books?pagesize=4");

		// other methods of Select Class
		// get options method
//		WebElement dropdown = driver.findElement(By.id("products-orderby"));
//		
//		Select obj3 = new Select(dropdown);
//		
//		List<WebElement> options = obj3.getOptions();
//		for(WebElement element:options)
//		{
//			System.out.println(element.getText());
//		}

//		//example
//		WebElement display = driver.findElement(By.id("products-pagesize"));
//		
//		Select obj4 = new Select(display);
//		//using get option method 
//		List<WebElement> num =obj4.getOptions();
//		
//		for(WebElement element:num)
//		{
//			System.out.println(element.getText());
//		}

		// to check weather this drop-down is multi-select or not(takes multiple options
		// or not)
//		System.out.println(obj4.isMultiple());

		// To De-Select the already selected option we use deSelect() method
		//it is only used to de-select multi-select options

		
	}

}
