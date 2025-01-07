package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Ancestor_Descendant_in_Xpath {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		//Ancestor and descendant technique
		driver.findElement(By.xpath(""));
		
		
		
		//To select the icons in the web page which is created using SVG tags 
		//syntax: //*[local-name()="svg"]
		//for the child
		//syntax: //*[local-name()="svg"]/*[local-name()="tagname"]
	}

}
