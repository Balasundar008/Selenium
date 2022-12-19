package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class Wait {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.NANOSECONDS);		//by implicit wait

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)", ""); // for scroll up
		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,-500)", ""); // for scroll down
		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", ""); // for full page scroll up& down
		Thread.sleep(5000);

		js.executeScript("window.scroll(0,0)", ""); // for back to normal

	}
}
