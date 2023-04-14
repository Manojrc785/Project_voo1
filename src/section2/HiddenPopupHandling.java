package section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopupHandling 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.ENTER);
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//table[@class='headerRowTable']/tbody/tr/td[1]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='delete button']")).click();
		//Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		//Thread.sleep(2000);
		System.out.println(msg);
		//Thread.sleep(2000);
		

	}
}
