package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Demo Site")).click(); 
		driver.findElement(By.partialLinkText("SwitchTo")).click(); 
		driver.findElement(By.partialLinkText("Alerts")).click(); 
		
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click(); 
		String alertText1 = driver.switchTo().alert().getText();  //Get the Text of Alert
		System.out.println(alertText1);
		driver.switchTo().alert().accept();  //Accept the Alert

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click(); 
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click(); 
		String alertText2 = driver.switchTo().alert().getText();
		System.out.println(alertText2);
		driver.switchTo().alert().dismiss();  //Cancel The Alert
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click(); 
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click(); 
		driver.switchTo().alert().sendKeys("Automation User");  //Send Text to the Alert Text box
		String alertText3 = driver.switchTo().alert().getText();
		System.out.println(alertText3);
		driver.switchTo().alert().accept();
	}
}
