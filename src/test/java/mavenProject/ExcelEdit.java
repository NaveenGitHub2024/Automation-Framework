package mavenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelEdit {

	public static void main(String[] args) throws IOException {
		FileInputStream FIS=new FileInputStream("C:\\Users\\durga\\Documents\\PaySlips\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(FIS);
		XSSFSheet ws = wb.getSheet("Sheet1");
		//ws.getRow(1).getCell(1).setCellValue("MNB");  //updating the cell
		ws.getRow(2).createCell(4).setCellValue("10,0000"); //Creating a cell and adding data in existing row
		ws.createRow(5).createCell(0).setCellValue(01/01/2000); //creating new row , new cell and adding data
		FileOutputStream FOS = new FileOutputStream("C:\\\\Users\\\\durga\\\\Documents\\\\PaySlips\\\\Book1.xlsx");
		wb.write(FOS);
		System.err.println("end...");

	}

}
