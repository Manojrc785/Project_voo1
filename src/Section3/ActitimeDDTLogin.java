package Section3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActitimeDDTLogin 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Manojrc\\Documents\\Section 3\\ActitimePptLogin.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String URL=pobj.getProperty("Url");
		System.out.println(URL);
		String USERNAME=pobj.getProperty("Username");
		System.out.println(USERNAME);
		String PASSWORD=pobj.getProperty("Password");
		System.out.println(PASSWORD);
		//@login
		

		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.className("pwdfield")).sendKeys(PASSWORD);
		driver.findElement(By.id("loginButton")).click();
		
	}
}
