package browser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartScreenshot 
{
	public static void main(String[] args) throws  InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement Flipkart=driver.findElement(By.className("_3qX0zy"));
		File src=Flipkart.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/f1.png");
		FileUtils.copyFile(src,trg);
		Thread.sleep(2000);
		driver.quit();
		
	}
	
}
