package section2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String month=driver.findElement(By.className("ui-datepicker-month")).getText();
		System.out.println(month);
		String year=driver.findElement(By.className("ui-datepicker-year")).getText();
		System.out.println(year);
		while(!(month.equals("October") && year.equals("1994")))
		{
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			month=driver.findElement(By.className("ui-datepicker-month")).getText();
			year=driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		driver.findElement(By.linkText("29")).click();
	}
}
