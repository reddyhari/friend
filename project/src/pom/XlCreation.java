package pom;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlCreation 
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("C:\\dama\\project\\src\\xlfiles\\gmail.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet ws=wb.createSheet("sheet1");
		Row r=ws.createRow(0);
		Cell c=r.createCell(0);
		c.setCellValue("UserName");
		c=r.createCell(1);
		c.setCellValue("passWord");
		r=ws.createRow(1);
		c=r.createCell(0);
		c.setCellValue("damaharinathreddy00@gmail.com");
		c=r.createCell(1);
		c.setCellValue("harinath");
		
		System.out.println("hai");
		
		fos=new FileOutputStream("C:\\dama\\project\\src\\xlfiles\\gmail.xlsx");
		wb.write(fos);
		fos.close();
		
	}

}
