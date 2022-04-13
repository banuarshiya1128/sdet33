/**
package com.crm.unittesting;

import java.io.FileInputStream;
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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class CCExcelTest {
	
	
	
		
		@Test
			public void createcontactwithexceltest() throws IOException {
			FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
			Properties properties=new Properties();
			properties.load(fis);
			String url = properties.getProperty("url");
			String userName = properties.getProperty("userName");
	        String password = properties.getProperty("password");
	        String browser = properties.getProperty("browser");
	        String excelPath=properties.getProperty("excelPath");
	        String excelSheetName = properties.getProperty("excelSheetName");
	        String timeouts = properties.getProperty("timeouts");
	        long timeoutLong=Long.parseLong(timeouts);
	        
	       // generate random method
	       Random ran=new Random();
	        int randomnumber = ran.nextInt();
	        // JavaUtility.generateRandomNumber(1000);
	        //fetch data from excel
	        FileInputStream fis1=new FileInputStream("./src/test/resources/testdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis1);
			String Lastname = wb.getSheet(excelSheetName).getRow(2).getCell(1).getStringCellValue();
			wb.close();
			
		
	         //Step:2:Launch the Browser
	        WebDriver driver=null;
	        
	        if(browser.equalsIgnoreCase("chrome")) {
	        	WebDriverManager.chromedriver().setup();
	        	driver=new ChromeDriver();
	        }
	        else if(browser.equalsIgnoreCase("firefox")) {
	        	WebDriverManager.firefoxdriver().setup();
	        	driver=new FirefoxDriver(); 
	        }
	        else {
	        	System.out.println("Browser is not specified properly");
	        }
	        
	        //Step:3:Basic configuration for browser
	        driver.manage().window().maximize();
	 	    driver.manage().timeouts().implicitlyWait(timeoutLong,TimeUnit.SECONDS);
	 	    
	 	    //open the url and navigate to the application
	 	    driver.get(url);
	 	    
	 	    //Login to the application
	 	    driver.findElement(By.name("user_name")).sendKeys("admin");
	 		driver.findElement(By.name("user_password")).sendKeys("admin");
	 		driver.findElement(By.id("submitButton")).click();
	 		
	 		//create contacts
	 		driver.findElement(By.linkText("Contacts")).click();
	 		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	 		String actualcontact=Lastname+randomnumber;
	 		driver.findElement(By.name("lastname")).sendKeys(actualcontact);
	 		driver.findElement(By.xpath("(//input[@value='  Save  '])[1]")).click();
	 		
	 		//to verify contact is correct or not
	 		String expectedcontact=driver.findElement(By.id("dtlview_Last Name")).getText();
	 		Assert.assertTrue(expectedcontact.equalsIgnoreCase(actualcontact)); {
	 			System.out.println("Contact created successfully");
	 		
	 		//to logout
	 		//mouse hovering on user element
	 		WebElement user = driver.findElement(By.xpath("//img[contains(@src,'/user.PNG')]"));
	 		Actions action=new Actions(driver);
	 		action.moveToElement(user).perform();
	 	
	 		
	 		//click on signout
	 		driver.findElement(By.linkText("Sign Out")).click();
	        driver.quit();
	 		
	 		
	 		
		}

		}

}
**/

