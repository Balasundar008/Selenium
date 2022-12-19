package com.selenium;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Shot {
	public static void main(String[] args) throws Throwable    {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		TakesScreenshot ts= (TakesScreenshot) driver;
		File s= ts.getScreenshotAs(OutputType.FILE);
		File d= new File("C:\\Users\\VASANTH\\eclipse-workspace\\Java_Training\\screenshot\\facebook2.png");
		//FileUtils.copyFile(s, d);
		FileHandler.copy(s, d);
	}

}
