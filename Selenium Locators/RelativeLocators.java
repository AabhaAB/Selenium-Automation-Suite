package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver(); //Launch browser
		
		driver.get("http://practice.automationtesting.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Account")).click(); 


		//Relative Locator
		By emailLocator = RelativeLocator.with(By.tagName("input")).above(By.id("password")); // Above Locator
		driver.findElement(emailLocator).sendKeys("a1b2c3@gmail.com");
		
		By passwordLocator = RelativeLocator.with(By.tagName("input")).below(By.id("username"));  //Below Locator
		driver.findElement(passwordLocator).sendKeys("A1@b2@c3@");
		
		By RememberMeLocator = RelativeLocator.with(By.tagName("input")).toRightOf(By.name("login"));;  //toRightOf Locator
		driver.findElement(RememberMeLocator).click();
		
		By LoginLocator = RelativeLocator.with(By.tagName("input")).toLeftOf(By.id("rememberme"));;  //toLeftOf Locator
		driver.findElement(LoginLocator).click();
		
		driver.findElement(By.name("EMAIL")).sendKeys("a1b2c3@gmail.com");
		
		By SubscribeLocator = RelativeLocator.with(By.tagName("input")).near(By.name("EMAIL"));;  //Near Locator
		driver.findElement(SubscribeLocator).click();
		
		
	}

}
