import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("In onTestStart");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("In onTestSuccess");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("In onTestFailure");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("In onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("In onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("In onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("In onFinish");
	}

}
