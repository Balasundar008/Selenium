package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Navigate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		String title= driver.getTitle();
		System.out.println("Current Title"+title);
		Thread.sleep(2000);
		
		String CurrentUrl= driver.getCurrentUrl();
		System.out.println("Current url"+CurrentUrl);
		Thread.sleep(2000);
	}

}
