package Working_with_Excels;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writing_data_in_excel_sheet_files {
    public static void main(String[] args) throws IOException {

        // Basic setup for working with excels
        String path = "C://Users//Admin//Desktop//Book1.xlsx";
        FileInputStream fin = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fin);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        System.out.println("Sheet Name is :- " + sheet.getSheetName());

        // Working with rows & columns
        XSSFRow row = sheet.getRow(0);
        XSSFCell cell = row.getCell(0);

        // Print number of rows
        int last_row_number = sheet.getPhysicalNumberOfRows();
        System.out.println("Number of rows:-  " + last_row_number);

        // Printing number of columns
        int last_col_num = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("Number of cells:-  " + last_col_num);

        // Loop to add data to the fifth column
        for (int i = 0; i < last_row_number; i++) {
            Row row2 = sheet.getRow(i);
            if (row2 == null) {
                row2 = sheet.createRow(i);
            }
            Cell cell2 = row2.createCell(4); // Fifth column (index starts at 0)
            cell2.setCellValue("RG");
        }

        // Writing data back to the file
        FileOutputStream fS = new FileOutputStream(path);
        workbook.write(fS);
        fS.close();
        workbook.close();
        fin.close();
    }
}
