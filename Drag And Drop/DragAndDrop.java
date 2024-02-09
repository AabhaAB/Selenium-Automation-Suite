package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://practice.automationtesting.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Demo Site")).click();
		
		driver.findElement(By.partialLinkText("Interactions")).click();
		
		driver.findElement(By.partialLinkText("Drag and Drop")).click(); 
		
		driver.findElement(By.partialLinkText("Static")).click(); 
		
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"node\"]")); 
		
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droparea\"]")); 

		Actions action  = new Actions(driver);
		
		action.dragAndDrop(drag, drop).perform();  //Drag and Drop Element
	}
}
