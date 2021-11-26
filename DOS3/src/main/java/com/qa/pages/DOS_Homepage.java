package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dos.base.testbase;

public class DOS_Homepage extends testbase
{
	
	int totalEnabledElements = 0;
//PAGEFACTORY
	
	@FindBy(xpath="//*[@id=\"app-admin-content\"]/div/div/div[1]/div[1]/button")
	public WebElement Addrulebtn;
	
	@FindBy(xpath="//*[@id=\"app-admin-content\"]/div/div/div[1]/div[2]/button")
	 WebElement Exportbtn;
	
	@FindBy(xpath="//*[@id=\"app-admin-content\"]/div/div/div[2]/div/div/div[1]/table/thead/tr/th[1]")
	WebElement priority;
	
	@FindBy(xpath="//*[@id=\"app-admin-content\"]/div/div/div[2]/div/div/div[1]/table/thead/tr/th[2]")
	WebElement distributor;
	
	@FindBy(xpath="//*[@id=\"app-admin-content\"]/div/div/div[2]/div/div/div[1]/table/thead/tr/th[3]")
	WebElement country;
	
	@FindBy(xpath="//*[@id=\"app-admin-content\"]/div/div/div[2]/div/div/div[1]/table/thead/tr/th[4]")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"app-admin-content\"]/div/div/div[2]/div/div/div[1]/table/thead/tr/th[5]")
	WebElement city;
	
	@FindBy(xpath="//*[@id=\"app-admin-content\"]/div/div/div[2]/div/div/div[1]/table/thead/tr/th[6]")
	WebElement userID;
	
	@FindBy(xpath="//*[@id=\"app-admin-content\"]/div/div/div[2]/div/div/div[1]/table/thead/tr/th[7]")
	WebElement BrandID;
	
	@FindBy(xpath="//*[@id=\"app-admin-content\"]/div/div/div[2]/div/div/div[1]/table/thead/tr/th[8]")
	WebElement Devicetype;
	
	
	@FindBy(xpath="//*[@id=\"app-admin-content\"]/div/div/div[2]/div/div/div[1]/table/thead/tr/th[9]")
	WebElement Featuretype;
	
	@FindBy(xpath="//*[@id=\"app-admin-content\"]/div/div/div[2]/div/div/div[1]/table/thead/tr/th[10]")
	WebElement RCdevice;
	
	@FindBy(xpath="//*[@id=\"app-admin-content\"]/div/div/div[2]/div/div/div[1]/table/thead/tr/th[11]")
	WebElement Actions;
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div/main/aside/div/div[1]/div[6]/div[2]/div/a/div")
	WebElement pagetitle;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/form/div/div/div/div[3]/div/button")
	WebElement hitlogin;
	
	
	public DOS_Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifypagetitle() throws InterruptedException
	{
		hitlogin.click();
		Thread.sleep(2000);
		return driver.getTitle();
	}
	
	public void checkaddfieldsvisible()
	{
		hitlogin.click();
		try{

	        List<WebElement> addbtn = driver.findElements(By.xpath("//*[@id=\"app-admin-content\"]/div/div/div[1]/div[1]/button"));
	        if(addbtn.size()>0){

	            for(int i=0; i<addbtn.size(); i++){

	                if(addbtn.get(i).isEnabled()==true){

	                	addbtn.get(i).click();
	                    totalEnabledElements++;

	                }else{
	                    System.out.println("element not visible or hidden :" +addbtn.get(i).getText());
	                }

	            }

	            System.out.println("total enabled elements: " +totalEnabledElements);

	        }else{

	            System.out.println("No Add button found on the page!");
	        }

	    }catch(Exception e){
	        System.out.println(e.getStackTrace());
	    }
	}
	
	public boolean checexpotbuttonvisible()
	{
		return Exportbtn.isEnabled();
	}
	
}
