package prtc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("lays");
		Thread.sleep(3000);
		List<WebElement> autoSugg=driver.findElements(By.xpath("//ul[contains(@class,'UFBk')]"));
		for(WebElement auto:autoSugg)
		{
			System.out.println(auto.getText());
			//break;
		}
		for(WebElement auto:autoSugg)
		{
			String i =auto.getText();
			if(i.contains("lays potato chips"))
			{
				auto.click();
				break;
			}
		}
	}
}
