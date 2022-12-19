package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static WebDriver driver;
	
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumProject\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/population-by-country/");
		driver.manage().window().maximize();
		
		
	

	}
	public static void allHeaders() {
		System.out.println("======All Headers===========");
		List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@id='example2']/thead/tr/th"));
		for (WebElement header : allHeaders) {
			System.out.println(header.getText());	
		}
		
		
		
	}
	public static void allData() {
		System.out.println("====== allData===========");
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='example2']/tbody/tr/td"));
		for (WebElement Data : allData) {
			System.out.println(Data.getText());	
		}
		
	}
	public static void RowWise() {
			System.out.println("======RowWise===========");
			List<WebElement> RowWise = driver.findElements(By.xpath("//table[@id='example2']/tbody/tr[235]/td"));
		for (WebElement Row : RowWise) {
			System.out.println(Row.getText());
			
		}	
			}
	public static void ColumnWise() {
		System.out.println("======ColumnWise===========");
		List<WebElement> ColumnWise = driver.findElements(By.xpath("//table[@id='example2']/tbody/tr/td//a[text()='India']"));
	for (WebElement Column : ColumnWise) {
		System.out.println(Column.getText());
		
	}	}
	
	public static void particularData() {
		System.out.println("======particularData===========");
		List<WebElement> particularData = driver.findElements(By.xpath("//table[@id='example2']/tbody/tr[235]/td[5]"));
	for (WebElement data : particularData) {
		System.out.println(data.getText());
	
	
}
	}
	public static void main(String[] args) {
	browserLaunch();
	allHeaders();
	allData();
	RowWise();
	ColumnWise();
	particularData();
	
}}
