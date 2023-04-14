package automation.genericLib;

import org.testng.annotations.Test;

public class Test4 
{
	@Test
	public void createUser()
	{
		System.out.println("**********USER CREATED************");
	}
	@Test
	public void modifyUser()
	{
		System.out.println("***********USER MODIFIED**************");
	}
	@Test
	public void deleteUser()
	{
		System.out.println("*************USER DELETED*************");
	}
	//it  gives output as per alphabetical order
}
