package pom;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Login extends Control 
{
	
	
	public void tets() throws InterruptedException
	{
		driver= new FirefoxDriver();
		driver.get("http://gmail.com");
		
	}

}
