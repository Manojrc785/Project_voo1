package section2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(21));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		Calendar cal=Calendar.getInstance();
		Date currentDate=cal.getTime();
		System.out.println(currentDate);
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY");
		String modifiedDate=sdf.format(currentDate);
		WebElement value=driver.findElement(By.className("hasDatepicker"));
		value.click();
		value.sendKeys(modifiedDate,Keys.ESCAPE);
	}
}
