package automation.genericLib;

import org.testng.annotations.Test;

public class Test6 
{
	@Test(priority=-4)
	public void createUser()
	{
		System.out.println("**********USER CREATED************");
	}
	@Test(priority=0)
	public void modifyUser()
	{
		System.out.println("***********USER MODIFIED**************");
	}
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("*************USER DELETED*************");
	}
	//priority goes from (-,0,+ values)
}
