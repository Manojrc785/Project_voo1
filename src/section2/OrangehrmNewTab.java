package section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmNewTab 
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(21));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[4]")).click();
		Thread.sleep(3000);
		String mainId=driver.getWindowHandle();
		Set<String> allId=driver.getWindowHandles();
		
		for(String Id:allId)
		{
			if(!(mainId.equals(Id)))
			{
				driver.switchTo().window(Id);
			}
			
		}
		driver.close();
		Set<String> allId1=driver.getWindowHandles();
		for(String Id:allId1)
		{
			if(!(mainId.equals(Id)))
			{
				driver.switchTo().window(Id);
			}
		}
		driver.close();
		
		
		Set<String> allId2=driver.getWindowHandles();
		for(String Id:allId2)
		{
			if(!(mainId.equals(Id)))
			{
				driver.switchTo().window(Id);
			}
		}
		System.out.println("#################################################################################");
		System.out.println("*********The Current Title Of The Web Page  Is: "+driver.getTitle()+"*********************");
		System.out.println("#################################################################################");
	}
}
