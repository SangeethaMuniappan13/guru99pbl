package TestNG_PBL;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
	@Test

	public static void test() throws IOException {

		String LocationOfFile1 = "/Users/SA20463801/eclipse-workspace/guru99pbl/src/main/java/TestNG_PBL/utilities/F1 (1).xlsx";
		File fileCon1 = new File(LocationOfFile1);

		FileInputStream fis1 = new FileInputStream(fileCon1);

		XSSFWorkbook wb1 = new XSSFWorkbook(fis1);

		XSSFSheet sheet1 = wb1.getSheet("Sheet1");

		String LocationOfFile2 = "/Users/SA20463801/eclipse-workspace/guru99pbl/src/main/java/TestNG_PBL/utilities/F2 (1).xlsx";

		File fileCon2 = new File(LocationOfFile2);

		FileInputStream fis2 = new FileInputStream(fileCon2);

		XSSFWorkbook wb2 = new XSSFWorkbook(fis2);

		XSSFSheet sheet2 = wb1.getSheet("Sheet1");

		int countOfAllRows = sheet1.getLastRowNum();

		String lastName = sheet1.getRow(countOfAllRows).getCell(0).getStringCellValue();

		sheet2.createRow(0).createCell(0).setCellValue(lastName);

		assertEquals(sheet2.getRow(0).getCell(0).getStringCellValue(),
				sheet1.getRow(countOfAllRows).getCell(0).getStringCellValue());

		FileOutputStream outputStream = new FileOutputStream("F2 (1).xlsx");

		wb2.write(outputStream);

		outputStream.close();

		wb2.close();
	}

}
