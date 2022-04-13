
package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.crm.genericUtility.FileUtility;
import com.crm.genericUtility.WebDriverUtility;

public class FetchDataFromExceltest {

	public static void main(String[] args) throws Throwable {
		
		FileUtility.intiallizePropertyFile("./src/test/resources/Commondata.properties");
		 String url = FileUtility.fetchDataFromProperty("url");
		String browser = FileUtility.fetchDataFromProperty("browser");
		String   username =FileUtility.fetchDataFromProperty("username");
		String password = FileUtility.fetchDataFromProperty("password");
		String timeout = FileUtility.fetchDataFromProperty("timeout");
		//WebDriverUtility.closeBrowser(null);

			
			
			
			//throws Exception {
		//step:1 we should convert the physical file into java readable object
		//FileInputStream fis =new FileInputStream("./src/test/resources/testdata.xlsx");

		//step2: open the excel file using workbookfactory

		//Workbook wb = WorkbookFactory.create(fis);

		//step:3 we should get the control of particular sheet by using getsheet()

		//Sheet sh = wb.getSheet("testdata");

		//step:4 we should get the control of particular row by using getrow() 
		//Row row = sh.getRow(1);
		//step5:we should get the control of particular cell by using getcell()   

		//Cell cell = row.getCell(0);
		//step6: read/fetch the data by using getStringCellValue()
		//String data = cell.getStringCellValue();
		//System.out.println(data);

		//step7: close the workbook
		//wb.close();




	}
}