package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CompleteSoftAssert 
{
	@Test
	public void checkAssert()
	{
		String expect="hello";
		String actual="Hello";
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(actual, expect);
		System.out.println("good morning");
		sf.assertAll();
	}
}
