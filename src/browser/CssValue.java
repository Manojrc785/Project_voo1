package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue 
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		WebElement errormsg=driver.findElement(By.xpath("//span[contains(text(),'Password is ')]"));
		String font=errormsg.getCssValue("font");
		System.out.println(font);
		String colour=errormsg.getCssValue("color");
		System.out.println(colour);
	}
}
