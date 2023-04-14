package automation.genericLib;

import org.testng.annotations.Test;

public class Test9CreateDependency 
{
	@Test(dependsOnMethods="signUp")
	public void signIn()
	{
		System.out.println("signIN to Application");
	}
	@Test
	public void signUp()
	{
		System.out.println("First signUP");
	}
}
