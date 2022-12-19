package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {
	public static void main(String[] args) throws Throwable    {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumProject\\Driver\\chromedriver.exe");

WebDriver driver= new ChromeDriver();
driver.get("http://testleaf.herokuapp.com/pages/frame.html");
Thread.sleep(2000);

driver.manage().window().maximize();
Thread.sleep(2000);

driver.switchTo().frame(0);
WebElement clck = driver.findElement(By.id("Click"));
clck.click();
String text = clck.getText();
System.out.println(text);

driver.switchTo().defaultContent();

driver.switchTo().frame(1);
WebElement iNframe1 = driver.findElement(By.id("frame2"));
driver.switchTo().frame(iNframe1);


WebElement clck1 = driver.findElement(By.id("Click1"));
clck1.click();

List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
int size = totalframes.size();
System.out.println(size);

driver.switchTo().defaultContent();



}}
