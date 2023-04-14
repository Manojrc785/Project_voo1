package section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup 
{
	public static void main(String[] args) throws AWTException, InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
	driver.get("https://www.naukri.com/");
	driver.findElement(By.id("register_Layer")).click();
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	StringSelection path=new StringSelection("C:\\Users\\Manojrc\\Documents\\ExcelData\\Book1.xlsx");
	Clipboard cb=Toolkit.getDefaultToolkit().getSystemClipboard();
	cb.setContents(path,null);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);	
	}
	
}
