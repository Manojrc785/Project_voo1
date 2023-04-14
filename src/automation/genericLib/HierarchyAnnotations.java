package automation.genericLib;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HierarchyAnnotations 
{
	
	@BeforeSuite
	public void serverConnection()
	{
		System.out.println("server connected");
	}
	@BeforeTest
	public void dbConnection()
	{
		System.out.println("db connected");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("Browser launched");
	}
	@BeforeMethod()
	public void login()
	{
		System.out.println("login application");
	}
	@Test
	public void createCustomer()
	{
		System.out.println("customer created");
	}
	@Test
	public void modifyUser()
	{
		System.out.println("user modified");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout from application");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("browser closed");
	}
	@AfterTest
	public void closeDb()
	{
		System.out.println("db closed");
	}
	@AfterSuite
	public void closeServer()
	{
		System.out.println("server closed");
	}
}
