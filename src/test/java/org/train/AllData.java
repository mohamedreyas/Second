package org.train;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Demo.DemoTest.Base;

public class AllData extends org.demo.Base {

	public static void main(String[] args) throws IOException {
		
		readExcel("Cred", 0, 1);
		
		getsheetvalue("Data", 2, 0, 1, "Reyas", "12345");
		
		File f = new File("C:\\Users\\nizar\\eclipse-workspace\\MavenProjectTraining\\Extracts\\Datasheet.xlsx");
        FileInputStream fi = new FileInputStream(f);
        
        Workbook book = new XSSFWorkbook(fi);
        
        Sheet sheet = book.getSheet("Cred");
        
        for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
        	Row row = sheet.getRow(i);
        	
        	for (int j=0;j<row.getPhysicalNumberOfCells();j++) {
        		Cell cell = row.getCell(j);
        		
        		System.out.println(cell);
        	}
        }

	}

}
