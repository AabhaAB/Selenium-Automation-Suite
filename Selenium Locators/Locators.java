package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver(); //Launch browser
		
		driver.get("http://practice.automationtesting.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Account")).click();    // partialLinkText locator
		
		driver.findElement(By.id("username")).sendKeys("a1b2c3@gmail.com"); // id locator

		driver.findElement(By.name("password")).sendKeys("A1@b2@c3@"); // name locator
		
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click(); // xpath locator

		driver.findElement(By.cssSelector("#menu-item-40 > a")).click(); // CSS Selector locator
		
		driver.findElement(By.className("orderby")).click(); // Class Name locator
		
		driver.findElement(By.linkText("Android")).click();    // Link Text locator
		
	}

}
