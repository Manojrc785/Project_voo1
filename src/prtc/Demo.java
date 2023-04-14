package prtc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		driver.get("https://demo.actitime.com/login.do");
		WebElement un=driver.findElement(By.id("username"));
		System.out.println("************************************");
		un.sendKeys("king");
		String values=un.getAttribute("value");
		System.out.println("******************"+values+"****************");
		//clear
		un.sendKeys("admin");
		Thread.sleep(3000);
		un.clear();
		un.sendKeys("kl");
		//getLocation
		System.out.println("Getting Location");
		Point loc=un.getLocation();
		System.out.println(loc);
		System.out.println("Got Location");
		//getSize
		System.out.println("Getting size");
		Dimension size=un.getSize();
		System.out.println(size);
		System.out.println("Got size");
		//getRect
		System.out.println("Getting rect");
		Rectangle rect=un.getRect();
		System.out.println("X axis is "+ rect.getX());
		System.out.println("y axis is "+rect.getY());
		System.out.println("width is "+rect.getWidth());
		System.out.println("Height is "+rect.getHeight());
		System.out.println("Got rect");
		//getTagName
		System.out.println("Getting tagname");
		String tag=un.getTagName();
		System.out.println(tag);
		System.out.println("Got tagname");
		//getAccesibleName
		System.out.println("Getting accessiblename");
		String accName=un.getAccessibleName();
		System.out.println(accName);
		System.out.println("Got accessiblename");
		//getAriaRole
				System.out.println("Getting AriaRole");
				//String unse=un.getAriaRole();
				//System.out.println(unse);
				System.out.println(un.getAriaRole());
				System.out.println("Got AriaRole");
				//getAttribute
				System.out.println("Getting Attribute");
				WebElement uns1=driver.findElement(By.xpath("//input[@placeholder='username']"));
				String attName=uns1.getAttribute("placeholder");
				System.out.println(uns1.getAttribute(attName));
				System.out.println("Got Attribute");
		//isEnabled
		System.out.println("Getting enabled");
		boolean en=un.isEnabled();
		System.out.println(en);
		System.out.println("Got enabled");
		//isDispalyed
		System.out.println("Getting Dispalyed");
		WebElement lf=driver.findElement(By.xpath("//form[@name='LoginForm']"));
		boolean dp1=lf.isDisplayed();
		System.out.println(dp1);
		boolean dp=un.isDisplayed();
		System.out.println(dp);
		System.out.println("Got Dispalyed");
		//isSelected
		System.out.println("Getting selected");
		boolean slt=un.isSelected();
		System.out.println(slt);
		WebElement	cb=driver.findElement(By.id("keepLoggedInCheckBox"));
		cb.click();
		System.out.println("Got selected");
		//isSelected
		System.out.println("Getting selected");
		boolean slt1=cb.isSelected();
		System.out.println(slt1);
		System.out.println("Got selected");
		//isEnabled
		System.out.println("Getting enabled ");
		driver.get("file:///C:/Users/Manojrc/Documents/html/selenium%20html/Registrationpage.html");
		WebElement uns=driver.findElement(By.xpath("//input[@placeholder='username']"));
		System.out.println(uns.isEnabled());
		System.out.println("Got enabled");
		
	}
}
