package browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseActitime 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Thread.sleep(2000);
		driver.navigate().to("https://demo.actitime.com/login.do");
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("[href='http://www.actitime.com']")).click();
		//Thread.sleep(7000);
		System.out.println(driver.getTitle());
		driver.quit();

	}
}
	
