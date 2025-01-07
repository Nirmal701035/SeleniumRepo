package Sample.WebElement;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_MultipleWindows {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

//			driver.get();

		// identify the parent window and printing it, which will give a unique alpha
		// numerical value
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);

		// executing the functionality which will open the child window
		driver.findElement(null).clear();

		Set<String> childwindow = driver.getWindowHandles();
		System.out.println(childwindow);
		// printing childwindow will give a Set of alpha numerical values of
		// all the child windows along with the parent window

		// now we need to iterate on the Set of windows to get a particular window
		for (String window : childwindow) {
			// switching to child windows using switchTo() method and then calling
			// window method which takes String name or Handle as an argument
			driver.switchTo().window(window);
			String title = driver.getTitle();
			System.out.println(title);
			// it will print the title of all the windows along with the title of the parent
			// window
		}

		// switch back to parent window
		driver.switchTo().window(parentwindow);
		// if we use driver.close() method now it will close only the parent windows
		// leaving the child windows open. using quit() method will closs all the windows.

	}
}
