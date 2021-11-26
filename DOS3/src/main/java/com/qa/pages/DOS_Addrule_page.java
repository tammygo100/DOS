package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dos.base.testbase;

public class DOS_Addrule_page extends testbase
{
	int totalEnabledElements = 0;
	
	public Select s;
DOS_Homepage homepage;

//PAGEFACTORY

	@FindBy(xpath="//*[@id=\"app-admin-content\"]/div/div/div[1]/div[1]/button")
	public WebElement Addrulebtn;
	
	@FindBy(xpath="//*[@id=\"priority\"]")
	WebElement priority;
	
	@FindBy(xpath="//div[@class='label-text-overflow' and contains(text(),'Please Select')]")
	WebElement distributor;
	
	@FindBy(xpath="//*[@id=\"dlg-content-addRulePopup\"]/form/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/button/div/div/div")
	WebElement country;
	
	@FindBy(xpath="//*[@id=\"dlg-content-addRulePopup\"]/form/div/div/div/div[1]/div[2]/div[2]/div/div/div/div/button/div/div/div")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"comment\"]")
	WebElement comment;
	
	@FindBy(xpath="//*[@id=\"dlg-content-addRulePopup\"]/form/div/div/div/div[2]/div/div/div/button[1]")
	WebElement Savebtn;
	
	@FindBy(xpath="//*[@id=\"dlg-content-addRulePopup\"]/form/div/div/div/div[2]/div/div/div/button[2]")
	WebElement resetbtn;
	
	@FindBy(xpath="//*[@id=\"dlg-content-addRulePopup\"]/form/div/div/div/div[2]/div/div/div/button[3]")
	WebElement cancelbtn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/form/div/div/div/div[3]/div/button")
	WebElement hitlogin;
	
	@FindBy(xpath="//li[@data-test-automation-id='itemABP_AUS']")
	WebElement abp;
	
	@FindBy(xpath="//*[@id='select_26_1_option_1']")
	WebElement usa;
	
	@FindBy(xpath="//*[@id=\"select_21_1_option_1\"]/span/div[1]/span/span")
	WebElement alab;
	
	
	public DOS_Addrule_page()
	{
		PageFactory.initElements(driver, this);
	}

		public void checkaddbtnisvisible()
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
		public void addrulehappypath() throws InterruptedException
		{
			hitlogin.click();
				Addrulebtn.click();
					Thread.sleep(2000);
						priority.sendKeys("130");
						Thread.sleep(2000);
			Select distributorp=new Select(distributor);
			distributorp.selectByVisibleText("ABP_AUS");	
			Thread.sleep(2000);
			Select Countryp=new Select(country);
			Countryp.selectByVisibleText("United States (USA)");		
			Select Statep=new Select(state);
			Thread.sleep(2000);
			Statep.selectByVisibleText("Alabama (AL)");	
			comment.sendKeys("this is test");
			Thread.sleep(2000);
			Savebtn.click();
		}
		
		
		/*public void addrulepath() throws InterruptedException
		{
			hitlogin.click();
			Addrulebtn.click();
				Thread.sleep(2000);
					priority.sendKeys("130");
					Thread.sleep(2000);
					distributor.click();
					Thread.sleep(5000);
					abp.click();
			
		}*/
		
		public void addrulepath() throws InterruptedException
		{
			hitlogin.click();
			Addrulebtn.click();
				Thread.sleep(2000);
					priority.sendKeys("120");
					Thread.sleep(2000);
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", distributor);
					Thread.sleep(4000);
					JavascriptExecutor executor1 = (JavascriptExecutor)driver;
					executor1.executeScript("arguments[0].click();", abp);
					Thread.sleep(2000);
					/*JavascriptExecutor executor2 = (JavascriptExecutor)driver;
					executor2.executeScript("arguments[0].click();", country);
					Thread.sleep(4000);
					new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='select_26_1_option_1']"))).click();
					Thread.sleep(4000);
					JavascriptExecutor executor3 = (JavascriptExecutor)driver;
					executor3.executeScript("arguments[0].click();", usa);
					Thread.sleep(2000);
					JavascriptExecutor executor4 = (JavascriptExecutor)driver;
					executor4.executeScript("arguments[0].click();", state);
					Thread.sleep(2000);
					JavascriptExecutor executor5 = (JavascriptExecutor)driver;
					executor5.executeScript("arguments[0].click();", alab);
					Thread.sleep(2000);*/
					comment.sendKeys("this is a test rule creation");
					Thread.sleep(2000);
					Savebtn.click();
	    		
	    	    }
	    	}
	

		
