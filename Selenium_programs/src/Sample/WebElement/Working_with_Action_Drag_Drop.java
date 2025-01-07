package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Action_Drag_Drop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		Thread.sleep(2000);

		Actions action = new Actions(driver);

		// in this method we have to find 2 web-elements from where we have to drag and
		// where to drop

		// 1. source web element(from)
		WebElement src = driver.findElement(By.id("box3"));

		// 2.targeted web element(to)
		WebElement target = driver.findElement(By.id("box103"));

		action.dragAndDrop(src, target).perform();

		// example 2

		WebElement src1 = driver.findElement(By.id("box6"));
		WebElement target1 = driver.findElement(By.id("box106"));

		action.dragAndDrop(src1, target1).perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
