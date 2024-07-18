package mavenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUsingIterator {

	public static void main(String[] args) throws IOException {
		FileInputStream FIS=new FileInputStream("C:\\Users\\durga\\Documents\\PaySlips\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(FIS);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Iterator<Row> rowIT = ws.rowIterator();
		while(rowIT.hasNext()) {
			Row row = rowIT.next();
			Iterator<Cell> 	cellIT=row.cellIterator();
			while(cellIT.hasNext()) {
				Cell cell=cellIT.next();
				if(cell.getCellType()==CellType.NUMERIC) {
					System.out.println(cell.getNumericCellValue()+"is numeric");
				}
				else if(cell.getCellType()==CellType.STRING) {
					System.out.println(cell.getStringCellValue()+"is  string");
					}
					else if(cell.getCellType()==CellType.BOOLEAN) {
						System.out.println(cell.getBooleanCellValue()+"is BOOLEAn");
					}
					
				}
			}
		}
	}
