package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']/ul/li[2]/a")).click();
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("KL RAHUL",Keys.TAB,Keys.TAB,"9848022338",Keys.TAB,"klrahul123@gmail.com");
		WebElement dropdown=driver.findElement(By.id("Form_getForm_Country"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("India");
		WebElement dropdown1=driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		Select s1=new Select(dropdown1);
		s1.selectByValue("7,001 - 7,500");
		driver.findElement(By.id("Form_getForm_JobTitle")).sendKeys("CRICKETER",Keys.TAB,"KL_ASS PLAYER");
		
	}
}
