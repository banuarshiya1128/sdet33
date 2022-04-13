package com.crm.organization;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.ObjectRepository.CreateNewOrganizationPage;
import com.crm.ObjectRepository.CreateOrganizationPage;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.OrgInfoPage;
import com.crm.genericUtility.BaseClass;
import com.crm.genericUtility.ExcelUtility;
import com.crm.genericUtility.FileUtility;
import com.crm.genericUtility.JavaUtility;
@Test
public class CreateOrganizationNameTest extends BaseClass {
	//instead of main method its @test
@Test
	 
	public void createOrganizationNameTest() throws Throwable  {
		
		//create the object for POM class
		 CreateOrganizationPage createorgpage=new CreateOrganizationPage(driver);
		 CreateNewOrganizationPage createneworgpage=new CreateNewOrganizationPage(driver);
         OrgInfoPage orginfo=new OrgInfoPage(driver);
		
		
		//store variable
		String orgName=ExcelUtility.fetchData(FileUtility.fetchDataFromProperty("sheetName"), 3, 1)+JavaUtility.generateRandomNumber(1000);
		
		//click on organization tab
		HomePage homepage = new HomePage(driver);
		homepage.getOrganizationTab().click();
		
		//click on create organization
		createorgpage.createOrganization();
		
		//create org and save
		createneworgpage.CreateNewOrgPagewithOrgNameAssignTo(orgName);
		
		
		//verify org
      String actOrgName = orginfo.fetchOrgName();
		
     Assert.assertEquals(orgName, actOrgName);
		//if(orgName.equalsIgnoreCase(actOrgName))
		//{
			
			Reporter.log("Organization created successfully",true);
			
		//}	
		
	}
}
	    

	
	


