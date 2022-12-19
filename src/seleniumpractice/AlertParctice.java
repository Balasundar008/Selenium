package seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertParctice {
		
		public static void main(String[] args) throws Throwable    {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumProject\\Driver\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement alert = driver.findElement(By.xpath("//button[text()='Alert Box']"));
	alert.click();
	Alert a= driver.switchTo().alert();
	a.accept();
	
	WebElement cAlert = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
	cAlert.click();
	Alert a1= driver.switchTo().alert();
	a1.dismiss();
	
	WebElement cAlert1 = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
	cAlert1.click();
	Alert a2= driver.switchTo().alert();
	a2.sendKeys("bala");
	a2.accept();
	
	WebElement cAlert11 = driver.findElement(By.xpath("//button[text()='Line Breaks?']"));
	cAlert11.click();
	Alert a3= driver.switchTo().alert();
	a3.accept();
	
	
	
	
	
	
	
	
	
	
	
}}
