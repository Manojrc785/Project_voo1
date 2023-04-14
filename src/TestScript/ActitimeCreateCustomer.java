package TestScript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;
import automation.genericLib.CommonUtility;

public class ActitimeCreateCustomer extends BaseClass
{
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException
	{
		CommonUtility cu=new CommonUtility();
		String expe=du.getDataFromExcelSheet("Sheet1",0,0);
		expe=expe+cu.getRandom();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		driver.findElement(By.className("newNameField")).sendKeys(expe);
		driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("VIRAT KOHLI THE KING SCORED 100* IN THE 100TH T20I");
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(17));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".titleEditButtonContainer>.title"), expe));
		String actualCustomerName=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(actualCustomerName);
	}
}
