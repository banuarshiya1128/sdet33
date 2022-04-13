
package com.crm.organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericUtility.BaseClass;
import com.crm.genericUtility.ExcelUtility;
import com.crm.genericUtility.JavaUtility;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateContactwithExcelsheetTest extends BaseClass {


	@Test
	public void createcontactwithexceltest() throws Throwable {
		

		// generate random method
		Random ran=new Random();
		int randomnumber = ran.nextInt();
		// JavaUtility.generateRandomNumber(1000);
		//fetch data from excel
		String Lastname = ExcelUtility.fetchData("SDET33",5,1);
		
		//create contacts
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		String actualcontact=Lastname+randomnumber;
		driver.findElement(By.name("lastname")).sendKeys(actualcontact);
		driver.findElement(By.xpath("(//input[@value='  Save  '])[1]")).click();

	
		//to verify contact is correct or not
		String expectedcontact=driver.findElement(By.id("dtlview_Last Name")).getText();
		Assert.assertTrue(expectedcontact.equalsIgnoreCase(actualcontact));
			System.out.println("Contact created successfully");

			//to logout
			//mouse hovering on user element
			WebElement user = driver.findElement(By.xpath("//img[contains(@src,'/user.PNG')]"));
			Actions action=new Actions(driver);
			action.moveToElement(user).perform();

	}
}





