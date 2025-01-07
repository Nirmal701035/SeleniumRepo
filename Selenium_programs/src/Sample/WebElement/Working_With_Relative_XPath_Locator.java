package Sample.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Relative_XPath_Locator {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		//for tagname (//tagname[@Attribute = value])
		//if multiple element found then we can use index syntax: {(//tagname[@Attribute = value])[index]} 
//		driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
//		Thread.sleep(3000);
		
		
		//for text value/text Attribute (//tagname[text()="textvalue"])
//		driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
//		Thread.sleep(3000);
		
		
		//(1)contains method for text value
//		driver.findElement(By.xpath("(//a[contains(text(),\"Books\")])[1]")).click();
//		Thread.sleep(2000);
		
		//(2)contains method for attribute value pair
		driver.findElement(By.xpath("//input[contains(@id,\"small-searchterms\")]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[contains(@type,\"submit\")]")).click();
		Thread.sleep(2000);
		
		//(1)Starts with method text value
		//we can use attribute values also syntax: //tagname[starts-with(@AN,"AV")]
		//same like this we have ends with also. we will use this where we will 
		//find something with end value syntax: //tagname[ends-with(@AN,"AV")],//tagname[ends-with(text(),end-text value)]
		driver.findElement(By.xpath("(//a[starts-with(text(),\"Elect\")])[1]")).click();
		Thread.sleep(2000);
		
		
		//Relative X-Path with the combination of AN & "AV" using (AND , OR) operators
		//syntax for attribute value pair tagname[@AV="AV" and @AN="AV"], tagname[@AV="AV" or @AN="AV"]
		//we can also use the combination of AN="AV" and text()=" text value) also
		
		
		driver.close();
	}

}
