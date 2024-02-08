package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); //Launch browser
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Demo Site")).click(); 
		
		WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		Dropdown.click();
		Dropdown.sendKeys("C++");
		Dropdown.sendKeys(Keys.ENTER);
	}
}
