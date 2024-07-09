package Working_with_Excels;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice_of_working_with_excel {
	public static void main(String[] args) throws IOException {

		// DataFormatter in Excels
		DataFormatter formatter = new DataFormatter();

		// Working with Excels
		FileInputStream fin = new FileInputStream("C://Users//Admin//Desktop//Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		int count_sheet = workbook.getNumberOfSheets();
		System.out.println("Number of Sheets:- " + count_sheet);

		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row_count = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows into this sheet are :- " + row_count);
		
		  XSSFRow row = sheet.getRow(0); XSSFCell cell = row.getCell(0);
		
		  int col_count = sheet.getRow(0).getPhysicalNumberOfCells();
		  System.out.println("Number of cells into the row are :- " + col_count);
		  
		  // Retrieving all the details from this excel sheet 
		  Object data[][] = new
		  Object[row_count][col_count]; for (int i = 0; i < row_count; i++) { XSSFRow
		  curretRow = sheet.getRow(i); for (int j = 0; j < col_count; j++) { XSSFCell
		  curentCell = curretRow.getCell(j); data[i][j] =
		  formatter.formatCellValue(curentCell); System.out.println(""+data[i][j]); }
		  System.out.println("");
		  
		  }
		 

		
		/*
		 * // Retrieving the any cell value at specific location Iterator<Row>
		 * rowsIterator = sheet.iterator();
		 * 
		 * while (rowsIterator.hasNext()) { Row firstRow = rowsIterator.next();
		 * Iterator<Cell> cellIterator = firstRow.cellIterator(); while
		 * (cellIterator.hasNext()) { Cell cell_value = cellIterator.next();
		 * 
		 * if(cell_value.getStringCellValue().equalsIgnoreCase("Principle")) {
		 * System.out.println("Cell value:- "+cell_value); }
		 * 
		 * 
		 * // Adding wrapper class to this
		 * 
		 * Array a; if(cell_value.getCellType()==CellType.STRING) {
		 * System.out.println("Cell Value:- "+ cell_value); } else {
		 * System.out.println("Cell Value:- "+
		 * a.add(numericToTextConverter.toText(cell_value.getNumericCellValue()))); }
		 * 
		 * }
		 * 
		 * }
		 */		 

		// Closing workbook & file
		workbook.close();
		fin.close();

	}
}
