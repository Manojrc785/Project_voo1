package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;

public class ActitimePrintMessage extends BaseClass
{
	@Test
	public void printMsg()
	{
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]/div/div/div/div")).click();
		driver.findElement(By.id("popup_menu_item_6")).click();
		WebElement topLevel=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
		cu.getSelectVisible(topLevel,"Product");
		String msg=driver.findElement(By.id("FormModifiedTextCell")).getText();
		System.out.println(msg);
	}
}
