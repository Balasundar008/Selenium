package seleniumpractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	static Integer maxValue;
	static WebDriver driver;

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace1\\SeleniumProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/nail-polish");
		driver.manage().window().maximize();
	}

	private static void productCount() {

		List<WebElement> totalProduct = driver.findElements(By.xpath("//li[@class='product-base']"));
		int count = totalProduct.size();
		System.out.println(count);

	}

	private static void maxPrice() {

		List<WebElement> allPrice = driver.findElements(
				By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']"));

		List<Integer> l = new ArrayList<Integer>();
		for (WebElement price : allPrice) {
			String pr = price.getText().replace("Rs. ", "");
			int prNo = Integer.valueOf(pr);
			l.add(prNo);

		}
		 maxValue = Collections.max(l);
		System.out.println(maxValue);

	}

	private static void maxPriceOfProductName(int maxValue) {
		WebElement productName =
		driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()='"+maxValue+"']//ancestor::div[@class='product-productMetaInfo']//h3[@class='product-brand']"));
		String pName = productName.getText();
		System.out.println("product Name is"+pName);
		
	WebElement	subProducName= driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()='"+maxValue+"']//ancestor::div[@class='product-productMetaInfo']//h3[@class='product-brand']//following-sibling::h4[@class='product-product']"));
	String sPName= subProducName.getText();
	System.out.println("sub Product Name is"+sPName);
	
	WebElement	ratingOfProduct= driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()='"+maxValue+"']//ancestor::div[@class='product-productMetaInfo']//h3[@class='product-brand']//following-sibling::h4[@class='product-product']//preceding::div[@class='product-ratingsContainer']"));
	String rOP= ratingOfProduct.getText();
	System.out.println("rating of Product is"+rOP);
	
	}

	public static void main(String[] args) {

		browserLaunch();
		productCount();
		maxPrice();
		maxPriceOfProductName(maxValue);
	}
}
