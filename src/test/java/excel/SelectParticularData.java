package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SelectParticularData {

	public static void main(String[] args) throws Exception {
		FileInputStream fis =new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Login");
		for (int i = 5; i < sh.getLastRowNum(); i++) {
			String username = sh.getRow(i).getCell(0).toString();
			if (username.equalsIgnoreCase("admin11")) {
				
			String password = sh.getRow(i).getCell(1).toString();
				System.out.println(password);
				
			}
			
		}

	}

}
