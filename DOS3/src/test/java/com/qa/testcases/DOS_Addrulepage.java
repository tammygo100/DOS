package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dos.base.testbase;
import com.dos.util.testutil;
import com.qa.pages.DOS_Addrule_page;
import com.qa.pages.DOS_Homepage;

public class DOS_Addrulepage extends testbase
{
	DOS_Homepage homepage;
	DOS_Addrule_page addrulepage;
	testutil util;
	public DOS_Addrulepage()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();	
		addrulepage=new DOS_Addrule_page();		
}

	@Test
	public void addrulepathtest() throws InterruptedException
	{
		addrulepage.addrulepath();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
