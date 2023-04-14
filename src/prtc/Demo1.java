package prtc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
		driver.get("https://demo.actitime.com/login.do");
		WebElement logo=driver.findElement(By.className("atLogoImg"));
		String colour=logo.getCssValue("color");
		System.out.println(colour);
		String fontSize=logo.getCssValue("font");
		System.out.println(fontSize);
		WebElement login=driver.findElement(By.id("inProgressText"));
		String colour1=login.getCssValue("color");
		System.out.println("The login button colour is: "+colour1);
		String fontSize1=login.getCssValue("font");
		System.out.println("The login button font is: "+fontSize1);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		WebElement hover=driver.findElement(By.id("keepLoggedInCheckBox"));
		String hmsg=hover.getAttribute("title");
		System.out.println(hmsg);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		WebElement name=driver.findElement(By.xpath("//input[@name='pwd']"));
		String atvalue=name.getAttribute("type");
		System.out.println(atvalue);
	}
}
