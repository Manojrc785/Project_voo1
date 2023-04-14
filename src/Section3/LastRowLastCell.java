package Section3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastRowLastCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Manojrc\\Documents\\ExcelData\\Book2.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		 Sheet sh=book.getSheet("Sheet1");
		int lastRow= sh.getLastRowNum();
		System.out.println(lastRow);
		short lastCell=sh.getRow(0).getLastCellNum();
		System.out.println(lastCell);
	}
}
