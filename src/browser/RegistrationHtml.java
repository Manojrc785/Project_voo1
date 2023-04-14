package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationHtml 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Manojrc/Documents/html/selenium%20html/Register2.html");
		driver.findElement(By.xpath("//input[1]")).sendKeys("manoj");
		driver.findElement(By.xpath("//input[2]")).sendKeys("nayanailoveyou");
		driver.findElement(By.xpath("//input[3]")).sendKeys("manoj@gmail.com");
		driver.findElement(By.xpath("//input[4]")).click();
		driver.findElement(By.xpath("//input[7]")).click();
	}
}
