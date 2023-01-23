package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Global.Base_Class;

public class Publish_page extends Base_Class {
	
	public Publish_page() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='My notifications']")
	private WebElement mynotification;

	@FindBy(xpath = "(//td[@class='blue-link onkeyup'][normalize-space()='Resource automation tested'])[1]")
	private WebElement notifione;

	@FindBy(xpath = "//div[@class='header fw-bold mb-3']")
	private WebElement javaone;

	@FindBy(xpath = "//span[@class='acces-btn btn-violet onkeyup']")
	private WebElement publish;

	@FindBy(xpath = "//button[normalize-space()='Okay']")
	private WebElement okaybutton;

	@FindBy(xpath = "//span[@class='acces-btn btn-violet onkeyup']")
	private WebElement unpublish;

	@FindBy(xpath = "(//td[contains(text(),'publish')])[1]")
	private WebElement javetwoo;

	@FindBy(xpath = "//div[@class='header fw-bold mb-3']")
	private WebElement javathree;

	public WebElement getMynotification() {
		return mynotification;
	}

	public WebElement getNotifione() {
		return notifione;
	}

	public WebElement getJavaone() {
		return javaone;
	}

	public WebElement getPublish() {
		return publish;
	}

	public WebElement getUnpublish() {
		return unpublish;
	}

	public WebElement getOkaybutton() {
		return okaybutton;
	}

	public WebElement getJavetwoo() {
		return javetwoo;
	}

	public WebElement getJavathree() {
		return javathree;
	}

}
