package AmazonTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC_01_AddItemToCart {
	public static WebDriver driver;
	@Test
	public void AddCart()
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\varshataru\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watch for womens");
	driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']/input[@class='nav-input']")).click();
	driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal'] [position()=1]")).click();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	System.out.println("Item added to cart successfully");
	
	driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
	Boolean b=driver.findElement(By.xpath("//span[@class='a-size-medium sc-product-title a-text-bold']")).isDisplayed();
	
	if(b==true)
	{
		System.out.println("item is present in test case");
	}
	else
	{
		System.out.println("No item present");
	}
	}
}
