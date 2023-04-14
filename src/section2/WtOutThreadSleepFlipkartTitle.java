package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WtOutThreadSleepFlipkartTitle 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone x");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(2000);
		String title1=driver.getTitle();
		System.out.println(title1);
		
	}
}
