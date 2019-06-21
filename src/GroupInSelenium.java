import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupInSelenium {
	@Test(groups={"varsha","Regression"})
	public void Demo(String name,String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("varsha");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Taru");
		driver.findElement(By.cssSelector("input['aria-label=Log In']")).click();
		String message=driver.findElement(By.xpath("//span[contains(text(),Log in)]")).getText();
		System.out.println(message);
		if (message.contains("Lag in")) {
			System.out.println("pass");
		}
		else
		{
			throw new TestException("Failed");
		}
	}
	@Test(groups={"Regression","varsha"})
	public void signIn() {
		System.out.println("SignIn Method");

	}

}
