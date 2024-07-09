package Working_with_Excels;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException {

		// Basic setup for working with excels
		FileInputStream fin = new FileInputStream(
				"C://Users//Admin//Desktop//Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		System.out.println("Sheet Name is :- " + sheet.getSheetName());

		// Working with rows & columns
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);

		// Print number of rows
		int last_row_number = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows:-  " + last_row_number);

		// Print number of col
		int col_count = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of column:- " + col_count);

		// Printing all the records of table from excel sheet
		/*
		 * String value=""; for (int i=0;i<=last_row_number;i++) { XSSFRow
		 * current_row=sheet.getRow(i); for (int j=0;j<=col_count;j++) { XSSFCell cell1
		 * =current_row.getCell(j);
		 * 
		 * if(cell1!=null) { value=cell1.getStringCellValue(); }
		 * 
		 * String value=current_row.getCell(j).getStringCellValue();
		 * System.out.print(" "+value);
		 * 
		 * System.out.print(" "+value); } System.out.println(" "); }
		 */

		
		//Printing all the records from excel sheet using the data formatter 
		DataFormatter formatter=new DataFormatter();
		Object data[][]=new Object[last_row_number][col_count];
		for (int i=0;i<last_row_number;i++)
		{
			XSSFRow current_row=sheet.getRow(i);
			for (int j=0;j<col_count;j++)
			{
				XSSFCell cell1=current_row.getCell(j);
				data[i][j]=formatter.formatCellValue(cell1);
				System.out.print(" "+data[i][j]);
			}
			System.out.println(" ");
		}
	}

}
