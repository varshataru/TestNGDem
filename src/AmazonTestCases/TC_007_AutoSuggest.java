package AmazonTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_007_AutoSuggest {
	public static WebDriver driver;
	@Test
	public void autosuggesstion()
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\varshataru\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		//////////////////////////////////////////////////
		
//		driver.get("https://www.google.com/");
//		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
//		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']/li/descendant::div[@class='suggestions-inner-container']"));
//		System.out.println("Total number of suggestion in search box==>"+list.size()); 
//		for(int i=0;i<list.size();i++)
//		{
//		System.out.println(list.get(i).getText());
//		if(list.get(i).getText().contains("java tutorial"))
//		{
//		list.get(i).click();
//		break;
//		} 
//		}
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watch");
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@id='suggestions']/div[@class='s-suggestion']"));
		System.out.println("Total number of suggestion in search box==>"+list1.size()); 
		for(int i=0;i<list1.size();i++)
		{
		System.out.println(list1.get(i).getText());
		if(list1.get(i).getText().contains("watch box"))
		{
		list1.get(i).click();
		break;
		} 
		}
		
	}
		
}