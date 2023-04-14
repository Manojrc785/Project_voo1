package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCompare 
{
	ChromeDriver driver;
	public static void main(String [] args) throws InterruptedException
	{
		AddToCompare ATC=new AddToCompare();
		ATC.launchBrowser();
		Thread.sleep(2000);
		ATC.login();
		Thread.sleep(2000);
		ATC.fetchPrice();
		Thread.sleep(8000);
		ATC.closeBrowser();
	}
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
	public void login()
	{
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	}
	public void fetchPrice() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("iphone x");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Popularity']")).click();
		Thread.sleep(2000);
		String result=driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
		System.out.println("*****************++++++++********************");
		System.out.println("The Result For iphone Popularity is: "+result );
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='Add to Compare']")).click();
	}
	public void closeBrowser()
	{
		driver.close();
	}
}
