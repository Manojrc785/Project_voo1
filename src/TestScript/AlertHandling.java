package TestScript;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;

@Listeners(automation.genericLib.ListenerImplementation.class)
public class AlertHandling extends BaseClass
{
	@Test
	public void AlertTpeOfWork()
	{
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]/div/div/div/div")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Wor']")).click();
		WebElement nameTextField=driver.findElement(By.xpath("//input[@name='name']"));
		nameTextField.sendKeys("KL RAHUL");
		driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
		cu.alertCancel(driver);
		System.out.println(driver.getTitle());
	}
}
