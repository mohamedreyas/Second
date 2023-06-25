package org.train;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadnewFile {

	public static void main(String[] args) throws IOException {

       File f = new File ("C:\\Users\\nizar\\eclipse-workspace\\MavenProjectTraining\\Extracts\\Newsheet.xlsx");
       
       FileInputStream fi = new FileInputStream(f);
       
       Workbook book = new XSSFWorkbook(fi);
       
       Sheet sheet = book.getSheet("Data");
       
       Row row = sheet.createRow(1);
       
       Cell c1 = row.createCell(0);
       Cell c2 = row.createCell(1);
       
       c1.setCellValue("Rahima");
       c2.setCellValue("67890");
       
       FileOutputStream fo = new FileOutputStream(f);
       
       book.write(fo);
       
       System.out.println("Success");
       
       

	}

}
