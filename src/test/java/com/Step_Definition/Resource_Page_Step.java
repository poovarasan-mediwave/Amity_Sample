package com.Step_Definition;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Single_Ton.Single_Ton_Design;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Resource_Page_Step extends Base_Class {

	public static Single_Ton_Design si = new Single_Ton_Design();

	@When("user enter the {string} and {string}")
	public void user_enter_the_and(String string, String string2) throws IOException {

		String emailaddress = FileReaderManager.getInstanceFRM().getInstanceCR().getCreatermail();
		enterText(si.getResources_Page().getEmailAddress(), emailaddress);

		String getpassword = FileReaderManager.getInstanceFRM().getInstanceCR().getCreatorPassword();
		enterText(si.getResources_Page().getPassword(), getpassword);
	}

	@When("user click the Login button in creator crendentials")
	public void user_click_the_Login_button_in_creator_crendentials() throws Throwable {

		btnClick(si.getResources_Page().getLogin());
		System.out.println("Content creator login successfully");
		sleep(2000);
	}

	@Then("user should navigate to resource page and user click the create new resource option")
	public void user_should_navigate_to_resource_page_and_user_click_the_create_new_resource_option() throws Throwable {

		si.getResources_Page().verifyResource();
		wait(5);
		btnClick(si.getResources_Page().getCreate_New_Resources());
		sleep(5000);
	}

	@Then("user should select the article in resource type")
	public void user_should_select_the_article_in_resource_type() throws Throwable {
		btnClick(si.getResources_Page().getResources_Type());
		sleep(2000);
		btnClick(si.getResources_Page().getArticlesTag());
		sleep(2000);
	}

	@Then("user enter the resource title and then user should select the topic")
	public void user_enter_the_resource_title_and_then_user_should_select_the_topic() throws Throwable {
		String resource_title = FileReaderManager.getInstanceFRM().getInstanceCR().getResource_title();
		enterText(si.getResources_Page().getResource_Title(), resource_title);
		jsScrollDownElement(si.getResources_Page().getTopics());
		sleep(3000);
		btnClick(si.getResources_Page().getTopics());
		sleep(2000);
		btnClick(si.getResources_Page().getCancerTag());
		sleep(3000);
	}

	@Then("user should select the ageGroup")
	public void user_should_select_the_ageGroup() throws Throwable {
		btnClick(si.getResources_Page().getAge_Group());
		sleep(2000);
		btnClick(si.getResources_Page().getAdulttag());
		sleep(3000);
	}

	@Then("user add the content link and then click the save button")
	public void user_add_the_content_link_and_then_click_the_save_button() throws Throwable {
		jsScrollDownElement(si.getResources_Page().getAddVideo_button());
		sleep(2000);
		btnClick(si.getResources_Page().getAddVideo_button());
		sleep(2000);
		btnClick(si.getResources_Page().getAddSource_link());
		sleep(2000);
		String source_Link = FileReaderManager.getInstanceFRM().getInstanceCR().getSource_Link();
		enterText(si.getResources_Page().getAddSource_link(), source_Link);
		wait(10);
		btnClick(si.getResources_Page().getSave());
		sleep(3000);
	}

	@Then("user enter tags and then click the list of current tags")
	public void user_enter_tags_and_then_click_the_list_of_current_tags() throws Throwable {
		String tags = FileReaderManager.getInstanceFRM().getInstanceCR().getTags();
		enterText(si.getResources_Page().getAddTags(), tags);
		sleep(2000);
		si.getResources_Page().robotClass();
		wait(10);
		jsScrollDownElement(si.getResources_Page().getListof_Tags());
		sleep(2000);
		btnClick(si.getResources_Page().getListof_Tags());
		sleep(3000);
		btnClick(si.getResources_Page().getClickCurrent_List_Tags());
		wait(10);
		btnClick(si.getResources_Page().getAddTags_button());
		sleep(5000);
	}

	@Then("user click the publisher option")
	public void user_click_the_publisher_option() throws Throwable {
		jsScrollDownElement(si.getResources_Page().getPublish_ratio_button());
		wait(10);
		btnClick(si.getResources_Page().getPublish_ratio_button());
		sleep(2000);
	}

	@Then("user should select the approvers list and then click the submit for approval button")
	public void user_should_select_the_approvers_list_and_then_click_the_submit_for_approval_button() throws Throwable {
		btnClick(si.getResources_Page().getSelectApprovers());
		wait(10);
		si.getResources_Page().robotClass();
		sleep(3000);
		btnClick(si.getResources_Page().getSubmitfor_Approval_button());
		wait(10);
	}

	@Then("user take screenshot and then click the profile option")
	public void user_take_screenshot_and_then_click_the_profile_option() throws Throwable {
		jsScrollUpElement(si.getResources_Page().getScroll_Up());
		wait(5);
		screenShot("Resources create Successfully");
		sleep(7000);
		btnClick(si.getResources_Page().getProfile_Option());
	}

	@Then("user click the logout option in creator crendentials")
	public void user_click_the_logout_option_in_creator_crendentials() throws Throwable {

		sleep(2000);
		btnClick(si.getResources_Page().getLogout_Option());
		sleep(4000);
	}

	@Then("user should enters the ApprovaerEmail {string} and ApproverPassword{string}")
	public void user_should_enters_the_ApprovaerEmail_and_ApproverPassword(String string, String string2)
			throws Throwable {

		String emailaddress = FileReaderManager.getInstanceFRM().getInstanceCR().getApprovermail();
		enterText(si.getResources_Page().getEmailAddress(), emailaddress);
		String getpassword = FileReaderManager.getInstanceFRM().getInstanceCR().getApproverPass();
		enterText(si.getResources_Page().getPassword(), getpassword);
	}

	@Then("user click the Login button and then click the my Notification option")
	public void user_click_the_Login_button_and_then_click_the_my_Notification_option() throws Throwable {

		btnClick(si.getResources_Page().getLogin());
		sleep(2000);
		btnClick(si.getResources_Page().getMyNotification_Link());
		sleep(4000);
	}

	@Then("user click the newly added resources name")
	public void user_click_the_newly_added_resources_name() throws Throwable {

		btnClick(si.getResources_Page().getClickFirst_One());
		sleep(2000);
	}

	@Then("user click the flag for review button and then enter notes after click the submit button")
	public void user_click_the_flag_for_review_button_and_then_enter_notes_after_click_the_submit_button()
			throws Throwable {

		jsScrollDownElement(si.getResources_Page().getScroll());
		sleep(3000);
		btnClick(si.getResources_Page().getFlagforReview());
		sleep(2000);
		String notes = FileReaderManager.getInstanceFRM().getInstanceCR().getNotes();
		enterText(si.getResources_Page().getNote(), notes);
		wait(10);
		btnClick(si.getResources_Page().getSubmit());
		wait(5);
		jsScrollDownElement(si.getResources_Page().getScroll_Up());
		wait(5);
	}

	@Then("user should take screenshot and then click the profile option")
	public void user_should_take_screenshot_and_then_click_the_profile_option() throws Throwable {

		screenShot("Approver Error message");
		sleep(6000);
		btnClick(si.getResources_Page().getProfile_Option());
		wait(10);
	}

	@Then("user click the logout option in approver credentials")
	public void user_click_the_logout_option_in_approver_credentials() throws Throwable {
		btnClick(si.getResources_Page().getLogout_Option());
		sleep(2000);
	}

	@When("user enter the {string} and {string} and then user click the Login button")
	public void user_enter_the_and_and_then_user_click_the_Login_button(String string, String string2)
			throws Throwable {
		String emailaddress = FileReaderManager.getInstanceFRM().getInstanceCR().getCreatermail();
		enterText(si.getResources_Page().getEmailAddress(), emailaddress);
		String getpassword = FileReaderManager.getInstanceFRM().getInstanceCR().getCreatorPassword();
		enterText(si.getResources_Page().getPassword(), getpassword);
		wait(10);
		btnClick(si.getResources_Page().getLogin());
		sleep(2000);
	}

	@When("user click the my notification button in creator login and then user take screenshot")
	public void user_click_the_my_notification_button_in_creator_login_and_then_user_take_screenshot()
			throws Throwable {
		btnClick(si.getResources_Page().getMyNotification_Link());
		wait(5);
		screenshotPage("Creator My Notification Page");
	}

	// Approver Approve Message
	@Then("user should  select the video in Resources Type")
	public void user_should_select_the_video_in_Resources_Type() throws Throwable {
		btnClick(si.getResources_Page().getResources_Type());
		sleep(5000);
		btnClick(si.getResources_Page().getVideoTag());
		sleep(2000);
	}

	@Then("user should  enter the resource title and then user should select the topic")
	public void user_should_enter_the_resource_title_and_then_user_should_select_the_topic() throws Throwable {
		String resource_title2 = FileReaderManager.getInstanceFRM().getInstanceCR().getResource_title2();
		enterText(si.getResources_Page().getResource_Title(), resource_title2);
		jsScrollDownElement(si.getResources_Page().getTopics());
		sleep(2000);
		btnClick(si.getResources_Page().getTopics());
		sleep(2000);
		btnClick(si.getResources_Page().getDiabetesTag());
		sleep(2000);
	}

	@Then("user select the ageGroup")
	public void user_select_the_ageGroup() throws Throwable {
		btnClick(si.getResources_Page().getAge_Group());
		sleep(2000);
		btnClick(si.getResources_Page().getAdulttag());
		sleep(2000);
	}

	@Then("user enter the video caption {string} and then user click the video source")
	public void user_enter_the_video_caption_and_then_user_click_the_video_source(String string) throws Throwable {
		String video_Caption = FileReaderManager.getInstanceFRM().getInstanceCR().getVideo_Caption();
		enterText(si.getResources_Page().getVideo_Caption(), video_Caption);
		wait(5);
		jsScrollDownElement(si.getResources_Page().getVideo_Soure());
		sleep(3000);
		btnClick(si.getResources_Page().getVideo_Soure());
		sleep(4000);
	}

	@Then("user add the  video content link in creator page and then click the save button")
	public void user_add_the_video_content_link_in_creator_page_and_then_click_the_save_button() throws Throwable {

		jsScrollDownElement(si.getResources_Page().getAddVideo_button());
		sleep(2000);
		btnClick(si.getResources_Page().getAddVideo_button());
		sleep(2000);
		btnClick(si.getResources_Page().getAddSource_link());
		sleep(2000);
		String source_Link = FileReaderManager.getInstanceFRM().getInstanceCR().getSource_Link();
		enterText(si.getResources_Page().getAddSource_link(), source_Link);
		wait(10);
		btnClick(si.getResources_Page().getSave());
		sleep(3000);
	}

	@Then("user enter tags and then click the list of current tags in that click add tag button")
	public void user_enter_tags_and_then_click_the_list_of_current_tags_in_that_click_add_tag_button()
			throws Throwable {
		String tags = FileReaderManager.getInstanceFRM().getInstanceCR().getTags();
		enterText(si.getResources_Page().getAddTags(), tags);
		wait(10);
		si.getResources_Page().robotClass();
		jsScrollDownElement(si.getResources_Page().getListof_Tags());
		sleep(2000);
		btnClick(si.getResources_Page().getListof_Tags());
		sleep(3000);
		btnClick(si.getResources_Page().getClickCurrent_List_Tags());
		wait(10);
		btnClick(si.getResources_Page().getAddTags_button());
		sleep(5000);
	}

	@Then("user should click the publisher option")
	public void user_should_click_the_publisher_option() throws Throwable {
		jsScrollDownElement(si.getResources_Page().getPublish_ratio_button());
		wait(10);
		btnClick(si.getResources_Page().getPublish_ratio_button());
		sleep(3000);
	}

	@Then("user select the approvers list and then click the submit for approval button")
	public void user_select_the_approvers_list_and_then_click_the_submit_for_approval_button() throws Throwable {
		btnClick(si.getResources_Page().getSelectApprovers());
		sleep(1000);
		si.getResources_Page().robotClass();
		sleep(2000);
		btnClick(si.getResources_Page().getSubmitfor_Approval_button());
		wait(5);
	}

	@Then("user take screenshot and then click profile option")
	public void user_take_screenshot_and_then_click_profile_option() throws Throwable {
		jsScrollUpElement(si.getResources_Page().getScroll_Up());
		wait(5);
		screenShot("Resources create Successfully");
		sleep(7000);
		btnClick(si.getResources_Page().getProfile_Option());
		wait(10);
	}

	@Then("user click the logout option in creator credentials")
	public void user_click_the_logout_option_in_creator_credentials() throws Throwable {
		btnClick(si.getResources_Page().getLogout_Option());
		sleep(4000);
	}

	@Then("user should enter the ApproverEmailAddress {string} and ApproverPassword{string} in approvers credentials")
	public void user_should_enter_the_ApproverEmailAddress_and_ApproverPassword_in_approvers_credentials(String string,
			String string2) throws Throwable {
		String emailaddress = FileReaderManager.getInstanceFRM().getInstanceCR().getApprovermail();
		enterText(si.getResources_Page().getEmailAddress(), emailaddress);
		String getpassword = FileReaderManager.getInstanceFRM().getInstanceCR().getApproverPass();
		enterText(si.getResources_Page().getPassword(), getpassword);
		wait(10);
	}

	@Then("user click the Login button in approver credentials and user click the Mynotification")
	public void user_click_the_Login_button_in_approver_credentials_and_user_click_the_Mynotification()
			throws Throwable {
		btnClick(si.getResources_Page().getLogin());
		sleep(2000);
		btnClick(si.getResources_Page().getMyNotification_Link());
		sleep(5000);
	}

	@Then("user click the newly added resources and then click the approve button")
	public void user_click_the_newly_added_resources_and_then_click_the_approve_button() throws Throwable {
		btnClick(si.getResources_Page().getClickFirst_One());
		jsScrollDownElement(si.getResources_Page().getApprove_button());
		sleep(2000);
		btnClick(si.getResources_Page().getApprove_button());
		wait(5);
		jsScrollUpElement(si.getSuper_Admin().getScroll_up());
		wait(10);
		screenShot("Approver Approve meassage");
		sleep(6000);
	}

	@Then("users click the profile and users click logout button in approver credential")
	public void users_click_the_profile_and_users_click_logout_button_in_approver_credentials() throws Throwable {
		btnClick(si.getResources_Page().getProfile_Option());
		wait(10);
		btnClick(si.getResources_Page().getLogout_Option());
		sleep(4000);
	}

	@Then("user should enters the creator credential {string} and  {string} and login the creator page")
	public void user_should_enters_the_creator_credential_and_and_login_the_creator_page(String string, String string2)
			throws Throwable {
		String emailaddress = FileReaderManager.getInstanceFRM().getInstanceCR().getCreatermail();
		enterText(si.getResources_Page().getEmailAddress(), emailaddress);
		String getpassword = FileReaderManager.getInstanceFRM().getInstanceCR().getCreatorPassword();
		enterText(si.getResources_Page().getPassword(), getpassword);
		btnClick(si.getResources_Page().getLogin());
		sleep(2000);
	}

	@Then("user click the my Notification by creater in that user click the newly added resource")
	public void user_click_the_my_Notification_by_creater_in_that_user_click_the_newly_added_resource()
			throws Throwable {
		btnClick(si.getResources_Page().getMyNotification_Link());
		sleep(5000);
		btnClick(si.getResources_Page().getClickFirst_One());
		sleep(5000);
	}

	@Then("user click the publish button in creator credentials")
	public void user_click_the_publish_button_in_creator_credentials() throws Throwable {
		btnClick(si.getResources_Page().getPublish_button());
		sleep(3000);
		screenShot("Creater Publish the resource");
		btnClick(si.getResources_Page().getPublish_Ok_button());
		sleep(2000);
	}

	@Then("user cick newest one and also click unpublish")
	public void user_cick_newest_one_and_also_click_unpublish() throws Throwable {
		btnClick(si.getResources_Page().getClickFirst_One());
		sleep(3000);
		btnClick(si.getPublish_page().getUnpublish());
		sleep(3000);
		btnClick(si.getResources_Page().getPublish_Ok_button());
		sleep(7000);
	}

	@Then("user logout the creator credentials")
	public void user_logout_the_creator_credentials() throws Throwable {
		btnClick(si.getResources_Page().getProfile_Option());
		wait(5);
		btnClick(si.getResources_Page().getLogout_Option());
		sleep(4000);
	}

	@Then("user enters the TrustEmail {string} and TrustPassword {string} and user login the trust admin")
	public void user_enters_the_TrustEmail_and_TrustPassword_and_user_login_the_trust_admin(String string,
			String string2) throws Throwable {
		String trustmail = FileReaderManager.getInstanceFRM().getInstanceCR().getTrustmail();
		enterText(si.getResources_Page().getEmailAddress(), trustmail);
		String trustPassword = FileReaderManager.getInstanceFRM().getInstanceCR().getTrustPassword();
		enterText(si.getResources_Page().getPassword(), trustPassword);
		sleep(3000);
		btnClick(si.getResources_Page().getLogin());
		sleep(2000);
	}

	@Then("user click the Mynotification option and user search the already create contentor name and click the newest one")
	public void user_click_the_Mynotification_option_and_user_search_the_already_create_contentor_name_and_click_the_newest_one()
			throws Throwable {
		btnClick(si.getResources_Page().getMyNotification_Link());
		sleep(5000);
		btnClick(si.getResources_Page().getClickFirst_One());
		sleep(2000);
	}

	@Then("user take screenshot for present creator")
	public void user_take_screenshot_for_present_creator() throws Throwable {
		screenshotPage("Published Resources");
	}

	//// Approver Approve Message insert image

	@Then("user select the video in Resources Type")
	public void user_select_the_video_in_Resources_Type() throws Throwable {
		btnClick(si.getResources_Page().getResources_Type());
		sleep(4000);
		btnClick(si.getResources_Page().getVideoTag());
		sleep(2000);
	}

	@Then("user should enter the resource title and user should select the Topic")
	public void user_should_enter_the_resource_title_and_user_should_select_the_Topic() throws Throwable {
		String resource_title3 = FileReaderManager.getInstanceFRM().getInstanceCR().getResource_title3();
		enterText(si.getResources_Page().getResource_Title(), resource_title3);
		jsScrollDownElement(si.getResources_Page().getTopics());
		wait(10);
		btnClick(si.getResources_Page().getTopics());
		sleep(2000);
		btnClick(si.getResources_Page().getCancerTag());
		sleep(2000);
	}

	@Then("user select ageGroup")
	public void user_select_ageGroup() throws Throwable {
		btnClick(si.getResources_Page().getAge_Group());
		sleep(2000);
		btnClick(si.getResources_Page().getAdulttag());
		sleep(2000);
	}

	@Then("user enter video caption in image {string} and user click the video source button")
	public void user_enter_video_caption_in_image_and_user_click_the_video_source_button(String string)
			throws Throwable {
		String video_Caption = FileReaderManager.getInstanceFRM().getInstanceCR().getVideo_Caption();
		enterText(si.getResources_Page().getVideo_Caption(), video_Caption);
		wait(5);
		jsScrollDownElement(si.getResources_Page().getVideo_Soure());
		sleep(2000);
		btnClick(si.getResources_Page().getVideo_Soure());
		sleep(4000);
	}

	@Then("user insert the image page in video content option")
	public void user_insert_the_image_page_in_video_content_option() throws Throwable {
		btnClick(si.getResources_Page().getImageclk());
		sleep(2000);
		btnClick(si.getResources_Page().getUpload_Option());
		sleep(2000);
		btnClick(si.getResources_Page().getBrowes_Option());
		sleep(2000);
		StringSelection str = new StringSelection(
				"C:\\Users\\Mediwave Digital\\Pictures\\Screenshots\\Screenshot (43).png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot rb = new Robot();
		rb.delay(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		sleep(2000);
		btnClick(si.getResources_Page().getSave_button());
		sleep(1000);
	}

	@Then("user enter the tags")
	public void user_enter_the_tags() throws Throwable {
		jsScrollDownElement(si.getResources_Page().getAddTags());
		wait(20);
		String tags = FileReaderManager.getInstanceFRM().getInstanceCR().getTags();
		enterText(si.getResources_Page().getAddTags(), tags);
		sleep(2000);
		si.getResources_Page().robotClass();
		wait(10);
		jsScrollDownElement(si.getResources_Page().getListof_Tags());
		sleep(2000);
		btnClick(si.getResources_Page().getListof_Tags());
		sleep(3000);
		btnClick(si.getResources_Page().getClickCurrent_List_Tags());
		wait(10);
		btnClick(si.getResources_Page().getAddTags_button());
		sleep(5000);
	}

	@Then("user should click the publisher button")
	public void user_should_click_the_publisher_button() throws Throwable {
		btnClick(si.getResources_Page().getPublish_ratio_button());
		sleep(3000);
	}

	@Then("user should select the approvers and also click the submit for approval button")
	public void user_should_select_the_approvers_and_also_click_the_submit_for_approval_button() throws Throwable {
		btnClick(si.getResources_Page().getSelectApprovers());
		sleep(1000);
		si.getResources_Page().robotClass();
		wait(10);
		btnClick(si.getResources_Page().getSubmitfor_Approval_button());
		wait(5);
	}

	@Then("user click the profile option and then user click the logout button in creator")
	public void user_click_the_profile_option_and_then_user_click_the_logout_button_in_creator() throws Throwable {
		jsScrollUpElement(si.getResources_Page().getScroll_Up());
		wait(5);
		screenShot("Resources create Successfully");
		sleep(7000);
		btnClick(si.getResources_Page().getProfile_Option());
		wait(10);
		btnClick(si.getResources_Page().getLogout_Option());
		sleep(4000);
	}

	@Then("user should enter the {string} and {string} and user click the Login button in approver credentials")
	public void user_should_enter_the_and_and_user_click_the_Login_button_in_approver_credentials(String string,
			String string2) throws Throwable {
		String emailaddress = FileReaderManager.getInstanceFRM().getInstanceCR().getApprovermail();
		enterText(si.getResources_Page().getEmailAddress(), emailaddress);
		String getpassword = FileReaderManager.getInstanceFRM().getInstanceCR().getApproverPass();
		enterText(si.getResources_Page().getPassword(), getpassword);
		btnClick(si.getResources_Page().getLogin());
		sleep(2000);
	}

	@Then("user should click the Mynotification option and user click the newly added resources")
	public void user_should_click_the_Mynotification_option_and_user_click_the_newly_added_resources()
			throws Throwable {
		btnClick(si.getResources_Page().getMyNotification_Link());
		sleep(5000);
		btnClick(si.getResources_Page().getClickFirst_One());
		jsScrollDownElement(si.getResources_Page().getApprove_button());
		sleep(3000);
	}

	@Then("users click the approve button")
	public void user_click_the_approve_button() throws Throwable {
		btnClick(si.getResources_Page().getApprove_button());
		wait(5);
		jsScrollDownElement(si.getResources_Page().getScroll_Up());
		screenShot("Approver Approve meassage in image");
		sleep(7000);
	}

	@Then("users click the profile and users click logout button approver credential")
	public void users_click_the_profile_and_users_click_logout_button_approver_credential() throws Throwable {

		btnClick(si.getResources_Page().getProfile_Option());
		wait(10);
		btnClick(si.getResources_Page().getLogout_Option());
		sleep(4000);
	}

	@Then("user should enters the {string} and  {string} and login the creator page")
	public void user_should_enters_the_and_and_login_the_creator_page(String string, String string2) throws Throwable {
		String emailaddress = FileReaderManager.getInstanceFRM().getInstanceCR().getCreatermail();
		enterText(si.getResources_Page().getEmailAddress(), emailaddress);
		String getpassword = FileReaderManager.getInstanceFRM().getInstanceCR().getCreatorPassword();
		enterText(si.getResources_Page().getPassword(), getpassword);
		btnClick(si.getResources_Page().getLogin());
		sleep(2000);
	}

	@Then("user click the my Notification by creater and user click the newly added resource")
	public void user_click_the_my_Notification_by_creater_and_user_click_the_newly_added_resource() throws Throwable {
		btnClick(si.getResources_Page().getMyNotification_Link());
		sleep(5000);
		btnClick(si.getResources_Page().getClickFirst_One());
		sleep(3000);
	}

	@Then("user click the publish button and user logout the creator credentials")
	public void user_click_the_publish_button_and_user_logout_the_creator_credentials() throws Throwable {
		btnClick(si.getResources_Page().getPublish_button());
		sleep(3000);
		screenShot("Creater Publish the resource");
		btnClick(si.getResources_Page().getPublish_Ok_button());
		jsScrollUpElement(si.getResources_Page().getScroll_Up());
		sleep(7000);
		btnClick(si.getResources_Page().getProfile_Option());
		sleep(2000);
		btnClick(si.getResources_Page().getLogout_Option());
		sleep(4000);
	}

	@Then("user enters the {string} and {string} in trust admin and user click login button")
	public void user_enters_the_and_in_trust_admin_and_user_click_login_button(String string, String string2)
			throws Throwable {
		String trustmail = FileReaderManager.getInstanceFRM().getInstanceCR().getTrustmail();
		enterText(si.getResources_Page().getEmailAddress(), trustmail);
		String trustPassword = FileReaderManager.getInstanceFRM().getInstanceCR().getTrustPassword();
		enterText(si.getResources_Page().getPassword(), trustPassword);
		sleep(3000);
		btnClick(si.getResources_Page().getLogin());
		sleep(2000);
	}

	@Then("user should click the Mynotification option and user search the already create contentor name and click the newest one")
	public void user_should_click_the_Mynotification_option_and_user_search_the_already_create_contentor_name_and_click_the_newest_one()
			throws Throwable {

		btnClick(si.getResources_Page().getMyNotification_Link());
		sleep(5000);
		btnClick(si.getResources_Page().getClickFirst_One());
		sleep(2000);
	}

	@Then("user should take screenshot for present creator")
	public void user_should_take_screenshot_for_present_creator() throws Throwable {
		screenshotPage("Published Resources");
	}

	@When("user enter the CUser {string} and CPassword {string}")
	public void user_enter_the_c_user_and_c_password(String string, String string2) throws Throwable {
		String emailaddress = FileReaderManager.getInstanceFRM().getInstanceCR().getCreatermail();
		enterText(si.getResources_Page().getEmailAddress(), emailaddress);

		String getpassword = FileReaderManager.getInstanceFRM().getInstanceCR().getCreatorPassword();
		enterText(si.getResources_Page().getPassword(), getpassword);

	}

	@When("user login creator credentials")
	public void user_login_creator_credentials() throws Throwable {
		btnClick(si.getResources_Page().getLogin());
		System.out.println("Content creator login successfully");
		sleep(2000);
	}

	@Then("user should be on resource page and click the create new resource option")
	public void user_should_be_on_resource_page_and_click_the_create_new_resource_option() throws Throwable {
		si.getResources_Page().verifyResource();
		wait(5);
		btnClick(si.getResources_Page().getCreate_New_Resources());
		sleep(10000);
	}

	@When("user enter CCusername {string} and CCpassword {string}")
	public void user_enter_c_cusername_and_c_cpassword(String string, String string2) throws Throwable {
		String emailaddress = FileReaderManager.getInstanceFRM().getInstanceCR().getCreatermail();
		enterText(si.getResources_Page().getEmailAddress(), emailaddress);

		String getpassword = FileReaderManager.getInstanceFRM().getInstanceCR().getCreatorPassword();
		enterText(si.getResources_Page().getPassword(), getpassword);

	}

	@When("Click login for Content creator credentials")
	public void click_login_for_content_creator_credentials() throws Throwable {
		btnClick(si.getResources_Page().getLogin());
		System.out.println("Content creator login successfully");
		sleep(2000);
	}

	@Then("user navigate resource page and click the create new resource option")
	public void user_navigate_resource_page_and_click_the_create_new_resource_option() throws Throwable {
		si.getResources_Page().verifyResource();
		wait(5);
		btnClick(si.getResources_Page().getCreate_New_Resources());
		sleep(10000);
	}

}
