package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Windowhandling_Task {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement close= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		
		
		//1ST WINDOW
		WebElement wd1=driver.findElement(By.xpath("//img[@alt='Top Offers']"));
		
		Actions a= new Actions(driver);
		
		a.contextClick(wd1).build().perform();
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("1ST WINDOW OPENED HERE");
		
		//2ND WINDOW
		WebElement wd2=driver.findElement(By.xpath("//img[@alt='Grocery']"));
		
		Actions a1= new Actions(driver);
		
		a.contextClick(wd2).build().perform();
		
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("2ND WINDOW OPENED THERE");
		

		
		int size= driver.getWindowHandles().size();
		System.out.println("WINDOW COUNT"+ size);
		System.out.println("END");
		
		String pw= driver.getWindowHandle();
		System.out.println("PARENT WINDOW ID"+pw);
		System.out.println("END");
		
		Set<String> allWindow = driver.getWindowHandles();
		for (String window : allWindow) {
			String title = driver.switchTo().window(window).getTitle();
		System.out.println("All Window Title"+title);
	}
		System.out.println("END");
		
		String ActualTitle= "Flipkart Offers & Deals of the Day - Get Best Discounts on Mobiles, Electronics, Fashion & Home etc.";
		for (String Ptitle : allWindow) {
			if (driver.switchTo().window(Ptitle).getTitle().equals(ActualTitle)) {
		break;				
		}
			
		}
		WebElement searchbox= driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchbox.sendKeys("asus rog phone");
		WebElement search= driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		search.click();
		
		
		
		


		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("window.scroll(0,document.body.scrollHeight)","");		//for full page scroll up& down
		Thread.sleep(5000);
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File s= ts.getScreenshotAs(OutputType.FILE);
		File d= new File("C:\\Users\\VASANTH\\eclipse-workspace\\Java_Training\\screenshot\\flipkart2.png");
		//FileUtils.copyFile(s, d);
		FileHandler.copy(s, d);
		
	
		




}}
