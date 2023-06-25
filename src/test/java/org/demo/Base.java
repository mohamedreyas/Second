package org.demo;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.train.Browserlaunch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Actions a;
	
	
	public static void Browserlaunch() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

	}
	
	public static void Lauchurl(String url) {
		driver.get(url);

	}
	
	public static void windowmax() {
		driver.manage().window().maximize();

	}
	
	public static String title() {
		String titlename = driver.getTitle();
		System.out.println(titlename);
		return titlename;

	}
	
	public static void filltext(WebElement element, String value) {
		element.sendKeys(value);

	}
	
	public static void btnclk(WebElement element) {
		element.click();

	}
	
	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src =ts.getScreenshotAs(OutputType.FILE);
		File des = new File ("C:\\Users\\nizar\\eclipse-workspace\\MavenProjectTraining\\Screenshot\\"+name+".png");
		FileUtils.copyFile(src, des);
		

	}
	
	public static void mousehover(WebElement ref) {
		 a = new Actions(driver);
		 a.moveToElement(ref).perform();

	}
	
	public static void Mouseupanddown() {
		a= new Actions(driver);
		a.keyDown(Keys.SHIFT).sendKeys("Reyas@gmail.com").keyUp(Keys.SHIFT).build().perform();

	}
	
	public static String readExcel (String sheet, int row, int cell) throws IOException {
		
		String name;
		
		File f = new File("C:\\Users\\nizar\\eclipse-workspace\\MavenProjectTraining\\Extracts\\Datasheet.xlsx");
        FileInputStream fi = new FileInputStream(f);
        
        Workbook book = new XSSFWorkbook(fi);
        
        Sheet s = book.getSheet("Cred");
        
        Row r = s.getRow(1);
        
        Cell c = r.getCell(1);
        
        int cellType = c.getCellType();
        
        if(cellType == 1) {
        	name = c.getStringCellValue();
        	
        	
        }
        else if(DateUtil.isCellDateFormatted(c)){
        	Date date = c.getDateCellValue();
        	
        	SimpleDateFormat sim = new SimpleDateFormat("dd,mm,yy");
        	name = sim.format(date);
        	
        } else {
			double num = c.getNumericCellValue();
			
			long l = (long)num;
			
			name = String.valueOf(l);
			
		}
        
        System.out.println(name);
        
        return name;
       
		}
        
	
	
	 public static  void getsheetvalue(String sheetname, int row_num, int cell_num_1, int cell_num_2, String cell_value_1, String cell_value_2) throws IOException {
		 
		 File f = new File ("C:\\Users\\nizar\\eclipse-workspace\\MavenProjectTraining\\Extracts\\Newsheet.xlsx");
	       
	       FileInputStream fi = new FileInputStream(f);
	       
	       Workbook book = new XSSFWorkbook(fi);
	       
	       Sheet sheet = book.getSheet(sheetname);
	       
	       Row row = sheet.createRow(row_num);
	       
	       Cell c1 = row.createCell(cell_num_1);
	       Cell c2 = row.createCell(cell_num_2);
	       
	       c1.setCellValue(cell_value_1);
	       c2.setCellValue(cell_value_2);
	       
	       FileOutputStream fo = new FileOutputStream(f);
	       
	       book.write(fo);
	       
	       System.out.println("Success");
	       


	}

	


}
