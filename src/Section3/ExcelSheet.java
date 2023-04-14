package Section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet 
{
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Manojrc\\Documents\\ExcelData\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		String value1=sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value1);
		double value2=sh.getRow(2).getCell(3).getNumericCellValue();
		System.out.println(value2);
	}
}
