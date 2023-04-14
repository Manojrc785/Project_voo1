package automation.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerCreation
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		DataUtility du=new DataUtility();
		CommonUtility cu=new CommonUtility();
		String expectedCustName=du.getDataFromExcelSheet("Sheet1", 0, 0);
		expectedCustName=expectedCustName+cu.getRandom();
		System.setProperty("webdriver.chrome.driver","D:\\Browser server1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(du.getDataFromProperties("URL"));
		driver.findElement(By.id("username")).sendKeys(du.getDataFromProperties("USERNAME"));
		driver.findElement(By.name("pwd")).sendKeys(du.getDataFromProperties("PASSWORD"));
		driver.findElement(By.id("loginButtonContainer")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		driver.findElement(By.className("newNameField")).sendKeys(expectedCustName);
		driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("VIRAT KOHLI THE KING SCORED 100* IN THE 100TH T20I");
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(17));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".titleEditButtonContainer>.title"), expectedCustName));
		String actualCustomerName=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(expectedCustName);
		driver.close();
	}
}
