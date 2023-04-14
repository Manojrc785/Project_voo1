package browser;

import org.openqa.selenium.chrome.ChromeDriver;
public class FlipkartTitle 
{
		public static void main(String [] args) 
		{
				System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				String title=driver.getTitle();
				System.out.println("***ThE TiTlE is *** "+title);
				driver.manage().window().minimize();
				driver.close();
		}
}
