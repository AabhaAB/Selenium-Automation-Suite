package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://practice.automationtesting.in/");
		
		driver.manage().window().maximize(); 
		
		driver.findElement(By.partialLinkText("Shop")).click(); 
		
		List<WebElement> allTags = driver.findElements(By.tagName("a"));
		System.out.println("Total tags are: "+allTags.size()); //Print Total Links of a Webpage
		
		for(int i=0; i<allTags.size(); i++) {
			System.out.println("Links on webpage are: "+allTags.get(i).getAttribute("href"));
			System.out.println("Links are: "+allTags.get(i).getText());
		}
	}
}
