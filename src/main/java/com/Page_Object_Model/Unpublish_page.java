package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Global.Base_Class;

public class Unpublish_page extends Base_Class {

	public Unpublish_page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[normalize-space()='Create new resource'])[1]")
	private WebElement newresource;

	@FindBy(xpath = "(//div[contains(@class,'css-198170r-control')])[1]")
	private WebElement type;

	@FindBy(id = "title")
	private WebElement title;

	@FindBy(xpath = "(//div[contains(@class,'css-198170r-control')])[2]")
	private WebElement topic;

	@FindBy(xpath = "(//div[contains(@class,'css-198170r-control')])[3]")
	private WebElement age;

	@FindBy(xpath = "(//input[@class='form-check-input'])[1]")
	private WebElement upload;

	@FindBy(xpath = "//button[normalize-space()='UPLOAD']")
	private WebElement uploaddocs;

	@FindBy(xpath = "(//span[normalize-space()='View list of current tags'])[1]")
	private WebElement viewlist;

	@FindBy(xpath = "(//label[@for='contentApprover_popup10'])[1]")
	private WebElement sugar;

	@FindBy(xpath = "(//span[@class='acces-btn btn-violet onkeyup'])[1]")
	private WebElement addtags;

	@FindBy(xpath = "(//input[@id='tags'])[1]")
	private WebElement tags;

	@FindBy(xpath = "(//label[normalize-space()='All Trusts within Amity-2'])[1]")
	private WebElement alltrust;

	@FindBy(xpath = "(//div[contains(@class,'css-198170r-control')])[4]")
	private WebElement approver;

	@FindBy(xpath = "(//button[normalize-space()='SUBMIT FOR APPROVAL'])[1]")
	private WebElement submit;

	@FindBy(xpath = "(//label[normalize-space()='Resource title'])[1]")
	private WebElement javascript;

	@FindBy(xpath = "(//label[normalize-space()='Resource type'])[1]")
	private WebElement javaexe;

	@FindBy(xpath = "(//label[normalize-space()='Both document and content'])[1]")
	private WebElement javaexecut;

	@FindBy(xpath = "(//label[normalize-space()='Add tags'])[1]")
	private WebElement javatagss;

	@FindBy(xpath = "(//div[@class='app-sub-header multi-btn'])[1]")
	private WebElement appjavas;

	@FindBy(xpath = "//a[@id='my-account-button']")
	private WebElement account;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement logoutt;

	@FindBy(xpath = "//a[@href='/']//*[name()='svg']")
	private WebElement javanews;

	public WebElement getNewresource() {
		return newresource;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getTopic() {
		return topic;
	}

	public WebElement getAge() {
		return age;
	}

	public WebElement getUpload() {
		return upload;
	}

	public WebElement getUploaddocs() {
		return uploaddocs;
	}

	public WebElement getViewlist() {
		return viewlist;
	}

	public WebElement getSugar() {
		return sugar;
	}

	public WebElement getAddtags() {
		return addtags;
	}

	public WebElement getTags() {
		return tags;
	}

	public WebElement getAlltrust() {
		return alltrust;
	}

	public WebElement getApprover() {
		return approver;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getJavascript() {
		return javascript;
	}

	public WebElement getJavaexe() {
		return javaexe;
	}

	public WebElement getJavaexecut() {
		return javaexecut;
	}

	public WebElement getJavatagss() {
		return javatagss;
	}

	public WebElement getAppjavas() {
		return appjavas;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getLogoutt() {
		return logoutt;
	}

	public WebElement getJavanews() {
		return javanews;
	}

}
