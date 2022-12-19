package seleniumpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MynthraProductCount {
	public static WebDriver driver;
	public static Integer minPrice;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Admin\\\\eclipse-workspace1\\\\SeleniumProject\\\\Driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();

	}

	public static void getTotalNumberOfProducts() {

		List<WebElement> allProductList = 
				driver.findElements(By.xpath("//li[@class='product-base']"));
		int size = allProductList.size();
		System.out.println("total number of products:" + size);
		
//		for (WebElement product : allProductList) {
//			System.out.println(product.getText());
//			
//		}
	}

	public static void getMinimumPrice() {
		List<Integer> priceList= new ArrayList<>();
		List<WebElement> minimumPrice = 
				driver.findElements(By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']"));
//		for (int i = 0; i < minimumprice.size(); i++) {
//			String replaceAll = minimumprice.get(i).getText().replaceAll("Rs.", "");
//			int parseInt = Integer.parseInt(replaceAll);
//			m.add(parseInt);
		for (WebElement price : minimumPrice) {
			String priceText = price.getText().replace("Rs. ", "");
			int priceValue = Integer.valueOf(priceText);
			priceList.add(priceValue); 
			
		}
		minPrice= Collections.min(priceList);
		System.out.println("the min.price is" + minPrice);

		}
	public static void minimumPriceOfProductName(int minPrice) {
	WebElement productName=	driver.findElement
			(By.xpath("//li[@class='product-base']//descendant::span[text()='"+minPrice+"']//ancestor::div[@class='product-productMetaInfo']/h3"));
	String priceOfProduct = productName.getText();
		System.out.println("the minimum price of product name is"+priceOfProduct);
//	}
//	public static void minimumPriceOfsubProductName(int) {
		
		WebElement subProductBrandName = driver.findElement
				(By.xpath("//li[@class='product-base']//descendant::span[text()='"+minPrice+"']/ancestor::div[@class='product-productMetaInfo']/h4"));
				String priceOfSubProductBrand =subProductBrandName.getText();
				System.out.println("the minimum price of sub product brand name is"+priceOfSubProductBrand);
				
		
		WebElement subProductName = driver.findElement(By.xpath("//h4[text()='"+priceOfSubProductBrand+"']/preceding-sibling::h3"));
		String title2 =subProductName.getText();
		System.out.println("the minimum price of sub product name is"+title2);
		
		
	}
	
	

	

	public static void main(String[] args) {
		browserLaunch();
		getTotalNumberOfProducts();
		getMinimumPrice();
		minimumPriceOfProductName( minPrice);
		
	}

}

