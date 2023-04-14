package browser;

import java.util.Random;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreateCustomer 
{
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		Random r=new Random();
		int num=r.nextInt(10000);
		String expCustomerName="VIRATKOHLI";
		expCustomerName=expCustomerName+num;
		CreateCustomer cc=new CreateCustomer();
		cc.launchBrowser();
		Thread.sleep(2000);
		cc.login();
		Thread.sleep(2000);
		String actualCustomerName=cc.creatingCustomer(expCustomerName);
		
		if(expCustomerName.equals(actualCustomerName))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		cc.closeBrowser();
	}
	
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		 driver=new ChromeDriver();
		 Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void login() throws InterruptedException
	{
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButtonContainer")).click();
	}
	public String creatingCustomer(String expCustomerName) throws InterruptedException
	{
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("createNewCustomer")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("newNameField")).sendKeys(expCustomerName);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("VIRAT KOHLI THE KING SCORED 100* IN THE 100TH T20I");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(2000);
		String actualCustomerName=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		Thread.sleep(2000);
		System.out.println("The ActualCustomerName is: "+actualCustomerName);
		return actualCustomerName;
	}
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}

