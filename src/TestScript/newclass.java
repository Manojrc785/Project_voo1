package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class newclass 
{
	//public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		System.out.println("HI");
		System.setProperty("webdriver.chrome.driver","D:\\Browser server1\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	}
}
