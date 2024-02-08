package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsMethod {

	public static void main(String[] args) { 
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://practice.automationtesting.in/");
		
		driver.manage().window().maximize(); 
		
		driver.findElement(By.partialLinkText("Account")).click();   //click the element
		
		driver.findElement(By.id("username")).sendKeys("a1b2c3@gmail"); // Send keys
		driver.findElement(By.id("username")).clear(); // Clear text
		driver.findElement(By.id("username")).sendKeys("a1b2c3@gmail.com");
		driver.findElement(By.name("password")).sendKeys("A1@b2@c3@");
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		
		driver.findElement(By.partialLinkText("Demo Site")).click(); 

		System.out.println(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).getAttribute("class"));  //Get Attribute
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).getCssValue("color"));  //Get CSS Value

		System.out.println(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).getSize());  //Get Size

		System.out.println(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).getLocation());  //Get Location

		System.out.println(driver.findElement(By.xpath("//*[@id=\"section\"]/div/h2")).getText());  //Get Text

		System.out.println(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).getTagName());  //Get TagName

		System.out.println(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).isDisplayed());  //Is Displayed

		System.out.println(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).isEnabled());  //Is Enabled
		
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).isSelected());  //Is Selected
	}
}
