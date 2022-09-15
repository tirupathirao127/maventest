package com.automationpractice.pageobjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\tirup\\eclipse-workspace\\maventest\\src\\test\\resources\\data\\testdatafile.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh =  wb.getSheetAt(0);
		XSSFRow row = sh.getRow(1);
		XSSFCell cell = row.getCell(1);
		System.out.println(cell.toString());
		
		
		for(int i=0;i<=sh.getLastRowNum(); i++) {
			row = sh.getRow(i);
			for(int j=0; j<row.getLastCellNum(); j++) {
				cell = row.getCell(j);
				System.out.print(cell.toString() + "\t");
			}
			System.out.println();
		}
		
		wb.close();
		
	}

}
