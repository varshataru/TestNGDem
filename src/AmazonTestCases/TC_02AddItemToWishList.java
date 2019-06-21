package AmazonTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_02AddItemToWishList {
	public static WebDriver driver;
	@Test
	public void wishList()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\varshataru\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	driver.findElement(By.xpath("//span[contains(text(),\"Hello, Sign in\")]")).click();
	//driver.findElement(By.xpath("//div[@id=\"nav-flyout-ya-signin\"]/child::a[@class=\"nav-action-button\"]/span[@class=\"nav-action-inner\"]")).click();
	driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("varshataru17@gmail.com");
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("5star@123");
	driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
	System.out.println("Sign In successfully...");
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile cover");//SerachBox
	driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']/input[@class='nav-input']")).click();//click on search button
	driver.findElement(By.xpath("//span[@id='pdagDesktopSparkleDescription1']")).click();//click on first link
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Select select=new Select(driver.findElement(By.xpath("//select[@id='quantity']")));
	select.selectByValue("4");
	System.out.println("quantity=2");

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']")).click();
	driver.findElement(By.xpath("//div[@class='a-popover-wrapper']//div[@id='shovhuc-pop-mraiawlb3']//input[@class='swSprite s_add2WishListSm']")).click();
	System.out.println("Item added to wishlist");
	
	driver.findElement(By.xpath("//span[contains(text(),'View Your List')]")).click();//View your wish List
	
	driver.navigate().to("https://www.amazon.com/");
	System.out.println("Navigated to home page");
	//driver.close();
	}

}
