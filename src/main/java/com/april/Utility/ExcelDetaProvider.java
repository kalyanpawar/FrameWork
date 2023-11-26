package com.april.Utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDetaProvider {

	public String getStringData(String sheetName, int row, int cell) throws Exception {      //method will return "value" from excel sheet
		String excelpath="C:\\Users\\admin\\eclipse-workspace\\FrameWork\\TestData\\data.xlsx";
		FileInputStream file=new FileInputStream(excelpath);   //giveng access to the file by path
		 DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
		 Cell cell1 = WorkbookFactory.create(file).getSheet("sheet1").getRow(row).getCell(cell);
		 String str = formatter.formatCellValue(cell1);
		return str;
	}
}
