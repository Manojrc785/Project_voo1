
package section2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayWebElements 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
	}
}
