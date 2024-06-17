package Selenium_Each_Module_Code_Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Working_wth_Excels {
	public static void main(String[] args) throws IOException {
		

/**
 * The Working_wth_Excels class demonstrates how to work with Excel files
 * using the Apache POI library in a Selenium test automation context.
 * This class includes reading an Excel file and extracting data for data-driven testing.
 *
 * <p>Note: The Selenium WebDriver setup code is commented out and not in use in this example.
 *
 * <pre>
 * Usage:
 * 1. Update the file path to your local Excel file location.
 * 2. Uncomment the Selenium WebDriver setup and usage if needed.
 * </pre>
 *
 * Dependencies:
 * - Apache POI library for handling Excel files.
 * - Selenium WebDriver (if used for browser automation).
 *
 * Example of reading data from an Excel sheet:
 * <pre>
 * {@code
 * // Load the Excel file
 * FileInputStream fin = new FileInputStream("path_to_your_excel_file.xlsx");
 * XSSFWorkbook workbook = new XSSFWorkbook(fin);
 *
 * // Get the first sheet
 * XSSFSheet sheet = workbook.getSheetAt(0);
 *
 * // Read data from the sheet
 * DataFormatter formatter = new DataFormatter();
 * for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
 *     XSSFRow row = sheet.getRow(i);
 *     for (int j = 0; j < row.getLastCellNum(); j++) {
 *         XSSFCell cell = row.getCell(j);
 *         System.out.print(formatter.formatCellValue(cell) + " ");
 *     }
 *     System.out.println();
 * }
 * }
 * </pre>
 */
		
		
		
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 * driver.manage().window().maximize();
		 * 
		 * 
		 * // Working with Excel sheet for data driven testing FileInputStream fin = new
		 * FileInputStream(
		 * "E://Selenium_Practice_Code_learning//Selenium_practice_code//Working_With_Excels//Book1.xlsx"
		 * ); XSSFWorkbook workbook = new XSSFWorkbook(fin);
		 * System.out.println("Total Numbers of sheet into workbook are :- " +
		 * workbook.getNumberOfSheets()); XSSFSheet sheet = workbook.getSheet("Test");
		 * int rowcount = sheet.getPhysicalNumberOfRows();
		 * System.out.println("Total Number of rows present in sheet are :- " +
		 * rowcount); XSSFRow row = sheet.getRow(0); int colcount =
		 * row.getLastCellNum();
		 * System.out.println("Total Number of columns into the sheet are :- " +
		 * colcount);
		 * 
		 * // Retriving the data from excel and store it into the arraylist
		 * 
		 * DataFormatter formatter = new DataFormatter(); Object data[][] = new
		 * Object[rowcount][colcount]; for (int i = 0; i < rowcount; i++) { row =
		 * sheet.getRow(i + 1); for (int j = 0; j < colcount; j++) { XSSFCell cell =
		 * row.getCell(j); // System.out.println(cell); data[i][j] =
		 * formatter.formatCellValue(cell); System.out.print(" "+data[i][j]);
		 * 
		 * } System.out.println(""); }
		 * 
		 * System.out.println("End of Program Executions");
		 */

		}
}
