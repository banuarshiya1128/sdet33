package com.crm.practice;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.ObjectRepository.HomePage;
import com.crm.genericUtility.BaseClass;
import com.crm.genericUtility.ConstantPath;
import com.crm.genericUtility.ExcelUtility;
import com.crm.genericUtility.FileUtility;
import com.crm.genericUtility.JavaUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactAndOraganizationTest extends BaseClass {

	@Test
	public void ContactAndOraganizationTest() throws Throwable {
		/*
		//create object for POM
		OrganizationPage org = new OrganizationPage(driver);
		ContactAndOraganizationTest createOrg = new ContactAndOraganizationTest();
	OrganizationInformation OrgInfo = new OrganizationInformation(driver);
	
	
	//Store the variable 
	
	 String OrgName = ExcelUtility.fetchData(FileUtility.fetchDataFromProperty("sheetName"), 5, 1)+JavaUtility.generateRandomNumber(1000);
	
	//Click on Organization
	org.getOgrName().click();
	
	//create the org image
	OrgInfo.getOrgInfo().click();
	
	//create the Organization 
	org.Org(OrgName);
	
	//verify the Count 
	
	
	
	
		//FileUtility.intiallizePropertyFile(ConstantPath.PropertiesFilepath);
		//WebDriver driver =null;
		//FileInputStream fis = new FileInputStream("./src/test/resources/RmgYantraResources.properties");
		//Properties properties = new Properties();
		//properties.load(fis);
/*
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String timeout = properties.getProperty("timeout");
		long timeouts = Long.parseLong(timeout);
		String browser = properties.getProperty("browser");
		String projectId = properties.getProperty("projectId");
		String createdBy = properties.getProperty("createdBy");
		String createdon = properties.getProperty("createdOn");
		String projectname = properties.getProperty("projectName");
		String status = properties.getProperty("status");
		String teamsize = properties.getProperty("teamsize");
		String index = properties.getProperty("index");
		int indexx = Integer.parseInt(index);

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();

		} else if (browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		{

		}


	}*/
	}
}

	

