package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
	 
		public static void main(String[] args) throws Throwable    {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
//			WebDriver driver= new ChromeDriver();
//			driver.get("http://www.leafground.com/pages/Alert.html");
//			Thread.sleep(2000);
//			
//			driver.manage().window().maximize();
//			Thread.sleep(2000);
//			
//			WebElement findElement = driver.findElement(By.xpath("//button[text()='Alert Box']"));
//			WebElement findElement = driver.findElement(By.xpath("//*[text()='Alert Box']"));
//			findElement.click();
//			Thread.sleep(2000);										//x path by text
//			Alert a=driver.switchTo().alert();
//			a.accept();
//			Thread.sleep(2000);
//			
//			WebElement findElement2 = driver.findElement(By.xpath("// button[text()='Confirm Box']"));
//			findElement2.click();
//			Thread.sleep(2000);										//x path by text
//			Alert a1=driver.switchTo().alert();
//			a1.accept();
//			Thread.sleep(2000);
//			
//			WebElement findElement3= driver.findElement(By.xpath("// button[text()='Prompt Box']"));
//			findElement3.click();
//			Thread.sleep(2000);										//x path by text
//			Alert a2=driver.switchTo().alert();
//			a2.sendKeys("bala");
//			a2.accept();
//			Thread.sleep(2000);
//			
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Alert.html");
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement findElement = driver.findElement(By.xpath("// button[@onclick='normalAlert()']"));
			findElement.click();
			Thread.sleep(2000);										//x path by name. normal mtd
			Alert a=driver.switchTo().alert();
			a.accept();
			Thread.sleep(2000);
				
				
			
			
			
			
			
			

}}
