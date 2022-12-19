package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Xpath {
	public static void main(String[] args) throws Throwable    {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//WebElement findElement= driver.findElement(By.xpath("//a[text()='Gmail']"));  //Xpath by text
		//findElement.click();
		
//		WebElement findElement= driver.findElement(By.xpath("//a[text()='Gmail']"));	//Xpath by attribute name,value
//		findElement.click();
		
		//WebElement findElement= driver.findElement(By.xpath("//a[contains(text(),'G')]"));  //Xpath by text with contains
		//findElement.click();
		
//		WebElement findElement2 = driver.findElement(By.cssSelector("[class*='gb_d']"));   //css locator using star
//		findElement2.click();
//		
//		WebElement findElement3 = driver.findElement(By.cssSelector("[class^='gb_d']"));  //css locator using exponential
//		findElement3.click();
		
//		WebElement findElement4 = driver.findElement(By.cssSelector("[class$='gb_d']"));	// //css locator using dollar
//		findElement4.click();
//		
//		WebElement findElement5 = driver.findElement(By.cssSelector("a[class='gb_d']"));	 //css locator using without any special character
//		findElement5.click();
//		
		WebElement findElement5 = driver.findElement(By.cssSelector("[class='gb_d']"));		// //css locator using without tagname
		findElement5.click();
		
		
}
}