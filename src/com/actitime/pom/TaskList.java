package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TaskList {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
    private WebElement newcustomerbtn;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernamefield;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustomerdescriptionfield;
	
	@FindBy(xpath = "(//div[text()='- Select Customer -'])[1]")
	private WebElement selectcustomer;
	
	@FindBy(xpath = "(//div[@class='titleEditButtonContainer'])/div[1]")
	private WebElement actualcustomercreated;
	
	@FindBy(xpath = "//div[@class='itemRow cpItemRow ' and text()='Big Bang Company']")
	private WebElement ourcompany;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createcustomerbtn;
	
	@FindBy(xpath = "//div[@class='text' and  text()='HDFC_0001']")
	private WebElement clickonhdfc;
	
	public WebElement getEntercustomernamefield() {
		return entercustomernamefield;
	}


	public WebElement getClickonhdfc() {
		return clickonhdfc;
	}


	public WebElement getClickonhdfcedit() {
		return clickonhdfcedit;
	}


	public WebElement getActionscustomer() {
		return actionscustomer;
	}


	public WebElement getDeleteopt() {
		return deleteopt;
	}


	public WebElement getDeletebtn() {
		return deletebtn;
	}

	@FindBy(xpath = "//div[@class='title']//div[text()='HDFC_0001']/../../div[4]")
	private WebElement clickonhdfcedit;
	
	@FindBy(xpath = "//div[@class='editCustomerPanelHeader']/div[3]")
	private WebElement actionscustomer;
	
	@FindBy(xpath = "(//div[@class='deleteButton'])[1]")
	private WebElement deleteopt;
	
	@FindBy(xpath = "//div[@class='buttonIcon']/span[text()='Delete permanently']")
	private WebElement deletebtn;
	
	
	
	public TaskList(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getActualcustomercreated() {
		return actualcustomercreated;
	}

	public WebElement getSelectcustomer() {
		return selectcustomer;
	}

	public WebElement getentercustomernamefield() {
		return entercustomernamefield;
	}

	public WebElement getEntercustomerdescriptionfield() {
		return entercustomerdescriptionfield;
	}

	public WebElement getOurcompany() {
		return ourcompany;
	}

	public WebElement getCreatecustomerbtn() {
		return createcustomerbtn;
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcustomerbtn() {
		return newcustomerbtn;
	}
	
}
