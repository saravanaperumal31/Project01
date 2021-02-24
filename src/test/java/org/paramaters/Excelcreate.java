package org.paramaters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcreate {
	public static void main(String[] args) throws IOException {
//		public void excelWrite(String data, String sheetname, int rownum , int cellnum) throws IOException {
			File f = new File("D:\\New folder\\TestNG\\Excel\\new.xlsx");
			Workbook w= new XSSFWorkbook();
			Sheet Sheet = w.createSheet("Details");
			Row row = Sheet.createRow(2);
			Cell cell = row.createCell(1);
			cell.setCellValue("Saravana");
			FileOutputStream os=new FileOutputStream(f);
			w.write(os);
		}
	}
	

