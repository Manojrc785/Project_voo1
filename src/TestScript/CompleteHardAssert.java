package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CompleteHardAssert 
{
	@Test
	public void checkAssert()
	{
		String expect="Google";
		String actual="google";
		Assert.assertEquals(actual,expect);
		System.out.println("hello");
	}
	
}
