package automation.genericLib;

import org.testng.annotations.Test;

public class Test7 
{
	@Test
	public void createUser()
	{
		System.out.println("**********USER CREATED************");
	}
	@Test(enabled=false)
	public void modifyUser()
	{
		System.out.println("***********USER MODIFIED**************");
	}
	@Test
	public void deleteUser()
	{
		System.out.println("*************USER DELETED*************");
	}
	//we can make testcase disable by using enabled=false
}
