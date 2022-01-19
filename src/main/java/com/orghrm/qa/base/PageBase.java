package com.orghrm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PageBase {
	
	public static Properties prop;
	public static WebDriver driver;
	public PageBase() throws IOException {
		prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\ramr1\\Desktop\\Batch14\\OrangeHRMTestPOM\\src\\main\\java\\com\\qa\\orghrm\\config\\congiguration.properties");
		
		prop.load(file);
	}
	
	public static WebDriver initialiZation(String browserName,String URL ) {
		
		
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
		}
		else {
			System.out.println("We do not support this browser");
		}
		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.get(URL);
			
		
		return driver;
		
	}
	
	

}
