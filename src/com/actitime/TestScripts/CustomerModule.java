package com.actitime.TestScripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.Generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.Generic.ListenerImplementation.class)

public class CustomerModule extends BaseClass {
	@Test
	public void creatCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{  
	FileInputStream fis=new FileInputStream("./data/Excel.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String customername = wb.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
	String description = wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		TaskList t=new TaskList(driver);
		t.getAddnewbtn().click();
		t.getNewcustomerbtn().click();
		t.getentercustomernamefield().sendKeys(customername);
		t.getEntercustomerdescriptionfield().sendKeys(description);
		t.getSelectcustomer().click();
		t.getOurcompany().click();
		t.getCreatecustomerbtn().click();
		Thread.sleep(4000); 
		String actualcustomer = t.getActualcustomercreated().getText();

		Assert.assertEquals(actualcustomer,customername);
		Reporter.log("created customer actual customer is same",true);
		
	}
	

}
