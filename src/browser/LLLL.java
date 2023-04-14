package browser;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LLLL
{
	public static void main(String [] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Browser server\\chrome  browser server\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".initial")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#container_tasks")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@ class='item createNewCustomer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@class,'inputNameField')]")).sendKeys("YUVRAJ SINGH");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("hi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	}
}



