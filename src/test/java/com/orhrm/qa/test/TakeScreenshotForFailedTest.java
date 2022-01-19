package com.orhrm.qa.test;

import java.io.File;
import java.io.IOException;
import java.sql.Savepoint;
import com.orghrm.qa.util.TakeScreenshotUtil;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orghrm.qa.util.CustomListereners;
import com.orhrm.qa.test.TestBase;

@Listeners(CustomListereners.class)

public class TakeScreenshotForFailedTest extends TestBase{
	
	public TakeScreenshotForFailedTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Test
	public void Test1() {
		System.out.println("this is test1");
		int i=1/0;
	}
	@Test
	public void Test2() {
		int i=1/0;
		System.out.println("this is test1");
	}
	@Test
	public void Test3() {
		int i=1/0;
		System.out.println("this is test1");
	}
	@Test
	public void Test4() {
		int i=1/0;
		System.out.println("this is test1");
	}
	@Test
	public void Test5() {
		int i=1/0;
		System.out.println("this is test1");
	}

	 
	}