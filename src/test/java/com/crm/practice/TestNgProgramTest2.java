package com.crm.practice;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgProgramTest2 {
	
	@Test(groups={"smoke","regression"})
	public void testRunTest() {     //always method name should be in lowercase 
		Reporter.log("testRun1", true);
	}
	@Test(groups={"smoke"})
		public void testRunTest2() {
			Reporter.log("testRun2", true);
			
		}
	
	@Test(groups="regression")
			public void testRunTest3() {
			//System.out.println("@AfterSuite");
				Reporter.log("testRun3", true);
				
		
	}

}
