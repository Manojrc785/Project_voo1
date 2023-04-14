package prtc;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
		driver.get("https://www.freejobalert.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot1/yt1.png");
		FileUtils.copyFile(src, trg);
		WebElement srst=driver.findElement(By.xpath("//div[text()='New Updates']"));
		File src1=srst.getScreenshotAs(OutputType.FILE);
		File trg1=new File("./screenshot1/ft2.png");
		FileUtils.copyFile(src1, trg1);
	}
}
