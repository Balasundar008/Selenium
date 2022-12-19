package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenExcel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath(""));
		userName.sendKeys("balasundar008@gmail.com");
		WebElement passWord = driver.findElement(By.xpath(""));
		passWord.sendKeys("1122334455");
		WebElement logIn=driver.findElement(By.xpath(""));
		logIn.click();
		
		
	}

}
