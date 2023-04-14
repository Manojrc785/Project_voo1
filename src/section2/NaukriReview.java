package section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriReview 
{
	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
		driver.get("https://www.naukri.com/");
		Actions act=new Actions(driver);
		WebElement job=driver.findElement(By.xpath("//a[@title='Search Jobs']"));
		act.moveToElement(job).perform();
		driver.findElement(By.xpath("//a[@title='IT jobs']")).click();
		driver.findElement(By.xpath("//a[@title='Software Developer - ADAS/AD']")).click();
		String mainid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			if(!(mainid.equals(id)))
			{
				driver.switchTo().window(id);
				String review=driver.findElement(By.xpath("//div[@class='jd-top-head']/div//span[2]")).getText();
				System.out.println("##########The Total REVIEWS ARE:  "+review+"###########");
			}
		}
		
	}
}
