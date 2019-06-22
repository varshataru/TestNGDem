package AmazonTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_008_giftCard {
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
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='bxc-grid__container bxc-grid__container--width-1024']/div[@class='bxc-grid__row bxc-grid--no-gutter   bxc-grid__row--light ']"));
		System.out.println("Total number of occassions:=>"+list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().contains("Thank you Gift Cards"))
			{
				list.get(i).click();
				break;
			}
			
		}
	}
}
