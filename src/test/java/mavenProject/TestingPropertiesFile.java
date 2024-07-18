package mavenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingPropertiesFile {

	public static void main(String[] args) throws InterruptedException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\durga\\FLMSelenuimWithJava\\FrameWorkAutomation\\AdactinBuildOne\\AdactinBuildOne.properties");
		Properties ps=new Properties();
		ps.load(fis);
	WebDriver driver =	new ChromeDriver();
	//System.out.println(ps.getProperty("url"));
	driver.get(ps.getProperty("url"));
	driver.findElement(By.xpath(ps.getProperty("user_name"))).sendKeys("ryaz");
	driver.findElement(By.xpath(ps.getProperty("password"))).sendKeys("ryaz123*");
	Thread.sleep(3000);
	driver.quit();
	}
}
