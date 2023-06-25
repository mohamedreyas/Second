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

public class DayaTest {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\nizar\\eclipse-workspace\\MavenProjectTraining\\Extracts\\Datasheet.xlsx");
        FileInputStream fi = new FileInputStream(f);
        
        Workbook book = new XSSFWorkbook(fi);
        
        Sheet sheet = book.getSheet("Cred");
        
        Row row = sheet.getRow(1);
        
        Cell c1 = row.getCell(0);
        System.out.println(c1);
	}

}
