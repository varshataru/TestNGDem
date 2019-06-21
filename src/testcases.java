import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcases {
	@BeforeTest
	public void OpenBrowser() {
		System.out.println("Opening browser");
	}
	public void ClosingBrowser() {
		System.out.println("Closing Browser");
	}
	@Test(invocationCount=5)
	public void TC_01() {
		System.out.println("tc_01");
	}
	@Test(priority=-1)
	public void TC_02() {
		System.out.println("tc_02");

	}
	@Test(enabled=false)
	public void TC_03() {
		System.out.println("tc_03");

	}
	@Test
	public void TC_04() {
		System.out.println("tc_04");

	}
	@Test
	public void TC_05() {
		System.out.println("tc_05");

	}
	@Test
	public void TC_06() {
		System.out.println("tc_06");

	}
	@Test
	public void TC_07() {
		System.out.println("tc_07");

	}
	@Test
	public void TC_08() {
		System.out.println("tc_08");

	}
	@Test
	public void TC_09() {
		System.out.println("tc_09");

	}
	@Test
	public void TC_10() {
		System.out.println("tc_10");
	}
	public static void main(String[] args) {
		
	}

}
