import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;
//@Listeners(com.ListenerDemo1)
public class AssetDemo  {
	@Test
	public void AssetD1() {
//	Assert.assertEquals(true, true);
//	Assert.assertEquals("Hello", "Hell");
		
//	SoftAssert sa=new SoftAssert();
//	sa.assertEquals("Hi", "Hello");
//	sa.assertEquals("Hi", "Hell");
//	sa.assertEquals("Hi", "Hi");
		
		Assert.assertTrue(false,"Conditon is failed");
	
	}
	public void listnerDemo(){
		// TODO Auto-generated method stub

	}
}
