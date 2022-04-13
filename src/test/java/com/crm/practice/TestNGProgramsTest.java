package com.crm.practice;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGProgramsTest {

	@Test
	public void testNGProgramsTest() {     //always method name should be in lowercase 
		Reporter.log("test1", true);
	}
		@BeforeTest
		public void testNGProgramsTest2() {
			Reporter.log("test2", true);
			
		}	@AfterSuite
			public void testNGProgramsTest3() {
			System.out.println("@AfterSuite");
				Reporter.log("test3", true);
				
		
	}
}
