package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	public static void main(String[] args) throws Throwable    {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement findElement= driver.findElement(By.id("dropdown1"));
		Select s= new Select(findElement);
		s.selectByIndex(1);
		
		WebElement findElement2= driver.findElement(By.name("dropdown2"));
		Select s1= new Select(findElement2);
		s1.selectByVisibleText("Appium");
		
		WebElement findElement3= driver.findElement(By.id("dropdown3"));
		Select s2= new Select(findElement3);
		s2.selectByValue("3");
		
		

}}
