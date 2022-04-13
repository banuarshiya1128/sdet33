package excel;

import com.crm.genericUtility.ExcelUtility;

public class ExcelOptimizePratice {

	public static void main(String[] args) throws Throwable {
		//Excel1
		ExcelUtility.openExcel("./src/test/resources/datatest.xlsx");
		ExcelUtility.writeDataInNewRow("./src/test/resources/datatest.xlsx", "SDET33", 10, 1,"status");
		String orgName = ExcelUtility.fetchData("SDET33", 8, 1);
		System.out.println(orgName);
		ExcelUtility.writeDataInNewRow("./src/test/resources/datatest.xlsx", "SDET33", 20, 1, "pass");
		String lastname = ExcelUtility.fetchData("SDET33", 8, 2);
		System.out.println(lastname);
		
		
		//excel2
		ExcelUtility.openExcel("./src/test/resources/testdata.xlsx");
		ExcelUtility.writeDataInNewRow("./src/test/resources/testdata.xlsx", "SDET33", 10, 1,"status");
		String orgName1= ExcelUtility.fetchData("SDET33", 8, 1);
		System.out.println(orgName1);
		ExcelUtility.writeDataInNewRow("./src/test/resources/testdata.xlsx", "SDET33", 20, 1, "pass");
		String lastname1 = ExcelUtility.fetchData("SDET33", 8, 2);
		System.out.println(lastname1);
		
	}

}
