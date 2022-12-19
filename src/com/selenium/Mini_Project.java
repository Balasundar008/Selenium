package com.selenium;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
//		signin.click();
//		
//		WebElement Emailaddress = driver.findElement(By.id("email_create"));
//		Emailaddress.sendKeys("balasundar1234@gmail.com");
//	
//		WebElement CreateAccount = driver.findElement(By.xpath("//i[@class='icon-user left']"));
//		CreateAccount.click();
//		
//		WebElement Title = driver.findElement(By.id("id_gender1"));
//		Title.click();
//		
//		
//		
//		WebElement firstname = driver.findElement(By.id("customer_firstname"));
//		firstname.sendKeys("Bala");
//		
//		WebElement lastname = driver.findElement(By.id("customer_lastname"));
//		lastname.sendKeys("Sundar");
//		
//		WebElement Password = driver.findElement(By.name("passwd"));
//		Password.sendKeys("Sundar");
//		
//		
//		WebElement Date = driver.findElement(By.id("days"));
//		Select S= new Select(Date);
//		S.selectByValue("23");
//		
//		WebElement Month = driver.findElement(By.id("months"));
//		Select S1= new Select(Month);
//		S1.selectByValue("2");
//		
//		WebElement Year = driver.findElement(By.id("years"));
//		Select S2= new Select(Year);
//		S2.selectByValue("1996");
//		
//		WebElement Company = driver.findElement(By.name("company"));
//		Company.sendKeys("TCL");
//		
//		WebElement Address = driver.findElement(By.name("address1"));
//		Address.sendKeys("1/33, Sengunthar street,Neduntheru,Tanjore(Dt.)");
//	
//		WebElement City = driver.findElement(By.name("city"));
//		City.sendKeys("Kumbakonam");
//		
//		WebElement State = driver.findElement(By.id("id_state"));
//		Select S3= new Select(State);
//		S3.selectByValue("14");
//		
//		WebElement PIN = driver.findElement(By.name("postcode"));
//		PIN.sendKeys("00000");
//		
//		WebElement Country = driver.findElement(By.id("id_country"));
//		Select S4= new Select(Country);
//		S4.selectByValue("21");
//		
//		WebElement Phone = driver.findElement(By.name("phone_mobile"));
//		Phone.sendKeys("9988776655");
//		
//		WebElement Register = driver.findElement(By.name("submitAccount"));
//		Register.click();
		
		
		WebElement Signin = driver.findElement(By.xpath("//a[@class='login']"));
		Signin.click();
		
		WebElement Emailadress = driver.findElement(By.id("email"));
		Emailadress.sendKeys("balasundar123@gmail.com");
		
		WebElement Password = driver.findElement(By.id("passwd"));
		Password.sendKeys("1122334455");
		
		WebElement enter = driver.findElement(By.id("SubmitLogin"));
		enter.click();
		
		WebElement TShirts = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		TShirts.click();
		
		WebElement Quickview = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
		Quickview.click();
		

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame);
		
		WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		plus.click();
		plus.click();
		
		WebElement Size = driver.findElement(By.id("group_1"));
		Select s= new Select(Size);
		s.selectByValue("2");
		
		WebElement Color = driver.findElement(By.name("Blue"));
		Color.click();
		
		WebElement AddToCart = driver.findElement(By.id("add_to_cart"));
		AddToCart.click();
		
		driver.switchTo().defaultContent();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement ProceedToCheck1 = driver.findElement(By.cssSelector("[title*='Proceed to checkout']"));
		ProceedToCheck1.click();
	
		
		WebElement ProceedToCheck2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		ProceedToCheck2.click();
		
		
		WebElement ProceedToCheck3 = driver.findElement(By.name("processAddress"));
		ProceedToCheck3.click();
		

		WebElement Agree = driver.findElement(By.name("cgv"));
		Agree.click();
	
		
		WebElement ProceedToCheck4 = driver.findElement(By.name("processCarrier"));
		ProceedToCheck4.click();
	
		
		WebElement PayBankWithWire = driver.findElement(By.xpath("//p[@class='payment_module']"));
		PayBankWithWire.click();
	
		
		WebElement IConfirmMyOrder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		IConfirmMyOrder.click();
		
		
		JavascriptExecutor Js= (JavascriptExecutor)driver;
		Js.executeScript("window.scroll(0,400)", " ");
		
		TakesScreenshot Ts= (TakesScreenshot)driver;
		File Source= Ts.getScreenshotAs(OutputType.FILE);
		File Destination= new File("C:\\Users\\VASANTH\\eclipse-workspace\\Java_Training\\screenshot\\Mini_Project.png");
		FileHandler.copy(Source, Destination);
		
		
}
	
}

