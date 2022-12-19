package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliteAirways {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumProject\\Driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	driver.get("https://res.eliteairways.net/");
	driver.manage().window().maximize();
	
	WebElement hotl= driver.findElement(By.xpath("//div[@class='hidden-xs'][1]//child::li[3]/a"));
	hotl.click();
	
	WebElement search= driver.findElement(By.name("query"));
	search.sendKeys("Florida City , FL");
	
	List<WebElement> suggestion =driver.findElements(By.xpath("//div[@class='rs_suggest_absolute']"));
	for (int i = 0; i < suggestion.size(); i++) {
		WebElement s = driver.findElement(By.xpath("//div[@class='rs_suggest_absolute']//child::li[@class='rs_suggest_active']"));
		String text = s.getText();
		if (search.equals(suggestion)) {
			s.click();
			break;
		}
		else {
			continue;
		}
	
	
	}
}}
