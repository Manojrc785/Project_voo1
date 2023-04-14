package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCreateCustomer 
{
	public static void main(String [] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
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
		driver.findElement(By.xpath("//input[contains(@class,'inputNameField')]")).sendKeys("Kl Rahul O5");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("hi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(3000);
		String actualCustomerName=driver.findElement(By.xpath(".titleEditButtonContainer>.title")).getText();
		Thread.sleep(2000);
		System.out.println(actualCustomerName);
		driver.quit();
	}
}
