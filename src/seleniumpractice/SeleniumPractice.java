package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//		WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/form/div[1]/div[1]/input"));
//		username.sendKeys("balasundar008@gmail.com");
		
//		WebElement username=driver.findElement(By.xpath("//form/div[1]/div/input"));
//		username.sendKeys("balasundar008@gmail.com");
		
		WebElement username = driver.findElement(By.xpath("//form[@method='post']/child::div[1]/child::div[1]/input"));
		username.sendKeys("balasundar008@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
		password.sendKeys("87546382");
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
		login.click();
	}
	

}
