package seleniumFrameworks.HybridFramework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	public XSSFWorkbook wb;
	
    public ExcelDataProvider() throws FileNotFoundException {
   	 
   	 File src = new File("/Users/SA20463801/eclipse-workspace/guru99pbl/src/main/java/seleniumFrameworks/HybridFramework/TestData/TestData.xlsx");
   	 
   	 FileInputStream fis = new FileInputStream(src);
   	 
   	 wb= new XSSFWorkbook();
    }
    
    public String getStringData(String sheetName, int row, int column) {
   	 
   	return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
   	 
    }
    
    public String getStringData(int sheetIndex, int row, int column) {
   	 
    	return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
    	 
     }
    
    public double getNumericData(String sheetName, int row, int column) {
   	 
   	 return wb.getSheet("sheetName").getRow(row).getCell(column).getNumericCellValue();
   	 
    }

}
