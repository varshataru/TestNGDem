package AmazonTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PrimeVideo {
	public static WebDriver driver;
	@Test
	 public void Primevideo()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\varshataru\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("varshataru17@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("5star@123");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']/child::span[@class='nav-line-2']"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Your Prime Video')]"))).click().build().perform();
		
	}
}
