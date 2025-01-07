package Sample.WebElement;
//28/11/24
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_ActionsMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//launch the application mouse hover on computer
		 
		WebElement computer = driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
		
		Actions actions = new Actions(driver);
		
		
		//the build method() basically builds the mouse action
		//the perform() it performs whatever the mouse action build
		//we can also directly call perform() method which internally call build() method.
		
		//moveToElement() method is like we hovering a webelement in the webpage using mouse.
		actions.moveToElement(computer).build().perform();
		Thread.sleep(2000);
		
		WebElement desktop = driver.findElement(By.xpath("(//a[contains(text(),\"Desktops\")])[1]"));
		
		Actions actions1 = new Actions(driver);
		
		actions1.moveToElement(desktop).click().build().perform();
		Thread.sleep(2000);
		
		
		driver.quit();
		

	}

}
