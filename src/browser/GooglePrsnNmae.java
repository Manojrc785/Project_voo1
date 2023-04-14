package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePrsnNmae 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("KL RAHUL");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(3000);
		String result=driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
		Thread.sleep(3000);
		System.out.println("The RESULT is : "+result);
	}
}
