package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrice 
{
	ChromeDriver driver;
	public static  void main(String[] args) throws InterruptedException
	{
		FlipkartPrice  FP=new FlipkartPrice();
		FP.launchBrowser();
		Thread.sleep(3000);
		FP.login();
		Thread.sleep(3000);
		FP.fetchPrice();
		FP.closeBrowser();
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
		String pn=driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 64 GB)']")).getText();
		System.out.println("***************************************************");
		System.out.println("The Product Name is: "+pn);
		String pParent=driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 64 GB)']/../..")).getText();
		System.out.println("***************************************************");
		System.out.println(pParent);
		String pp=driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 64 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println("***************************************************");
		System.out.println("The Product Price is: "+pp);
	}
	public void closeBrowser()
	{
		driver.close();
	}
}
