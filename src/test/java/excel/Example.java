package excel;

import java.io.FileInputStream;

import com.crm.genericUtility.ExcelUtility;

public class Example {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/Commondata.properties");
		String lastname = ExcelUtility.fetchData("SDET33", 8, 2);
		System.out.println(lastname);

}
}
