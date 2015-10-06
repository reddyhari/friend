package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Control 
{
	public  static WebDriver driver;
	@Test
	public void log() throws InterruptedException, IOException
	{
		Login l=new Login();
		l.tets();
		Data d=new Data();
		d.dataForlogin();
	}

}
