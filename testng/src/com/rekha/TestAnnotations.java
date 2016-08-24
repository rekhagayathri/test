package com.rekha;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestAnnotations {

	//0 1 1 2 3 5 8....
	public int finbonaci(int n){
		
		//if(n==1 || n==2)
		
		return 0;
	}
	
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("before method");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("before class");
	}
	
	
	/*@DataProvider(name="mine")
	public Object[][] data(){
		return new Object[][]{{new Integer(4),new Integer(5),new Integer(9)},{new Integer(5),new Integer(6),new Integer(11)}};
	}
	
	@Test(dataProvider="mine")*/
	
	@Test(invocationCount=5,invocationTimeOut=1,threadPoolSize=5)
	public void sum(){
		System.out.println("in test meThod::");
		//Assert.assertEquals(expected, a+b);
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("after method");
	}
	
	
	@AfterClass
	public void afterClass(){
		System.out.println("after class");
	}
	
	
}
