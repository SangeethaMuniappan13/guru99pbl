package parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Question1 {
	public static void main(String[] args) throws IOException {
		String File1 = "/Users/SA20463801/eclipse-workspace/guru99pbl/utilities/File1.xlsx";
		String File2 = "/Users/SA20463801/eclipse-workspace/guru99pbl/utilities/File2.xlsx";

		File filecon1 = new File(File1);
		File filecon2 = new File(File2);

		FileInputStream fis1 = new FileInputStream(filecon1);
		FileInputStream fis2 = new FileInputStream(filecon2);

		// reading the data from excel sheet
		XSSFWorkbook wb1 = new XSSFWorkbook(fis1);
		XSSFSheet sheet1 = wb1.getSheet("Sheet1");

		XSSFWorkbook wb2 = new XSSFWorkbook(fis2);
		XSSFSheet sheet2 = wb2.getSheet("Sheet1");
		for (int i = 0; i < sheet1.getLastRowNum(); i++) {
			String value1 = sheet1.getRow(i).getCell(0).getStringCellValue();
			for (int j = 0; j < sheet2.getLastRowNum(); j++) {

				String value2 = sheet2.getRow(j).getCell(0).getStringCellValue();
				if (value1.equals(value2)) {
					System.out.println(value1);
				}
			}

		}

	}

}
