package seleniumpractice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindwHandlngPractice {
		public static void main(String[] args) throws Throwable    {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumProject\\Driver\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/?gws_rd=ssl");
	Thread.sleep(2000);
	
	WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
	searchbox.sendKeys("facebook");
	Actions a= new Actions(driver);

	Robot r= new Robot();
	a.contextClick(searchbox).build().perform();

	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement fb = driver.findElement(By.xpath("//h3[text()='Facebook - log in or sign up']"));
	fb.click();
	Thread.sleep(2000);

//	driver.navigate().back();
	
	
	WebElement searchbox1 = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	searchbox1.sendKeys("instagram");
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement insta = driver.findElement(By.xpath("//h3[text()='Instagram']"));
	a.contextClick(insta).build().perform();
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);

	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);


}}
