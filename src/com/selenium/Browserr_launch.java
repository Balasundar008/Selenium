package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserr_launch {
	static WebDriver driver;
	static int minPr;
	static int maxPr;

	public static void BrowLaunch() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumProject\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.myntra.com/home-furnishing?f=Categories%3ARunners%3A%3AType%3ABed");
		driver.manage().window().maximize();
	}
	public static void Countt() {
		List<WebElement> Total=driver.findElements(By.xpath("//li[@class='product-base']"));
		int Count=Total.size();
		System.out.println(Count);
	}	
		
	
public static void allDetails() {


		
	List<WebElement>allPrDetails=driver.findElements(By.xpath("//li[@class='product-base']/descendant::div[@class='product-productMetaInfo']/child::h3"));
		for (WebElement prName : allPrDetails) {
		String nameOfAllPrD =prName.getText();
		System.out.println("productname"  +nameOfAllPrD);
		}}
		
public static void minimunPrice() {


		List<Integer> l= new ArrayList<>();
		List<WebElement> AllPrice= driver.findElements(By.xpath("//li[@class='product-base']/descendant::div[@class='product-productMetaInfo']/descendant::span[@class='product-discountedPrice']"));
		for (WebElement price : AllPrice) {
			String text= price.getText().replace("Rs. ", "");
			int rupees=Integer.valueOf(text);
			l.add(rupees);
			
		}
		 minPr =Collections.min(l);
		 maxPr=Collections.max(l);
		 
		System.out.println("minimum price of product"+minPr);
		System.out.println("maximum price of product"+maxPr);
}
public static void minOfPProduct(int minPr,int maxPr) {


		WebElement PName=driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()='"+minPr+"']//ancestor::div/h3"));
			String minPriceOfPName=PName.getText();
			
			WebElement P1Name=driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()='"+maxPr+"']//ancestor::div/h3"));

			String maxPriceOfPName=P1Name.getText();

			System.out.println("The minimum price of product name is:" + minPriceOfPName);
			System.out.println("The maximum price of product name is:" + maxPriceOfPName);
	}

public static void getAbove40per() {
	List<WebElement > allPer=driver.findElements(By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountPercentage']"));
	for (WebElement per : allPer) {
	String p=per.getText();	
	if (p.equals("(40% OFF)")) {
		System.out.println(p);
		
	}
	else {
		System.out.println("not in the list");
	}
	
	
	
	}}


public static void main(String[] args) {
	BrowLaunch();
	Countt();
	allDetails();
	minimunPrice();
	minOfPProduct(minPr,maxPr);
	getAbove40per();
	
}}
	













