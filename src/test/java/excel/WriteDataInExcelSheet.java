package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcelSheet {

	public static void main(String[] args) throws Exception {
		//step1:  we should convert physical file into java readable object
		FileInputStream fis =new FileInputStream("src/test/resources/testdata.xlsx");

		//step2: open the excel file using WorkbookFactory class and create()
		Workbook wb = WorkbookFactory.create(fis);

		//step3: we should get the control of particular sheet by using getSheet()

		Sheet sh = wb.getSheet("testdata");

		//step4:we should get the control of particular row by using getRow()

		Row row = sh.getRow(1);

		//step5: we should create particular cell by using createCell()

		Cell cell = row.createCell(1);

		//step6: store/write the data by using SetStringCellValue()

		cell.setCellValue("pass");

		//step7: we should specify the path of excel by using FileOutputStream

		FileOutputStream fos = new FileOutputStream("src/test/resources/testdata.xlsx");

		//step8:we should Flush the data by using write(fos)-------->belongs to WorkBook

		//wb.write(fos);

		//step9: close the workbook by using close()---------->belongs to WorkBook Interface 
		wb.close();
		System.out.println("data is stored in exceln ");

	}

}
