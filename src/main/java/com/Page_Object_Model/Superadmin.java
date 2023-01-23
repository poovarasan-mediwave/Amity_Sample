package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Global.Base_Class;

public class Superadmin extends Base_Class {

	public Superadmin() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement Emailaddress;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitbutton;

	@FindBy(xpath = "//button[text()='Add System Admin']")
	private WebElement AddSystemadminbutton;

	@FindBy(xpath = "//input[@id='name']")
	private WebElement systemadminnamefield;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement systemadminemail;

	@FindBy(xpath = "//div[@aria-label='content Section']//form//button")
	private WebElement createsystemadminbutton;

	@FindBy(xpath = "//button[text()='Add Trust']")
	private WebElement addtrustbutton;

	@FindBy(xpath = "//input[@id='name']")
	private WebElement trustname;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement trustemailaddress;

	@FindBy(xpath = "//button[text()='CREATE TRUST']")
	private WebElement createtrustbutton;

	@FindBy(xpath = "//a[normalize-space()='Create new resource']")
	private WebElement createnewresourcemenu;

	@FindBy(xpath = "//div[@class=' css-qc6sy-singleValue']")
	private WebElement selectcontenttype;

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

	@FindBy(xpath = "//div[@class='profile-div']")
	private WebElement scroll_up;

	@FindBy(xpath = "//div[@class='profile-dropdown']")
	private WebElement profile;

	@FindBy(xpath = "//a[@class='dropdown-item'][2]")
	private WebElement logout;

	public WebElement getEmailaddress() {
		return Emailaddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public WebElement getAddSystemadminbutton() {
		return AddSystemadminbutton;
	}

	public WebElement getSystemadminnamefield() {
		return systemadminnamefield;
	}

	public WebElement getSystemadminemail() {
		return systemadminemail;
	}

	public WebElement getCreatesystemadminbutton() {
		return createsystemadminbutton;
	}

	public WebElement getAddtrustbutton() {
		return addtrustbutton;
	}

	public WebElement getTrustname() {
		return trustname;
	}

	public WebElement getTrustemailaddress() {
		return trustemailaddress;
	}

	public WebElement getCreatetrustbutton() {
		return createtrustbutton;
	}

	public WebElement getCreatenewresourcemenu() {
		return createnewresourcemenu;
	}

	public WebElement getSelectcontenttype() {
		return selectcontenttype;
	}

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

	public WebElement getOkaybutton() {
		return okaybutton;
	}

	public WebElement getUnpublish() {
		return unpublish;
	}

	public WebElement getJavetwoo() {
		return javetwoo;
	}

	public WebElement getJavathree() {
		return javathree;
	}

	public WebElement getScroll_up() {
		return scroll_up;
	}

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLogout() {
		return logout;
	}

}
