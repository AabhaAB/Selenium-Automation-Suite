package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://practice.automationtesting.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Demo Site")).click();
		
		driver.findElement(By.partialLinkText("Widgets")).click();
		
		driver.findElement(By.partialLinkText("Slider")).click();
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(element, 20, 80).perform();  //Slide the element
	}
}
