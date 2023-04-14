package browser;

import org.openqa.selenium.chrome.ChromeDriver;
public class MyntraSourceCode 
{
	
	public static void main(String [] args)
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.myntra.com/");
				String SourceCode=driver.getPageSource();
				System.out.println(SourceCode);
				driver.manage().window().fullscreen();
		}
}
