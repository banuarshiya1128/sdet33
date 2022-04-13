package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOranganizatiinWithIndustryAndType {

	public static void main(String[] args) throws Exception  {
		//step1:fetch the data from external file and store it in variable
	FileInputStream fis = new FileInputStream("./src/test/resources/Commondata.properties");
	Properties properties = new Properties();
	properties.load(fis);
	String url = properties.getProperty("url");
	String username = properties.getProperty("username");
	String password = properties.getProperty("password");
	String browser = properties.getProperty("browser");
	String timeout = properties.getProperty("timeout");
	Long timeoutLong=Long.parseLong(timeout);
	String excelpath = properties.getProperty("excelpath");
	String excelSheetName = properties.getProperty("excelSheetName");
	
	
	
	//generate random number
	Random ran = new Random();
	
	int RandomNumber = ran.nextInt(1000);
	
	
	
	//fetch he data from excel
	FileInputStream fis1 = new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis1);
	
	String orgName = wb.getSheet(excelSheetName).getRow(10).getCell(3).getStringCellValue();
	 String industry = wb.getSheet(excelSheetName).getRow(10).getCell(6).getStringCellValue();
	String type = wb.getSheet(excelSheetName).getRow(10).getCell(7).getStringCellValue();
	
	//step2: launch te browser
	WebDriver driver = null;
	
	if (browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	} else if (browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	else {
		System.out.println("Browser is nor specifie properly");
	}
	//step3:do basic config for browser
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(timeoutLong, TimeUnit.SECONDS);
	
	//step:4 open the url and navigATE TO APPLICATION
	driver.get(url);
	
	//step5: login to the application
	
	driver.findElement(By.name("user_name")).sendKeys(username);
	driver.findElement(By.name("user_password")).sendKeys(password);
	driver.findElement(By.id("submitButton")).click();
	
	
	
	//step6:create organiszation
	
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	String exporgName = orgName+RandomNumber;//hardcoding
	driver.findElement(By.name("accountname")).sendKeys(exporgName);
	WebElement industryDropDown = driver.findElement(By.name("industry"));
	Select sindustry = new Select(industryDropDown);
	sindustry.selectByValue(industry);
	WebElement typeDropDown = driver.findElement(By.name("accounttype"));
	Select sType = new Select(typeDropDown);
	sType.selectByValue(type);
	driver.findElement(By.name("button")).click();
	
	//step7:verify the contact
	
	String actorgName = driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
	String actIndustry = driver.findElement(By.xpath("//span[@id='dtlview_Industry']")).getText();
	String acttype = driver.findElement(By.xpath("//span[@id='dtlview_Type']")).getText();
	
	if (exporgName.equalsIgnoreCase(actorgName) && actIndustry.equalsIgnoreCase(industry) && acttype.equalsIgnoreCase(type)) {
		System.out.println("organiszation created successfully with industry and type");
		wb.getSheet(excelSheetName).getRow(10).createCell(8).setCellValue("fail");
	FileOutputStream fos = new FileOutputStream(excelpath);
	wb.write(fos);
	
	}
	Thread.sleep(5000);
	
	//step8:sign out/logout from application
	
	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.linkText("Sign Out")).click();
	
	//step9:close thev application
	
	wb.close();
	driver.quit();
	
		
	}
	
	
			}


