package mavenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		FileInputStream	FIS=new FileInputStream("C:\\Users\\durga\\Documents\\PaySlips\\Book1.xlsx");
		XSSFWorkbook Wb=new XSSFWorkbook(FIS);
		XSSFSheet XS = Wb.getSheet("Sheet1");
//		System.out.println(XS.getLastRowNum());
//		System.out.println(XS.getPhysicalNumberOfRows());
//		System.out.println(XS.getRow(0).getLastCellNum());
//		System.out.println(XS.getRow(2).getPhysicalNumberOfCells());
		XSSFRow row=null;
		XSSFCell cell=null;
		for(int i=0;i<=XS.getLastRowNum();i++) {
			row=XS.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				 cell=row.getCell(j);
				if(cell.getCellType()==CellType.NUMERIC)
				{
					System.out.println(cell.getNumericCellValue()+" is a Number");
				}
				else if(cell.getCellType()==CellType.STRING)
				{
					System.out.println(cell.getStringCellValue()+" is a String");
				}
				else if(cell.getCellType()==CellType.BOOLEAN)
				{
					System.out.println(cell.getBooleanCellValue()+" is a Boolean");
				}
			}
		}

	}

}
