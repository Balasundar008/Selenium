package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Bymouse {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);

//		driver.manage().window().maximize();
//		Thread.sleep(2000);
		
		Actions a= new Actions(driver);
		 
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Images']"));
		//a.click(findElement).build().perform();
		//a.doubleClick(findElement).build().perform();
		a.contextClick(findElement).build().perform();
		
		Dimension d=new Dimension(250,250);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		
		Point p=new Point(250,250);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		

}}
