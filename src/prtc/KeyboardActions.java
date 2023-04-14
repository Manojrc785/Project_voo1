package prtc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		Actions act=new Actions(driver);
		search.sendKeys("ApaChe");
		act.keyDown(Keys.SHIFT).sendKeys("apache").perform();
		act.keyUp(Keys.SHIFT).sendKeys("apache").perform();
		act.keyDown(Keys.CONTROL).sendKeys("a",Keys.ENTER).perform();
		act.keyUp(Keys.CONTROL).sendKeys("a").perform();
	}
}
