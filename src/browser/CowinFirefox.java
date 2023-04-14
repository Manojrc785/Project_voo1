package browser;

import org.openqa.selenium.firefox.FirefoxDriver;
public class CowinFirefox 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Browser server\\firefox\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cowin.gov.in/");
	}

}
