package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://practice.automationtesting.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Demo Site")).click(); 
		
		WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")); 
		
		radiobutton.click();  // Click RadioButton
		
		System.out.println(radiobutton.isSelected()); //Check RadioButton is selected or not
	
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());  // Total RadioButton available in the webpage
	}
}
