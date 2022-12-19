package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//1ST WINDOW
		WebElement wd1=driver.findElement(By.xpath("//a[contains(text(),'Best')]"));
		
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
		WebElement wd2=driver.findElement(By.xpath("//a[contains(text(),'Today')]"));
		
		Actions a1= new Actions(driver);
		
		a.contextClick(wd2).build().perform();
		
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("2ND WINDOW OPENED THERE");
		
		//3RD WINDOW
		
		WebElement wd3=driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		
		Actions a2= new Actions(driver);
		
		a.contextClick(wd3).build().perform();
		
		Robot r2= new Robot();
		r2.keyPress(KeyEvent.VK_PAGE_DOWN);
		r2.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("3RD WINDOW OPENED THERE");
		
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
		
		String ActualTitle= "Amazon.in Bestsellers";
		for (String Particulartitle : allWindow) {
			if (driver.switchTo().window(Particulartitle).getTitle().equals(ActualTitle)) {
				break;
				
			}
			
		
	
		WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("asus rog phone");
		
		WebElement search= driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		
		
		for (String cP : allWindow) {
			if (!cP.equals(Particulartitle)) {
				driver.switchTo().window(cP);
				
			}
			driver.close();
			
		}
			}
			
		
		
		
		
		
		
	}}




