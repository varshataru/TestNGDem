import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void Demo1run1() {
		System.out.println("Demo2 class @Test");

	}
	@Test
	public void Demo1run2() {
		System.out.println("Demo2 class @Test");

	}
	@BeforeClass
	public void run9() {
	System.out.println("Inside class Demo1 @BeforeClass");
	}
}
