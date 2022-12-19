
package com.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser_Launch1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
//		WebElement username= driver.findElement(By.xpath("//input[@name = 'text']"));
//		username.sendKeys("balasundar008@gmail.com");
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOf(username));
//		
//		FluentWait w= new FluentWait(driver)
//				.withTimeout(30,TimeUnit.SECONDS)
//				.pollingEvery(30,TimeUnit.SECONDS)
//				.ignoring(Exception.class);
		
	List<WebElement> links=	driver.findElements(By.tagName("a"));
	for (WebElement link : links) {
		String url= link.getAttribute("href");
		System.out.println(url);
		if (url==null|| url.isEmpty()) {
			System.out.println("url is empty");
			continue;
		}
	
		
		try {
			URL l = new URL(url);
			HttpURLConnection con= (HttpURLConnection)l.openConnection();
			if (con.getResponseCode()>400) {
				System.out.println("broken link");
			}
			else {
				System.out.println("not broken link");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		}}

	}



