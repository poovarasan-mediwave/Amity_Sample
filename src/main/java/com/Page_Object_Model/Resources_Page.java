package com.Page_Object_Model;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Lib_Globals.Base_Class;

public class Resources_Page extends Base_Class {

	public Resources_Page() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement emailAddress;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;

	@FindBy(xpath = "//a[@href='/notification-center']")
	private WebElement myNotification_Link;

	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	private WebElement clickFirst_One;

	@FindBy(xpath = "//span[@class='acces-btn btn-violet onkeyup']")
	private WebElement publish_button;

	@FindBy(xpath = "//button[@class='btn btn-secondary']")
	private WebElement publish_Ok_button;

	@FindBy(xpath = "//h1[normalize-space()='RESOURCES']")
	private WebElement verify_Resource_Page;

	@FindBy(xpath = "//a[@href='/resource/create']")
	private WebElement create_New_Resources;

	@FindBy(xpath = "//div[@id='react-select-2-placeholder']/parent::div/parent::div")
	private WebElement resources_Type;

	@FindBy(xpath = "//div[@id='react-select-2-option-1']")
	private WebElement articlesTag;

	@FindBy(xpath = "//div[@id='react-select-2-option-8']")
	private WebElement videoTag;

	@FindBy(id = "title")
	private WebElement resource_Title;

	@FindBy(xpath = "//div[@id='react-select-3-placeholder']/parent::div/parent::div")
	private WebElement topics;

	@FindBy(xpath = "//div[@id='react-select-3-option-1']")
	private WebElement cancerTag;

	@FindBy(xpath = "//div[@id='react-select-3-option-2']")
	private WebElement diabetesTag;

	@FindBy(xpath = "//div[@id='react-select-4-placeholder']/parent::div/parent::div")
	private WebElement age_Group;

	@FindBy(xpath = "//div[@id='react-select-4-option-0']")
	private WebElement adulttag;

	@FindBy(xpath = "//div[@class='tox tox-tinymce']/div/div[2]/div/iframe")
	private WebElement aticle_Content;

	@FindBy(xpath = "//button[@aria-label='Insert/edit media']")
	private WebElement addVideo_button;

	@FindBy(xpath = "//input[@type='url']")
	private WebElement addSource_link;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement save;

	@FindBy(xpath = "//input[@id='tags']")
	private WebElement addTags;

	@FindBy(xpath = "//span[normalize-space()='View list of current tags']")
	private WebElement listof_Tags;

	@FindBy(xpath = "//input[@id='contentApprover_popup5']/parent::div")
	private WebElement clickCurrent_List_Tags;

	@FindBy(xpath = "//span[@class='acces-btn btn-violet onkeyup']")
	private WebElement addTags_button;

	@FindBy(xpath = "(//label[normalize-space()='All Trusts within Sathya'])[1]")
	private WebElement publish_ratio_button;

	@FindBy(xpath = "//div[@id='react-select-5-placeholder']/parent::div/parent::div")
	private WebElement SelectApprovers;

	@FindBy(xpath = "//div[@id='react-select-5-option-0']")
	private WebElement approverselectTag;

	@FindBy(xpath = "//button[@class='btn btn-violet']")
	private WebElement submitfor_Approval_button;

	@FindBy(xpath = "//div[@class='profile-div']")
	private WebElement scroll_Up;

	@FindBy(xpath = "//div[@class='profile-dropdown']")
	private WebElement profile_Option;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement logout_Option;

	@FindBy(xpath = "//div//span[text()='FLAG FOR REVIEW']")
	private WebElement flagforReview;

	@FindBy(id = "comment")
	private WebElement note;

	@FindBy(xpath = "//span[normalize-space()='SUBMIT']")
	private WebElement submit;

	@FindBy(xpath = "//div[@class='app-sub-header multi-btn']")
	private WebElement scroll;

	@FindBy(xpath = "//div[@class='header-img']//*[name()='svg']")
	private WebElement scroolUp;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement approve_button;

	@FindBy(xpath = "//textarea[@class='form-control has-success has-feedback']")
	private WebElement video_Caption;

	@FindBy(xpath = "//label[normalize-space()='Add video URL']")
	private WebElement video_Soure;

	@FindBy(xpath = "//button[@aria-label='Insert/edit image']")
	private WebElement imageclk;

	@FindBy(xpath = "//div[@class='tox-dialog__body-nav-item tox-tab']")
	private WebElement upload_Option;

	@FindBy(xpath = "//button[normalize-space()='Browse for an image']")
	private WebElement browes_Option;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement save_button;

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getMyNotification_Link() {
		return myNotification_Link;
	}

	public WebElement getClickFirst_One() {
		return clickFirst_One;
	}

	public WebElement getPublish_button() {
		return publish_button;
	}

	public WebElement getPublish_Ok_button() {
		return publish_Ok_button;
	}

	public WebElement getVerify_Resource_Page() {
		return verify_Resource_Page;
	}

	public WebElement getCreate_New_Resources() {
		return create_New_Resources;
	}

	public WebElement getResources_Type() {
		return resources_Type;
	}

	public WebElement getResource_Title() {
		return resource_Title;
	}

	public WebElement getTopics() {
		return topics;
	}

	public WebElement getAge_Group() {
		return age_Group;
	}

	public WebElement getAticle_Content() {
		return aticle_Content;
	}

	public WebElement getAddVideo_button() {
		return addVideo_button;
	}

	public WebElement getAddSource_link() {
		return addSource_link;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getAddTags() {
		return addTags;
	}

	public WebElement getListof_Tags() {
		return listof_Tags;
	}

	public WebElement getClickCurrent_List_Tags() {
		return clickCurrent_List_Tags;
	}

	public WebElement getAddTags_button() {
		return addTags_button;
	}

	public WebElement getPublish_ratio_button() {
		return publish_ratio_button;
	}

	public WebElement getSelectApprovers() {
		return SelectApprovers;
	}

	public WebElement getSubmitfor_Approval_button() {
		return submitfor_Approval_button;
	}

	public WebElement getScroll_Up() {
		return scroll_Up;
	}

	public WebElement getProfile_Option() {
		return profile_Option;
	}

	public WebElement getLogout_Option() {
		return logout_Option;
	}

	public WebElement getFlagforReview() {
		return flagforReview;
	}

	public WebElement getNote() {
		return note;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getScroll() {
		return scroll;
	}

	public WebElement getScroolUp() {
		return scroolUp;
	}

	public WebElement getApprove_button() {
		return approve_button;
	}

	public WebElement getVideo_Caption() {
		return video_Caption;
	}

	public WebElement getVideo_Soure() {
		return video_Soure;
	}

	public WebElement getImageclk() {
		return imageclk;
	}

	public WebElement getUpload_Option() {
		return upload_Option;
	}

	public WebElement getBrowes_Option() {
		return browes_Option;
	}

	public WebElement getSave_button() {
		return save_button;
	}

	public WebElement getArticlesTag() {
		return articlesTag;
	}

	public WebElement getCancerTag() {
		return cancerTag;
	}

	public WebElement getAdulttag() {
		return adulttag;
	}

	public WebElement getApproverselectTag() {
		return approverselectTag;
	}

	public WebElement getVideoTag() {
		return videoTag;
	}

	public WebElement getDiabetesTag() {
		return diabetesTag;
	}

	public void verifyResource() {

		String ref = "RESOURCES";
		String pagecontent = gettText(getVerify_Resource_Page());
		if (ref.contains(pagecontent)) {
			System.out.println("User is on Resources page");
		} else {
			System.out.println("User not in resources page");
		}

//		Assert.assertEquals("vrerify the Resources page ", r, gettText(getVerify_Resource_Page()));

	}

	public void robotClass() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
