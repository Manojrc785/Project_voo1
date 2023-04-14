package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastAddToCompare 
{
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		LastAddToCompare LC=new LastAddToCompare();
		LC.launchBrowser();
		Thread.sleep(3000);
		LC.login();
		Thread.sleep(3000);
		LC.fetchPrice();
		Thread.sleep(3000);
		LC.closeBrowser();
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
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[last()]")).click();
	}
	public void closeBrowser()
	{
		driver.close();
	}
}
