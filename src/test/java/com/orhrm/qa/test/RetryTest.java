package com.orhrm.qa.test;

import org.testng.annotations.Test;

import com.orghrm.qa.util.RetryAnalyzer;


public class RetryTest  {
	
	@Test()
	public void Test1() {
		System.out.println("This is first Test");
		int i=1/0;
	}
	@Test
	public void Test2() {
		System.out.println("This is second Test");
	}
	@Test
	public void Test3() {
		System.out.println("This is third");
		int i=1/0;
		
	}
	@Test
	public void Test4() {
		System.out.println("This is fourth");
	}

}
