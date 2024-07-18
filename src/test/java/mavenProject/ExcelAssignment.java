package mavenProject;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelAssignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		List<WebElement> all=driver.findElements(By.xpath("//table[@class='zebra fw tb-theme']//tbody//tr//td//a"));
		System.out.println(all.size());
		for(WebElement links:all)
			{
		   System.out.print(links.getText()+" ");
			{
		   System.out.println();
		    }
			}
		{
		driver.quit();
		}
	}
											}	
