package Sample.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Web_Practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(
				"https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=CjwKCAiA0rW6BhAcEiwAQH28IjdCw-eHihKMtzppJOKCvKjKLkessYvFFigSzDmJCuyZWsn-NfptahoCbWcQAvD_BwE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		Actions action = new Actions(driver);

		// For Depart
		action.moveToElement(driver.findElement(By.xpath("(//p[contains(text(),\"Enter city or airport\")])[1]")))
				.click().perform();
		action.moveToElement(driver.findElement(By.xpath("(//p[contains(text(),\"Enter city or airport\")])[1]")))
				.sendKeys("Chennai").perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),\"Chennai\")]")).click();

		// For Arrival
		action.moveToElement(driver.findElement(By.xpath("//p[contains(text(),\"Enter city or airport\")]"))).click()
				.perform();
		action.moveToElement(driver.findElement(By.xpath("//p[contains(text(),\"Enter city or airport\")]")))
				.sendKeys("Bengaluru").perform();
		driver.findElement(By.xpath("//span[contains(text(),\"Bengaluru, India\")]")).click();

		// For Date
		action.moveToElement(driver.findElement(By.xpath("//span[@class=\"sc-12foipm-8 eXKWBG fswDownArrow\"]")))
				.click().perform();
		action.moveToElement(driver.findElement(By.xpath("(//p[@class=\"fsw__date\"])[4]"))).click().perform();
		
		//For No of Tickets
		action.moveToElement(driver
				.findElement(By.xpath("//span[@class=\"sc-12foipm-8 eXKWBG fswDownArrow fswDownArrowTraveller\"]")))
				.click().perform();
		//For Adults
		driver.findElement(By.xpath("(//*[local-name()=\"svg\"])[3]")).click();
		//For Children
		action.moveToElement(driver.findElement(By.xpath("(//*[local-name()=\"svg\"])[5]"))).doubleClick().perform();
		//For Infants
		action.moveToElement(driver.findElement(By.xpath("(//*[local-name()=\"svg\"])[7]"))).doubleClick().perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),\"SEARCH\")]")).click();
		
		Thread.sleep(15000);
		List<WebElement> element = driver.findElements(By.xpath("//span[@name=\"SRP_Carrier_Name\"]"));
		
		for(WebElement flights:element) {
			System.out.println(flights.getText());
		}

		Thread.sleep(2000);
		driver.close();
	}

}
