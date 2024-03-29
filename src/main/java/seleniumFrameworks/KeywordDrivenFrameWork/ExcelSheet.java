package seleniumFrameworks.KeywordDrivenFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {
	public static final String filePath = "/Users/SA20463801/eclipse-workspace/guru99pbl/src/main/java/seleniumFrameworks/KeywordDrivenFrameWork/DemoFile.xlsx"; 
	
	public ArrayList readExcelData(int colNo) throws IOException 
	{ 
	 
	File file = new File(filePath); 
	// Create an object of FileInputStream class and pass file as parameter to its constructor. 
	FileInputStream fis = new FileInputStream(file); 
	XSSFWorkbook wb = new XSSFWorkbook(fis); 
	XSSFSheet sheet = wb.getSheet("Sheet1"); 

	Iterator row = sheet.rowIterator(); 
	row.next(); 
	ArrayList<String> a = new ArrayList(); 
	// Checking the next element availability using the reference variable row. 
	while(row.hasNext()) 
	{ 
	Row r = (Row) row.next(); 
	// Moving cursor to the cell by getting a cell number. 
	Cell c = r.getCell(colNo); 
	String data = c.getStringCellValue(); 
	
	a.add(data); 
	a.add(((Row) row.next()).getCell(colNo).getStringCellValue()); 
	} 
	System.out.println("List: " +a);
	 
	return a; 
	}




}
