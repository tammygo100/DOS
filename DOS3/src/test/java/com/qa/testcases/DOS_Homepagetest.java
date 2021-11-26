package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dos.base.testbase;
import com.dos.util.testutil;
import com.qa.pages.DOS_Homepage;

public class DOS_Homepagetest extends testbase
{
	DOS_Homepage homepage;
	testutil util;
	public DOS_Homepagetest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();	
		homepage=new DOS_Homepage();		
}
	
	@Test(priority=1)
	public void DOS_pagetitletest()
	{
		try {
			homepage.verifypagetitle();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=2)
	public void test_addbtnvisible()
	{
		homepage.checkaddfieldsvisible();
	}
	
	@AfterMethod
	public void teardown()
	{
	driver.quit();
	}
}
