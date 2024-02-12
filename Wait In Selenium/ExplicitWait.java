package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");
		
		driver.manage().window().maximize();
				
		WebElement element = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]"));
		
		Actions action = new Actions(driver); 
		
		action.moveToElement(element).perform();	
		
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //Explicit Wait
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cartModal']/div/div/div[2]/p[2]/a/u"))).click();
		
	}
}
