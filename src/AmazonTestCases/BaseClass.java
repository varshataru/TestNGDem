package AmazonTestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\varshataru\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		logger=logger.getLogger("AmazonFramework");
		PropertyConfigurator.configure("Input\\log4j.properties");
			
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	public void captureScreen(WebDriver driver,String tname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("E:\\TestingShastra\\TestNGDemo\\Screenshots"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
