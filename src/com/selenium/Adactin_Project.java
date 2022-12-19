package com.selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Project {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.name("username"));
		Username.sendKeys("Balasundar96");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("1122334455");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		WebElement location = driver.findElement(By.name("location"));
		Select S= new Select(location);
		S.selectByVisibleText("Brisbane");
		
		WebElement Hotels = driver.findElement(By.name("hotels"));
		Select S1= new Select(Hotels);
		S1.selectByValue("Hotel Hervey");
		
		WebElement RoomType = driver.findElement(By.name("room_type"));
		Select S2= new Select(RoomType);
		S2.selectByVisibleText("Super Deluxe");
		
		WebElement NoOfRooms = driver.findElement(By.name("room_nos"));
		Select S3= new Select(NoOfRooms);
		S3.selectByValue("10");
		
		WebElement AdultsPerRoom = driver.findElement(By.name("adult_room"));
		Select S4= new Select(AdultsPerRoom);
		S4.selectByValue("4");
		
		WebElement ChildsPerRoom = driver.findElement(By.name("child_room"));
		Select S5= new Select(ChildsPerRoom);
		S5.selectByValue("2");
		
		WebElement Search = driver.findElement(By.name("Submit"));
		Search.click();
		
		WebElement Check = driver.findElement(By.name("radiobutton_0"));
		Check.click();
		
		WebElement Continue = driver.findElement(By.name("continue"));
		Continue.click();
		
		WebElement Fname = driver.findElement(By.id("first_name"));
		Fname.sendKeys("Bala");
		
		WebElement Lname = driver.findElement(By.id("last_name"));
		Lname.sendKeys("Sundar");
		
		WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys("No.6,Vivekandar Street,dubai");
		
		WebElement CC = driver.findElement(By.id("cc_num"));
		CC.sendKeys("1122334455667788");
		
		WebElement ccType = driver.findElement(By.name("cc_type"));
		Select S6= new Select(ccType);
		S6.selectByVisibleText("Master Card");
		
		WebElement ExDateMonth = driver.findElement(By.name("cc_exp_month"));
		Select S7= new Select(ExDateMonth);
		S7.selectByVisibleText("February");
		
		WebElement ExDateYear = driver.findElement(By.name("cc_exp_year"));
		Select S8= new Select(ExDateYear);
		S8.selectByValue("2022");
		
		WebElement CCV = driver.findElement(By.id("cc_cvv"));
		CCV.sendKeys("111");
		
		WebElement Booknow = driver.findElement(By.id("book_now"));
		Booknow.click();
		
		JavascriptExecutor Js= (JavascriptExecutor)driver;
		Js.executeScript("window.scroll(0,400)", " ");
		
		TakesScreenshot Ts= (TakesScreenshot)driver;
		File Source= Ts.getScreenshotAs(OutputType.FILE);
		File Destination= new File("C:\\Users\\VASANTH\\eclipse-workspace\\Java_Training\\screenshot\\Adactin_Project.png");
		FileHandler.copy(Source, Destination);
		
		
		
	}
	

}
