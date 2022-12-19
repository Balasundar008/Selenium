package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class Nested_Frame {
	public static void main(String[] args) throws Throwable    {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);									
		WebElement findElement=driver.findElement(By.id("Click"));
		findElement.click();
		
		String text=findElement.getText();							 
		System.out.println(text);
		
		driver.switchTo().defaultContent();	
		
		driver.switchTo().frame(1);
		WebElement findelElement1= driver.findElement(By.id("frame2"));
		driver.switchTo().frame(findelElement1);
		
		
		WebElement findelElement2= driver.findElement(By.id("Click1"));
		findelElement2.click();
		
		String text1= findelElement2.getText();
		System.out.println(text1);
		
		List<WebElement>findelElements= driver.findElements(By.tagName("iframe"));		//for count how much frames in it
		System.out.println(findelElements.size());
		
		driver.switchTo().defaultContent();
		
		
		
		

}}

