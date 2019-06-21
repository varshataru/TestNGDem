
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterAnnotation {
	@Parameters({"username"})
	@Test
	public static void demo11( String username) {
		System.out.println("Password="+username);

	}

}
