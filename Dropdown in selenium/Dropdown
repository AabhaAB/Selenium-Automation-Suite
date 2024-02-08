package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); //Launch browser
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Demo Site")).click(); 
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		
		Select select = new Select(dropdown);
		
		select.selectByValue("Java"); //Select DropDown by Value
		Thread.sleep(2000);
		
		select.selectByIndex(4);   //Select DropDown by Index
		Thread.sleep(2000);

		select.selectByVisibleText("Data Analytics");  //Select DropDown by Visible Text
		Thread.sleep(2000);		
	}
}
