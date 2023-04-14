package automation.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ElementRepository.LoginLocators;

public class BaseClass1 
{
	public WebDriver driver;
	public static WebDriver Listenerdriver;
	public DataUtility du=new DataUtility();
	public CommonUtility cu=new CommonUtility();
	

	@BeforeClass(alwaysRun=true)
	public void classlaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Browser server1\\chromedriver.exe");
		driver=new ChromeDriver();
		Listenerdriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod(alwaysRun=true)
	public void login() throws IOException
	{
		driver.get(du.getDataFromProperties("url"));
		LoginLocators ll=new LoginLocators();
		ll.loginApp(du.getDataFromProperties("username"), du.getDataFromProperties("password"));
	}
}
