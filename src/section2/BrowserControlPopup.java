package section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserControlPopup 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone x",Keys.ENTER);
		
		
		String p1=driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 64 GB)']")).getText();
		String p1price=driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 64 GB)']/../../div[2]/div[1]/div[1]")).getText();
		System.out.println("********"+p1 +"----->"+p1price);
	
		String p2=driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Space Gray, 256 GB)']")).getText();
		String p2price=driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Space Gray, 256 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p2 +"----->"+p2price);
		
		String p3=driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Space Gray, 64 GB)']")).getText();
		String p3price=driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Space Gray, 64 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p3 +"----->"+p3price);
		
		String p4=driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 256 GB)']")).getText();
		String p4price=driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 256 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p4 +"----->"+p4price);
		
		String p5=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 128 GB)']")).getText();
		String p5price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p5 +"----->"+p5price);
		
		String p6=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Green, 128 GB)']")).getText();
		String p6price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Green, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p6 +"----->"+p6price);
		
		String p7=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']")).getText();
		String p7price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p7 +"----->"+p7price);
		
		//String p8=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']")).getText();
		//String p8price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		//System.out.println("********"+p8 +"----->"+p8price);
		
		String p9=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']")).getText();
		String p9price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (White, 64 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p9 +"----->"+p9price);
		
		String p10=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 64 GB)']")).getText();
		String p10price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 64 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p10 +"----->"+p10price);
		
		String p11=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 ((PRODUCT)RED, 128 GB)']")).getText();
		String p11price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 ((PRODUCT)RED, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p11 +"----->"+p11price);
		
		String p12=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Pink, 128 GB)']")).getText();
		String p12price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Pink, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p12 +"----->"+p12price);
		
		String p13=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']")).getText();
		String p13price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p13 +"----->"+p13price);
		
		String p14=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Purple, 64 GB)']")).getText();
		String p14price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Purple, 64 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p14 +"----->"+p14price);
		
		String p15=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 128 GB)']")).getText();
		String p15price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p15 +"----->"+p15price);
		
		String p16=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Red, 64 GB)']")).getText();
		String p16price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Red, 64 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p16 +"----->"+p16price);
		
		String p17=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Blue, 64 GB)']")).getText();
		String p17price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Blue, 64 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p17 +"----->"+p17price);
		
		String p18=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Red, 128 GB)']")).getText();
		String p18price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Red, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p18 +"----->"+p18price);
		
		String p19=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Green, 64 GB)']")).getText();
		String p19price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Green, 64 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p19 +"----->"+p19price);
		
		String p20=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Black, 64 GB)']")).getText();
		String p20price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Black, 64 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p20 +"----->"+p20price);
		
		String p21=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (White, 64 GB)']")).getText();
		String p21price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (White, 64 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p21 +"----->"+p21price);
		
		String p22=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 256 GB)']")).getText();
		String p22price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 256 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p22 +"----->"+p22price);
		
		String p23=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 256 GB)']")).getText();
		String p23price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 256 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p23 +"----->"+p23price);
		
		String p24=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Blue, 128 GB)']")).getText();
		String p24price=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Blue, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println("********"+p24 +"----->"+p24price);
		driver.close();
		
		
		
	}
}
