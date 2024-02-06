package Selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://practice.automationtesting.in/");  //Get Method
		
		driver.manage().window().maximize();  //Manage Method
		
		String currentUrl = driver.getCurrentUrl();  //Get Current URL Method
		System.out.println(currentUrl);
		
		String Title = driver.getTitle();  //Get Title Method
		System.out.println(Title);
		
		String pagesource = driver.getPageSource();  //Get Page Source Method
		System.out.println(pagesource);
		
		driver.navigate().to("https://automationexercise.com/"); // Navigate Method
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();  //Find Element Method
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("abc321@gmail.com");  
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("abc@321"); 
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();  
		
		List<WebElement> webelements =driver.findElements(By.xpath("//div[@class=\"col-sm-4\"]/div"));  //Find Elements Method
		System.out.println(webelements);
		
		String windowhandle = driver.getWindowHandle();    //Get Window Handle Method
		System.out.println(windowhandle);

		driver.findElement(By.xpath("//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/a[2]/button")).click(); 
		Set <String> windowhandles = driver.getWindowHandles(); // Get Window Handles Method
		System.out.println(windowhandles);
		
		driver.close(); //Close current window

		driver.quit();  //Quite every window
	}
}
