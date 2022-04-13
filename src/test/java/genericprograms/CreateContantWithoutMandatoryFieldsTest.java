package genericprograms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.genericUtility.FileUtility;
import com.crm.genericUtility.JavaUtility;
import com.crm.genericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContantWithoutMandatoryFieldsTest {
	static WebDriver driver; 
	public static void main(String[] args) throws Throwable {
		FileUtility.intiallizePropertyFile("./src/test/resources/Commondata.properties");
		String url = FileUtility.fetchDataFromProperty("url");
		 String browser = FileUtility.fetchDataFromProperty("browser");
		String username = FileUtility.fetchDataFromProperty("username");

		String password = FileUtility.fetchDataFromProperty("password");
		
		 
		long timeout = 0;
		
		//WebDriverUtility.launchApplicationWithMaximize(driver, url, timeout);
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
		WebDriverUtility.launchApplicationWithMaximize(driver, url, timeout);
		

		 driver.findElement(By.xpath("//input[@id='submitButton']")).click();



	}

}
