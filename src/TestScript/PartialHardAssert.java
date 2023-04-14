package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PartialHardAssert 
{
	@Test
	public void checkAssert()
	{
		String actual="wing";
		String expect="showing";
		Assert.assertTrue(expect.contains(actual));
		System.out.println("hello");
	}
}
