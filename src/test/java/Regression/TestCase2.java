package Regression;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {

	

	

	
	

		@BeforeMethod
		
		public void launch()
		{
			System.out.println("Launched");
		}
		
		@Test(priority=2,dependsOnMethods="register")
		
		public void login()
		{
			System.out.println("logined");
		}
		
		
		@Test(priority=1)
		
		public void register()
		{
			System.out.println("data fed");
			Assert.fail("Not registered");
		}
		
	@Test(priority=3,dependsOnMethods="register")
		
		public void password()
		{
			System.out.println("password fed");
		}

	@Test(priority=4,dependsOnMethods="register",alwaysRun=true)

	public void username()
	{
		System.out.println("username fed");
	}
		
		@AfterMethod
		
		public void logout()
		{
			System.out.println("Logged out");
		}
		
		@AfterClass
		
		public void closeDB()
		{
			System.out.println("ClosedDB");
		}
		
		@BeforeClass
		
		public void startDB()
		{
			System.out.println("StartedDB");
		}
	}


