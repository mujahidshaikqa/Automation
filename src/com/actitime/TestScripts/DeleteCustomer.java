package com.actitime.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.Generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskList;

public class DeleteCustomer extends BaseClass{
	@Test
	public void deleteCustomer() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='text' and  text()='HDFC_0001']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='title']//div[text()='HDFC_0001']/../../div[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='editCustomerPanelHeader']/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='deleteButton'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='buttonIcon']/span[text()='Delete permanently']")).click();
		Thread.sleep(3000);
		Reporter.log("Customer deleted",true);
	}

}
