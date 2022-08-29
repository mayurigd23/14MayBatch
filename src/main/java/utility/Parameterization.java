package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	public static String getData( String sheetName, int row ,int cell) throws EncryptedDocumentException , IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\mayur\\OneDrive\\Documents\\subodh Sir\\selenium\\books.xlsm");
	String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return value;
	}
	public static double Store( String sheetName, int row ,int cell) throws EncryptedDocumentException , IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\mayur\\OneDrive\\Documents\\subodh Sir\\selenium\\books.xlsm");
double value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getNumericCellValue();
	return value;
}
}
