package ElementRepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators 
{
	public void loginLocators(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	private WebElement usernameTB;
	@FindBy(name="pwd")
	private WebElement passwordTB;
	@FindBy(id="loginButtonContainer")
	private WebElement LoginButton;
	public WebElement getUsername()
	{
		return usernameTB;
	}
	public WebElement getPassword()
	{
		return passwordTB;
	}
	public WebElement getLogin()
	{
		return LoginButton;
	}
	public void loginApp(String username,String password)
	{
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getLogin().click();
	}
	
	
}
