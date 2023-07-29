package com.actitime.TestScripts;

import org.testng.annotations.Test;

import com.actitime.Generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskList;

public class ddelete extends BaseClass {
	@Test
	public void del() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		Thread.sleep(5000);
		TaskList t=new TaskList(driver);
		t.getClickonhdfc().click();
		t.getClickonhdfcedit().click();
		Thread.sleep(3000);
		t.getActionscustomer().click();
		t.getDeleteopt().click();
		t.getDeletebtn();
	}

}
