package browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAmazon 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.get("https://www.Amazon.com/");
	}
}
