package com.datadriven.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataDriven {
	public static void main(String[] args) throws IOException {

		//Set the file location
		File f = new File("C:\\maven\\MavenProject\\excel\\Data.xlsx");
		
		//We are reading the inputs from the excel so class name is FileInputStream
		FileInputStream fis = new FileInputStream(f);
		
		//Set the Workbook name;
		Workbook wb = new XSSFWorkbook(fis);
		
		//Select the sheet name
		Sheet sheetAt = wb.getSheetAt(0);
		
		// Select Row
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row row = sheetAt.getRow(i);
			int cellsize = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellsize; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					long value = (long)numericCellValue;
					String valueOf = String.valueOf(value);
					System.out.println(valueOf);
				}
				
			}
		}
		
	}

}
