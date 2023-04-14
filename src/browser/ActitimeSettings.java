package browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeSettings 
{
	ChromeDriver driver;
	public static void main(String[] argss) throws InterruptedException
	{
		ActitimeSettings AS=new ActitimeSettings();
		AS.launchBrowser();
		//Thread.sleep(3000);
		AS.login();
		//Thread.sleep(3000);
		AS.actitimeWork();
		//Thread.sleep(3000);
		AS.closeBrowser();
	}
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		driver=new ChromeDriver();
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	public void login()
	{
		driver.get("https://demo.actitime.com/login.do");
	}
	public void actitimeWork() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		//Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//Thread.sleep(3000);
		driver.findElement(By.id("loginButtonContainer")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]/div/div/div/div")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		//Thread.sleep(3000);
		String Title=driver.getTitle();
		System.out.println("***************THE CURRENT TITLE IS: "+Title+"*********************");
	}
	public void closeBrowser()
	{
		driver.close();
	}
}
