package TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PartialSoftAssert 
{
	@Test
	public void ckeckAssert()
	{
		String actual="ming";
		String expect="i'm coming";
		SoftAssert sf=new SoftAssert();
		sf.assertTrue(expect.contains(actual));
		System.out.println("good morning dar");
		sf.assertAll();
	}
}
