package AmazonTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_06_GiftCards {
	
	public static WebDriver driver;
	@Test
	public void giftcard()
	{
		
		System.setProperty("webdriver.chrome.driver",	"C:\\Users\\varshataru\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();//Click on Gift Card
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2018/GCLP/2x/occ_dt_birthday_2x._CB483877124_.jpg']")).click(); //Select Birthday theme
		driver.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/I/51xfGXhEgYL.jpg']")).click(); //Select 2nd picture for birthday
		
		
		driver.findElement(By.xpath("//button[@id='gc-customization-type-button-Animated']")).click(); //click on annimated button
		driver.findElement(By.xpath("//ul[@id='gc-design-mini-picker']/li[2]")).click();//Selected Animated 2nd video
		driver.findElement(By.xpath("//ul[@id='gc-amount-mini-picker']/li[1]")).click();//Amount $25
		driver.findElement(By.xpath("//ul[@id='gc-delivery-mechanism-list']/li[1]")).click();//Delivery-mail
		driver.findElement(By.xpath("//textarea[@name='emails']")).sendKeys("varshataru17@gmail.com");//To
		driver.findElement(By.xpath("//input[@id='gc-order-form-senderName']")).sendKeys("varshataru17@gmail.com"); //from
		
		
		
		//for Date Picker
		WebElement element=driver.findElement(By.xpath("//input[@class='a-input-text a-cal-input a-declarative']"));
		String dateVal="20-12-2019";
		selectDateByJS(driver, element, dateVal);
		
		//ToClick On AddToCart
		driver.findElement(By.xpath("//input[@id='gc-buy-box-atc']")).click();
		
		//Assert
		if(driver.getTitle().equals("Amazon.com Shopping Cart"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	public void selectDateByJS(WebDriver driver,WebElement element,String dateVal)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"')", element);
	}

}
