package listner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("test started",true);
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test success",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot t=(TakesScreenshot)Demo_Listner.driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./screenphoto/"+"a.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("test skipped",true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("test fail with percentage",true);
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("test with timeout",true);
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("tes started",true);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("test finished",true);
		
	}
	

}
