package com.crm.product;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.genericUtility.ConstantPath;
import com.crm.genericUtility.ExcelUtility;
import com.crm.genericUtility.FileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingNewProduct {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = null;
		FileUtility.intiallizePropertyFile( "./src/test/resources/Commondata.properties");
		String test= ConstantPath.ExcelPath;
		ExcelUtility.openExcel(test);
		String url = FileUtility.fetchDataFromProperty("url");
		 String browser = FileUtility.fetchDataFromProperty("browser");
		String username = FileUtility.fetchDataFromProperty("username");
		String sheetname = FileUtility.fetchDataFromProperty("excelSheetName");

		String password = FileUtility.fetchDataFromProperty("password");
//launch the browser

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}else {
			System.out.println("Browser is not specified properly");
			
		}
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
	//	ProductsPage prod = new ProductsPage(driver);
		//login.loginTo(username, password);
		
		
		 
		
		String prodname = ExcelUtility.fetchData(sheetname, 6, 1);
		//prod.product(prodname);
	}

}
