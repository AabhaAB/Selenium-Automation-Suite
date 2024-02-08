package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Demo Site")).click(); 
		driver.findElement(By.partialLinkText("SwitchTo")).click(); 
		driver.findElement(By.partialLinkText("Windows")).click(); 
	
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click(); 
		driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button")).click(); 
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator <String> iterator = windowhandles.iterator();
		String Firstwindow = iterator.next();
		System.out.println(Firstwindow);

		String Secondwindow = iterator.next();
		System.out.println(Secondwindow);

		String Thirdwindow = iterator.next();
		System.out.println(Thirdwindow);

		driver.switchTo().window(Secondwindow);

		driver.switchTo().window(Firstwindow);
	}
}
