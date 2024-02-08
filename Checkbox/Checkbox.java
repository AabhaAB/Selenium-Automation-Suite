package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://practice.automationtesting.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Demo Site")).click(); 
		
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click(); // Select Checkbox
		
		driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();   // Select Checkbox
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).isSelected());   //Print Checkbox is Selected or Not
		
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();  // Deselect Checkbox

		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());  // Total Checkboxes available in the webpage
	}
}
