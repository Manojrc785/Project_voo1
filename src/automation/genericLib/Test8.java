package automation.genericLib;

import org.testng.annotations.Test;

public class Test8 
{
	@Test(invocationCount=5)
	public void createUser()
	{
		System.out.println("*******USER CREATED*************");
	}
	//ITERATION FOR N number of times
}
