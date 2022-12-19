package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Movetoelement {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		//Thread.sleep(2000);

		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		Actions a= new Actions(driver);
		
		WebElement from= driver.findElement(By.id("draggable"));
		WebElement to= driver.findElement(By.id("droppable"));
		
		//a.dragAndDrop(from, to).build().perform();
		a.clickAndHold(from).moveToElement(to).release(to).build().perform();
		Thread.sleep(5000);
		//driver.close();
		
		
		
		 

}}
