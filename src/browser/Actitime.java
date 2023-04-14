package browser;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Actitime 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(2000);
		driver.navigate().to("https://demo.actitime.com/login.do");
		//userName
			driver.findElement(By.id("username")).sendKeys("admin");
		//password
			driver.findElement(By.name("pwd")).sendKeys("manager");
		//LoginButton
			driver.findElement(By.id("loginButton")).click();
	}

}





