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
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 * driver.manage().window().maximize();
		 */

		// Working with Excel sheet for data driven testing
		FileInputStream fin = new FileInputStream(
				"E://Selenium_Practice_Code_learning//Selenium_practice_code//Working_With_Excels//Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		System.out.println("Total Numbers of sheet into workbook are :- " + workbook.getNumberOfSheets());
		XSSFSheet sheet = workbook.getSheet("Test");
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("Total Number of rows present in sheet are :- " + rowcount);
		XSSFRow row = sheet.getRow(0);
		int colcount = row.getLastCellNum();
		System.out.println("Total Number of columns into the sheet are :- " + colcount);

		// Retriving the data from excel and store it into the arraylist
		
		DataFormatter formatter = new DataFormatter();
		Object data[][] = new Object[rowcount][colcount];
		for (int i = 0; i < rowcount; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colcount; j++) {
				XSSFCell cell = row.getCell(j);
				// System.out.println(cell);
				data[i][j] = formatter.formatCellValue(cell);
				System.out.print(" "+data[i][j]); 

			}
			System.out.println("");
		}

		System.out.println("End of Program Executions");

	}
}
