package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class Data extends Control
{
	public void dataForlogin() throws InterruptedException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\dama\\project\\gmail.properties");
		FileInputStream fgxl=new FileInputStream("C:\\dama\\project\\src\\xlfiles\\gmail.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fgxl);
		XSSFSheet ws=wb.getSheet("sheet1");
		Iterator<Row>row=ws.iterator();
		row.next();
		while (row.hasNext())
		{
			Row r=row.next();
			
			r=ws.getRow(1);
			
			String name=r.getCell(0).getStringCellValue();
			
			String pass=r.getCell(1).getStringCellValue();
		
		
		Properties p=new Properties();
		p.load(fis);
		driver.findElement(By.id(p.getProperty("uname"))).sendKeys(name);
		driver.findElement(By.id(p.getProperty("btn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(p.getProperty("pwd"))).sendKeys(pass);
		driver.findElement(By.id(p.getProperty("btn2"))).click();
		
		
		}
	}

}
