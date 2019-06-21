package AmazonTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_03BrowserHistory {
	public static WebDriver driver;
	@Test
	public void checkHistory()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\varshataru\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//span[contains(text(),\"Hello, Sign in\")]")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("varshataru17@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("5star@123");
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		System.out.println("Sign In successfully...");
		
		driver.findElement(By.xpath("//a[@id='nav-recently-viewed']")).click();//Click on search history
		//To delete search hisory click on "Manage History & delete elements"
		driver.findElement(By.xpath("//span[@class='a-size-medium aok-align-center']")).click();//manage gistory
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*If any element is not clickable then use Actions class*/
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='btn_clear-announce']"))).click().build().perform();
		//driver.findElement(By.xpath("//*[@id='btn_clear-announce']")).click();//Remove button
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='a-button a-button-primary']")).click();
		driver.navigate().to("https://www.amazon.com/");
		System.out.println("Deleted all search history");
		
	}

}
