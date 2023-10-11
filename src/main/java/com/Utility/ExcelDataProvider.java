package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public XSSFWorkbook wb;

	public ExcelDataProvider() throws IOException {
		
		String path=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		wb=new XSSFWorkbook(file);
		
	}
	
	// String Test Data
	public String getStringTestData_Excel(String Sheetname,int row,int cell) {
		
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	
	public String getNumericTestData_Excel(String Sheetname,int row,int cell) {
		
		 double data=wb.getSheet(Sheetname).getRow(row).getCell(cell).getNumericCellValue();
		 return String.valueOf(data).replace(".0", "");
	}
	
}
