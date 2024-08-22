package Upload_and_Download_Excel_functionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Upload_and_download 
{
	public static void main(String args[]) throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");

		// ------**************Clicking on download button------**************
		driver.findElement(By.cssSelector("#downloadButton")).click();

		// Updating values into excel file then upload it to the webpage
		int row = row_number();
		int col = col_num();
		String update_value = "2011";
		update_cell_Data(row, col, update_value);
		
		
		// ------**************Clicking on Upload button------**************
		Thread.sleep(3000);
		WebElement upload_btn = driver.findElement(By.cssSelector("#fileinput"));
		upload_btn.sendKeys("C://Users//Admin//Downloads//download.xlsx");

		// ------**************Wait until the toast messaage is appears & validate the
		// toast message ------**************
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		By toast_msg = By.xpath(" //div[contains(text(),'Updated Excel Data Successfully.')]");
		wait.until(ExpectedConditions.visibilityOfElementLocated(toast_msg));
		String toast_msg_text = driver.findElement(toast_msg).getText();
		System.out.println(toast_msg_text);
		Assert.assertEquals("Updated Excel Data Successfully.", toast_msg_text);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toast_msg));

		// ------**************Validating that updated excel data is going to be
		// reflected on webpage ------**************
		String FruitName = "Apple";
		String col_id = driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
		/*
		 * System.out.println("Column id for price is:- "+ col_id); WebElement
		 * actual_price=driver.findElement(By.xpath("//div[text()='" + FruitName +
		 * "']/parent::div/parent::div/div[@id='cell-" + col_id + "-undefined']"));
		 * 
		 * //"//div[text()='" + fruitName+ "']/parent::div/parent::div/div[@id='cell-" +
		 * priceColumn + "-undefined']" System.out.println(actual_price);
		 */

		// Verify if the column ID is correct
		System.out.println("Column id for price is:- " + col_id);

		// Locate the actual price element
		WebElement actual_price = driver.findElement(By.xpath(
				"//div[text()='" + FruitName + "']/parent::div/parent::div/div[@id='cell-" + col_id + "-undefined']"));
		System.out.println("Actual Price WebElement: " + actual_price);

		// Print out the text of the actual price element
		System.out.println("Actual Price Text: " + actual_price.getText());
		Assert.assertEquals("603", actual_price.getText());

		// ------**************Closing browser window------**************
		driver.close();
		System.out.println("End of program Execution");

	}

	public static void update_cell_Data(int row, int col, String updatedValue)
	        throws FileNotFoundException, IOException, InterruptedException 
	{
	    FileInputStream fis = new FileInputStream("C://Users//Admin//Downloads//download.xlsx");
	    XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    XSSFSheet sheet = workbook.getSheet("Sheet1");
	    Row rowField = sheet.getRow(row - 1);
	    Cell cellField = rowField.getCell(col - 1);
	    cellField.setCellValue(updatedValue);
	    FileOutputStream fos = null;
	    boolean fileOpened = false;
	    int retries = 0;
	    while (!fileOpened && retries < 5) { // Retry up to 5 times
	        try {
	            fos = new FileOutputStream("C://Users//Admin//Downloads//download.xlsx");
	            workbook.write(fos);
	            fileOpened = true;
	        } catch (IOException e) {
	            // File is locked, wait for a moment and retry
	            retries++;
	            Thread.sleep(2000); // Wait for 2 seconds
	        }
	    }
	    if (!fileOpened) {
	        throw new IOException("Unable to open file after multiple retries. File may be locked by another process.");
	    }
	    if (fos != null) {
	        fos.close();
	    }
	    workbook.close();
	    fis.close();
	}

	public static int col_num() throws FileNotFoundException, IOException
	{
		FileInputStream fin = new FileInputStream("C://Users//Admin//Downloads//download.xlsx");
		int column = 0;
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row_count = sheet.getPhysicalNumberOfRows();
		Row row = sheet.getRow(0);
		int col_count = row.getLastCellNum();
		System.out.println("Total Number of columns present into the excel sheet are :- " + col_count);
		Iterator<Row> rows = sheet.rowIterator();
		while (rows.hasNext()) {
			Row row1 = rows.next();
			Iterator<Cell> cells1 = row1.iterator();
			int k = 1;

			while (cells1.hasNext()) {
				Cell cell1 = cells1.next();
				if (cell1.getCellType() == CellType.STRING && cell1.getStringCellValue().equalsIgnoreCase("Price"))
					;
				{
					column = k;
				}
				k++;
			}

		}
		System.out.println("Price column is located at :- " + column);
		return column;

	}

	public static int row_number() throws FileNotFoundException, IOException
	{
		FileInputStream fin = new FileInputStream("C://Users//Admin//Downloads//download.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row_count = sheet.getPhysicalNumberOfRows();
		System.out.println("Total Number of rows present into the excel sheet are :- " + row_count);
		Iterator<Row> rows = sheet.rowIterator();
		int k = 1;
		int row_index = -1;
		while (rows.hasNext()) {
			Row row = rows.next();
			Iterator<Cell> cells = row.cellIterator();
			while (cells.hasNext()) {
				Cell cell = cells.next();
				if (cell.getCellType() == CellType.STRING && cell.getStringCellValue().equalsIgnoreCase("Apple")) {
					row_index = k;

				}
			}
			k++;
		}
		System.out.println("Row Number where Apple is present:- " + row_index);
		return row_index;
	}

}
