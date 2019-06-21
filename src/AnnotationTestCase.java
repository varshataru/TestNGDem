import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnnotationTestCase {
	////////////1D Array/////////////////////////
	@Test(dataProvider="firstDataProvider")
	public void m1(int i)
	{
		System.out.println("Hello "+i);
	}
	@DataProvider(name="firstDataProvider")
	public Object dataProvider()
	{
		Object[] i={10,20,30};
		return i;	
	}
	
	//////////2D Array/////////////////////
	@Test(dataProvider="secondDataProvider")
	public void m2(String j, String k)
	{
		System.out.println("hii "+j);
		System.out.println("Your Batch Code is: "+k);
	}
	@DataProvider(name="secondDataProvider")
	public String[][] dataProvider1()
	{
	String[][] j={{"varsha","123"},{"Trupti","456"}};
	return j;
	}
}
