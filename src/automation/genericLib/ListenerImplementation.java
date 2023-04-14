package automation.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class ListenerImplementation implements ITestListener 
{

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String name=result.getName();
		TakesScreenshot ts=(TakesScreenshot)BaseClass.Listenerdriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File  trg=new File("./screenshot1/"+name+".png");
		try {
			FileUtils.copyFile(src, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}


	

	
	
	
}
