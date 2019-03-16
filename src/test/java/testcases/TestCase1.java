package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase1 
{

	
	@Test
	
	public void doLogin()
	{
		SoftAssert sa=new SoftAssert();
		
		String expected="dineshwar";
		String actual="Dineshwar";
		
		sa.assertEquals(actual, expected);
		System.out.println("Name check completed");
		
		System.out.println("Validate sigin btbn");
		
		sa.assertEquals(true, false,"Login btn not found");
		
		System.out.println("TC Completed");
		
		sa.assertAll();
		
		
	}
}
