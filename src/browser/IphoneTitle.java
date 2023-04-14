package browser;

	import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
	public class IphoneTitle 
	{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("._2doB4z")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("._3704LK")).sendKeys("iphone");
			driver.findElement(By.cssSelector(".L0Z3Pu")).click();
			Thread.sleep(2000);
			String title=driver.getTitle();
			System.out.println("THE TITLE IS "+title);
			
			
		}
	}

