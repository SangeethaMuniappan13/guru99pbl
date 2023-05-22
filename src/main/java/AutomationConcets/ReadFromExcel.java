package AutomationConcets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String locationofFile = "/Users/SA20463801/eclipse-workspace/guru99pbl/utilities/DataSheet.xlsx";

		File filecon = new File(locationofFile);

		FileInputStream fis = new FileInputStream(filecon);

		// reading the data from excel sheet
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow myRow = sheet.getRow(1);
		int countofAllCells = myRow.getLastCellNum();

		for (int i = 0; i < countofAllCells; i++) {
			for (int j = 0; j < countofAllCells; j++) {
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value + " ");
			}
			System.out.println();
		}

	}

}
