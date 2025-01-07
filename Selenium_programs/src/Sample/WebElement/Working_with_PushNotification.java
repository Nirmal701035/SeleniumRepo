package Sample.WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Working_with_PushNotification {
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.easemytrip.com");
		//push notification can be handled by Chrome-Options class
		//this class will give the flexibility to modify some of the settings on the Chrome browser
		//to work on chrome driver class we have chrome option class
	}

}
