package browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonFirefox 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Browser server\\firefox\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}
}
