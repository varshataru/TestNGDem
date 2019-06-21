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
		driver.get("https://www.amazon.com/");
		String textToSelect = "kshelf";
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    WebElement autoOptions= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    autoOptions.sendKeys("book");

	    List<WebElement> optionsToSelect = driver.findElements(By.tagName("span"));

	    for(WebElement option : optionsToSelect){
	        System.out.println(option);
	        if(option.getText().equals(textToSelect)) {
	            System.out.println("Trying to select: "+textToSelect);
	            option.click();
	            break;
	        }
	    }
		
	}
}
