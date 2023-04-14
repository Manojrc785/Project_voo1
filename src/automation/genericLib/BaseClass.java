package automation.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass 
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
	public void login() throws IOException, InterruptedException 
	{
		driver.get(du.getDataFromProperties("url"));
		driver.findElement(By.id("username")).sendKeys(du.getDataFromProperties("username"));
		driver.findElement(By.name("pwd")).sendKeys(du.getDataFromProperties("password"));
		driver.findElement(By.id("loginButton")).click();
	}
	
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}
