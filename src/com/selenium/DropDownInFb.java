package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownInFb {
	public static void main(String[] args) throws Throwable    {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfb%20login%7C&placement=&creative=589460569900&keyword=fb%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-320262102914%26loc_physical_ms%3D1007810%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIoMaw3cSH-QIVjSQrCh2JEgFREAAYASAAEgLroPD_BwE");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement findElement= driver.findElement(By.id("day"));
		Select s= new Select(findElement);
		s.selectByValue("23");
		
		WebElement findElement2= driver.findElement(By.name("birthday_month"));
		Select s1= new Select(findElement2);
		s1.selectByVisibleText("Feb");
	
		WebElement findElement3= driver.findElement(By.id("year"));
		Select s2= new Select(findElement3);
		s2.selectByValue("1996");

}}
