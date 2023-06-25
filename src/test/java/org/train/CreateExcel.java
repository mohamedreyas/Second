package org.train;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

	public static void main(String[] args) throws IOException {

          File f = new File ("C:\\Users\\nizar\\eclipse-workspace\\MavenProjectTraining\\Extracts\\Newsheet.xlsx");
          
          Workbook book = new XSSFWorkbook();
          
          Sheet createSheet = book.createSheet("Data");
          
          Row createRow = createSheet.createRow(0);
          
          Cell createCell1 = createRow.createCell(0);
          Cell createCell2 = createRow.createCell(1);
          
          createCell1.setCellValue("User");
          
          createCell2.setCellValue("Pass");
          
          FileOutputStream fo = new FileOutputStream(f);
          
          book.write(fo);
            

	}

}
