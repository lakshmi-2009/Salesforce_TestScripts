package com.tests.seleniumAutomation.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class writeXLSXCellData {
	

	public static void modifyXLSXCellData(File path, String sheetName, int row, int column, String data) {
		
		FileInputStream fs=null;
		XSSFWorkbook workbook =null;
		FileOutputStream fo=null;
		try {
			fs = new FileInputStream(path);
			workbook= new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			int sizeOfRow=sheet.getLastRowNum()+1;
			XSSFRow rowData = sheet.getRow(row);
			int sizeOfCell=rowData.getLastCellNum();
			XSSFCell cell = rowData.getCell(column);
			cell.setCellValue(data);
			fo = new FileOutputStream(path);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook.write(fo);
			fs.close();
			fo.flush();
			fo.close();
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("completed writing");
	}
	
        
        
		
		
		
		
		
		
		
	}
	

