package com.freecrm.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest  {
	
	public static WebDriver driver;
	
	public static Properties prop;



public BaseTest() {
	
	prop=new Properties();
	
	try {
		FileInputStream file = new FileInputStream("D:/D Drive/Mohit/WorkSpace_Mohit/FreeCrmAutomation/src"
				+ "/main/java/com/freecrm/config/config.properties");
		prop.load(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public void initialization() {
		
		String browsername=prop.getProperty("browser");
		if (browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","D:/D Drive/Mohit/WorkSpace_Mohit"
				+ "/FreeCrmAutomation/ChromeDriverExe/chromedriver.exe");		
		 driver = new ChromeDriver();
		
	} 
	
	else if (browsername.equals("firefox"))

	{
		System.setProperty("webdriver.gecko.driver",
				"D:\\D Drive\\Mohit\\WorkSpace_Mohit\\RedBusIndia\\"
				+ "src\\main\\java\\com\\redbusindia\\qa\\utilities\\Chrome\\chromedriver.exe");
		driver = new FirefoxDriver();
		
		
	}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	
	

}