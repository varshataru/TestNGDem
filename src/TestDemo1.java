import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo1 {
	@Test
	public void run1() {
		System.out.println("@Test_01");

	}
	@Test
	public void run2() {
		System.out.println("@Test-02");

	}
	@BeforeTest
	public void run3() {
		System.out.println("@BeforeTest");

	}
	@AfterTest
	public void run4() {
	System.out.println("@AfterTest");

	}
	@BeforeMethod
	public void run5() {
	System.out.println("@BeforeMethod");

	}@AfterMethod
	public void run6() {
	System.out.println("@AfterMethod");

	}@BeforeSuite
	public void run7() {
	System.out.println("@BeforeSuite");

	}
	@AfterSuite
	public void run8() {
	System.out.println("@AfterSuite");
	}
	@BeforeClass
	public void run9() {
	System.out.println("Inside class Demo2 @BeforeClass");
	}
	@AfterClass
	public void run10() {
	System.out.println("@AfterClass");
	}
}