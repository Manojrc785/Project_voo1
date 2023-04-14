package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayResult 
{
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		EbayResult er=new EbayResult();
		er.launchBrowser();
		Thread.sleep(2000);
		er.login();
		Thread.sleep(2000);
		er.fetchResult();
		Thread.sleep(2000);
		er.closeBrowser();
	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void login()
	{
		driver.get("https://www.ebay.com/");
		
	}
	public void fetchResult() throws InterruptedException 
	{
		driver.findElement(By.cssSelector("[placeholder='Search for anything']")).sendKeys("computer");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[value='Search']")).click();
		Thread.sleep(2000);
		String result=driver.findElement(By.xpath("//span[text()='computer']/../span[1]")).getText();
		Thread.sleep(2000);
		System.out.println("The Total Results for computers is: "+result);
		
	}
	public void closeBrowser()
	{
		driver.close();
	}
}
