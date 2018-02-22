package week3.day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public void readData() throws IOException {
		//Goto file location
		FileInputStream fis = new FileInputStream(new File("./data/create.xlsx"));
		//Open workbook
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		//Goto sheet
		XSSFSheet sheet = wbook.getSheet("Create");
		//Goto the row
		/*int physicalNum = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNum);*/
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		//Goto the cell
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		//Read the data
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}wbook.close();
	}
}



























