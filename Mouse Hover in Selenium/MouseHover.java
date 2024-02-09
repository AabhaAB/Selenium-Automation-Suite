package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://practice.automationtesting.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Demo Site")).click();
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
		
		Actions action = new Actions(driver);  //Actions Class is used to mouse hover
		
		action.moveToElement(element).perform();
	}
}
