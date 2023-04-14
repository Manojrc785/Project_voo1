package browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedLoginAction 
{
	public static void main(String [] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Browser server1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector(".initial")).click();
	
		
	}
}
