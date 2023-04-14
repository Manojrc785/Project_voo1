package section2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmChairman 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
		driver.get("https://www.orangehrm.com/");
		Actions act=new Actions(driver);
		WebElement company=driver.findElement(By.xpath("//nav[@class='navbar navbar-expand-lg navbar-light fixed-top']/div/div/ul/li[4]/a"));
		act.moveToElement(company);
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(21));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='collapse navbar-collapse']/ul/li[4]/div/div/div/div/ul/li[2]/a")));
		driver.findElement(By.xpath("//nav[@class='navbar navbar-expand-lg navbar-light fixed-top']/div/div/ul/li[4]/div/div/div/div/ul/li[2]/a")).click();
		WebElement ceo=driver.findElement(By.xpath("//div[@class='main']/div/div/section[2]/div/div/div/div/div/div/div/div[2]/p/br[1]"));
		System.out.println("*************The CEO of ORANGEHRM Is: "+ceo+"***********");
	}
}
