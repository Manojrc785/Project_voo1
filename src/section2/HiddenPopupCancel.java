package section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenPopupCancel 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",  "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.ENTER);
		//driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]/div/div/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		WebElement nameTextField=driver.findElement(By.xpath("//input[@name='name']"));
		nameTextField.sendKeys("KL RAHUL");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		Thread.sleep(3000);
		alt.dismiss();
		System.out.println(driver.getTitle());
		
		
	}
}
