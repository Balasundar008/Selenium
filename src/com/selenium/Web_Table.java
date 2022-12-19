package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		 System.out.println("Print all data");
		 List<WebElement> allData= driver.findElements(By.xpath("//table/tbody/tr/td"));
		 for (WebElement webElement : allData) {
			 System.out.println(webElement.getText());
		 }
			 System.out.println("*****");
			
		
		 System.out.println("Print row data");
		 List<WebElement> rData= driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		 for (WebElement webElement : rData) {
			 System.out.println(webElement.getText());
		 }
			 System.out.println("*****");
			
	
		 System.out.println("Print particular data");
		 WebElement pdata= driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]"));
		 System.out.println(pdata.getText());
		 driver.close();

}}
