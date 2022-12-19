package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class Java_Executor {
	public static void main(String[] args) throws Throwable    {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement cn= driver.findElement(By.xpath("//h2[text()='C# NuGet']"));		//by web element method
		js.executeScript("arguments[0].scrollIntoView(true)",cn);
		//js.executeScript("arguments[0].click;", args);
			
//		js. executeScript("window.scrollBy(0,500)","");								//for scroll up
//		Thread.sleep(5000);
//		
//		js.executeScript("window.scrollBy(0,-500)","");								//for scroll down
//		Thread.sleep(5000);
//		
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");		//for full page scroll up& down
//		Thread.sleep(5000);
//		
//		js.executeScript("window.scrollBy(0,0)","");								//for back to normal 
//		Thread.sleep(5000);
	
	
		
		

}
}