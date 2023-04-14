package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IrctcMouseAction 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
		driver.get("https://www.irctc.com/");
		Actions act=new Actions(driver);
		WebElement aboutUs=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']/ul/li[1]"));
		act.moveToElement(aboutUs).perform();
		driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']/ul/li/ul/li[2]//a[contains(text(),'Board of')]")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Name"));
		
		WebElement chairman=driver.findElement(By.xpath("//div[@class='responsiveTab tenders newbluebutton']/table/tbody/tr[2]/td[2]"));
		System.out.println("THe Chairman Of IRCTC Is: "+chairman);
		
	}
}
