package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Global.Base_Class;

public class cancel_page extends Base_Class {

	public cancel_page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[normalize-space()='My notifications']")
	private WebElement notifications;

	@FindBy(xpath = "(//td[@class='blue-link onkeyup'])[8]")
	private WebElement autotest;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement approve;

	@FindBy(xpath = "//span[@class='acces-btn btn-violet onkeyup']")
	private WebElement cancelapp;

	@FindBy(xpath = "//button[normalize-space()='Okay']")
	private WebElement okbutton;

	@FindBy(xpath = "//div[@class='app-sub-header multi-btn']")
	private WebElement javascrpit;

	@FindBy(xpath = "(//td[contains(text(),'review')])[5]")
	private WebElement javascr;

	@FindBy(xpath = "//div[@class='col-12 col-md-6 secondary-text fw-bold cursor-pointer onkeyup']")
	private WebElement javasc;

	@FindBy(xpath = "//a[@id='my-account-button']")
	private WebElement accou;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement logo;

	@FindBy(xpath = "//div[@class='header-img']//*[name()='svg']")
	private WebElement jascript;

	public WebElement getNotifications() {
		return notifications;
	}

	public WebElement getApprove() {
		return approve;
	}

	public WebElement getAutotest() {
		return autotest;
	}

	public WebElement getCancelapp() {
		return cancelapp;
	}

	public WebElement getOkbutton() {
		return okbutton;
	}

	public WebElement getJavascrpit() {
		return javascrpit;
	}

	public WebElement getJavascr() {
		return javascr;
	}

	public WebElement getJavasc() {
		return javasc;
	}

	public WebElement getAccou() {
		return accou;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getJascript() {
		return jascript;
	}

}
