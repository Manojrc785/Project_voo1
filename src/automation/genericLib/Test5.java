package automation.genericLib;

import org.testng.annotations.Test;

public class Test5 
{
	@Test(priority=1)
	public void createUser()
	{
		System.out.println("**********USER CREATED************");
	}
	@Test(priority=2)
	public void modifyUser()
	{
		System.out.println("***********USER MODIFIED**************");
	}
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("*************USER DELETED*************");
	}
}
