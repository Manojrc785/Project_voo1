package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingResult 
{
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		FetchingResult fr=new FetchingResult();
		fr.launchBrowser();
		Thread.sleep(3000);
		fr.login();
		Thread.sleep(3000);
		fr.FetchResult();
		Thread.sleep(3000);
		fr.closeBrowser();
		
	}
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
	public void login()
	{
		driver.navigate().to("https://www.worldometers.info/coronavirus/");
	}
	public void FetchResult() throws InterruptedException
	{
		String result=driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/../div")).getText();
		Thread.sleep(3000);
		System.out.println("**********************************************");
		System.out.println("The No Of Covid cases Are: "+result);
		String result1=driver.findElement(By.xpath("//h1[text()='Deaths:']/../div")).getText();
		Thread.sleep(3000);
		System.out.println("**********************************************");
		System.out.println("The No Of Covid Deaths Are: "+result1);
		String result2=driver.findElement(By.xpath("//h1[text()='Recovered:']/../div")).getText();
		Thread.sleep(3000);
		System.out.println("**********************************************");
		System.out.println("The No Of Covid Recovaries Are: "+result2);
	}
	public void closeBrowser()
	{
		driver.close();
	}
	
}
