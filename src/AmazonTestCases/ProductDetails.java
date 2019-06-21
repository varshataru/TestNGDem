package AmazonTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProductDetails {
	public static WebDriver driver;
	@Test
	public void ProDetails()
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\varshataru\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watch for womens");
	driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']/input[@class='nav-input']")).click();
	driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal'] [position()=1]")).click();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	System.out.println("Item added to cart successfully");
	
	driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
	
	}

}
