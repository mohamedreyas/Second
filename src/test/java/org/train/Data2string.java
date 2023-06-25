package org.train;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data2string {
	
	public static void main(String[] args) throws IOException {
		
		
		File f = new File("C:\\Users\\nizar\\eclipse-workspace\\MavenProjectTraining\\Extracts\\Datasheet.xlsx");
        FileInputStream fi = new FileInputStream(f);
        
        Workbook book = new XSSFWorkbook(fi);
        
        Sheet sheet = book.getSheet("Cred");
        
        Row row = sheet.getRow(1);
        
        Cell cell = row.getCell(1);
        
        int cellType = cell.getCellType();
        
        if(cellType == 1) {
        	String name = cell.getStringCellValue();
        	
        	System.out.println(name);
        }
        else if(DateUtil.isCellDateFormatted(cell)){
        	Date date = cell.getDateCellValue();
        	
        	SimpleDateFormat sim = new SimpleDateFormat("dd,mm,yy");
        	String name = sim.format(date);
        	System.out.println(name);
        } else {
			double num = cell.getNumericCellValue();
			
			long l = (long)num;
			
			String name = String.valueOf(l);
			System.out.println(name);
		}
        
       
		
        
	}
}
