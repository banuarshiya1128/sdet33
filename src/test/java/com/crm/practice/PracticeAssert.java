package com.crm.practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PracticeAssert {
	@Test
	public void assertpraticeTest() {
		String s ="Sdet33";
		Assert.assertEquals("s", "sdet33");
		Reporter.log(s);
	}
	@Test
	public void assert1() {
		String s ="Sdet33";
		Assert.assertEquals("s", "sdet33");
		Reporter.log("print or not");
	}
	public void practice() {
		
		SoftAssert sa = new SoftAssert();
		String s ="Sdet33";
		System.out.println("line 14");
		sa.assertAll();
		System.out.println("line 27");
		
	}
	
	}
	

