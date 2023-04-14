package Section3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataWriting 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Manojrc\\Documents\\ExcelData\\Book3.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		sh.createRow(4).createCell(0).setCellValue("Yuvraj SINGH");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Manojrc\\Documents\\ExcelData\\Book3.xlsx");
		book.write(fos);
		fos.flush();
		System.out.println("Pass");
	}
}
