package section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionTimeAndDate 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.timeanddate.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("BAN");
		Thread.sleep(2000);
		List<WebElement> allSuggestions=driver.findElements(By.xpath("//div[@class='po']"));
		for(WebElement suggestion:allSuggestions)
		{
			System.out.println(suggestion.getText());
		}
	}
}
