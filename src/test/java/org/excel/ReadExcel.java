package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static void main(String[] args) throws IOException {
	File path= new File("D:\\New folder\\JUnit\\src\\test\\resources\\Excel\\Details.xlsx");
	
	FileInputStream ip= new FileInputStream(path);
	
	Workbook w=new XSSFWorkbook(ip);
	Sheet sheet = w.getSheet("UserPass");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(0);
	System.out.println(cell);
	int RowsCount = sheet.getPhysicalNumberOfRows();
	System.out.println("Number of Rows..."+RowsCount);
	
	int CellsCount = row.getPhysicalNumberOfCells();
	System.out.println("Number of Cells..."+CellsCount);
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row r = sheet.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell eachCell = r.getCell(j);
			System.out.println(eachCell);
			
		}
		
	}
	
}
	
}
