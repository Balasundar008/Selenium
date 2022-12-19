package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class Frame {
	public static void main(String[] args) throws Throwable    {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);									//switch from normal frame to body 
		WebElement findElement=driver.findElement(By.id("Click"));
		findElement.click();
		
		String text=findElement.getText();							//get the text comes from that page  
		System.out.println(text);
		
		driver.switchTo().defaultContent();							//for quit from that page not by showing

}}
