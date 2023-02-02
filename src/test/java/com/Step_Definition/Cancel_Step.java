package com.Step_Definition;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Single_Ton.Single_Ton_Design;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cancel_Step extends Base_Class {

	public static Single_Ton_Design si = new Single_Ton_Design();

	@When("user enter the cretor username {string} and creatorpassword {string}")
	public void user_enter_the_cretor_username_and_creatorpassword(String string, String string2) throws Throwable {

		String emailaddress = FileReaderManager.getInstanceFRM().getInstanceCR().getCreatermail();
		enterText(si.getResources_Page().getEmailAddress(), emailaddress);

		String getpassword = FileReaderManager.getInstanceFRM().getInstanceCR().getCreatorPassword();
		enterText(si.getResources_Page().getPassword(), getpassword);
	}

	@When("user click the Login button in creator user")
	public void user_click_the_login_button_in_creator_user() throws Throwable {
		btnClick(si.getResources_Page().getLogin());
		System.out.println("Content creator login successfully");
		sleep(2000);
	}

	@Then("user navigate to resource page and user click the create new resource option")
	public void user_navigate_to_resource_page_and_user_click_the_create_new_resource_option() throws Throwable {
		si.getResources_Page().verifyResource();
		wait(5);
		btnClick(si.getResources_Page().getCreate_New_Resources());
		sleep(4000);
	}

	@Then("user should select the article in resource type form")
	public void user_should_select_the_article_in_resource_type_form() throws Throwable {
		btnClick(si.getResources_Page().getResources_Type());
		sleep(2000);
		btnClick(si.getResources_Page().getArticlesTag());
		sleep(2000);
	}

	@Then("user enter the resource titles and then user should select the topics")
	public void user_enter_the_resource_titles_and_then_user_should_select_the_topics() throws Throwable {
		sleep(2000);
		String resource_title = FileReaderManager.getInstanceFRM().getInstanceCR().getResource_title();
		enterText(si.getResources_Page().getResource_Title(), resource_title);
		jsScrollDownElement(si.getResources_Page().getTopics());
		sleep(3000);
		btnClick(si.getResources_Page().getTopics());
		sleep(2000);
		btnClick(si.getResources_Page().getCancerTag());
		sleep(3000);
	}

	@Then("user should select ageGroups")
	public void user_should_select_age_groups() throws Throwable {
		btnClick(si.getResources_Page().getAge_Group());
		sleep(2000);
		btnClick(si.getResources_Page().getAdulttag());
		sleep(3000);
	}

	@Then("user add the content links and click the save button")
	public void user_add_the_content_links_and_click_the_save_button() throws Throwable {
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

	@Then("user enter tag and click the list of current tags")
	public void user_enter_tag_and_click_the_list_of_current_tags() throws Throwable {
		String tags = FileReaderManager.getInstanceFRM().getInstanceCR().getTags();
		enterText(si.getResources_Page().getAddTags(), tags);
		sleep(2000);
		si.getResources_Page().robotClass();
		sleep(2000);
		jsScrollDownElement(si.getResources_Page().getListof_Tags());
		sleep(2000);
		btnClick(si.getResources_Page().getListof_Tags());
		sleep(3000);
		btnClick(si.getResources_Page().getClickCurrent_List_Tags());
		wait(10);
		btnClick(si.getResources_Page().getAddTags_button());
		sleep(5000);
	}

	@Then("user click the publishers")
	public void user_click_the_publishers() throws Throwable {
		jsScrollDownElement(si.getResources_Page().getPublish_ratio_button());
		wait(10);
		btnClick(si.getResources_Page().getPublish_ratio_button());
		sleep(2000);
	}

	@Then("user should select the approver list and click the submit for approval button")
	public void user_should_select_the_approver_list_and_click_the_submit_for_approval_button() throws Throwable {
		btnClick(si.getResources_Page().getSelectApprovers());
		sleep(2000);
		si.getResources_Page().robotClass();
		sleep(3000);
		btnClick(si.getResources_Page().getSubmitfor_Approval_button());
		wait(10);
	}

	@Then("user take screenshot and click the profile option")
	public void user_take_screenshot_and_click_the_profile_option() throws Throwable {
		jsScrollUpElement(si.getResources_Page().getScroll_Up());
		wait(5);
		screenShot("Resources create Successfully");
		sleep(7000);
		btnClick(si.getResources_Page().getProfile_Option());
	}

	@Then("user click the logout option in creator")
	public void user_click_the_logout_option_in_creator() throws Throwable {
		sleep(2000);
		btnClick(si.getResources_Page().getLogout_Option());
		sleep(4000);
	}

	@When("user Enter the Email Address in User text box")
	public void user_Enter_the_Email_Address_in_User_text_box() throws Throwable {
		String aemail = FileReaderManager.getInstanceFRM().getInstanceCR().getaemail();
		enterText(si.getTrust_Admin().getEmail(), aemail);
	}

	@When("user Enter the Password in password text box")
	public void user_Enter_the_Password_in_password_text_box() throws Throwable {
		String apass = FileReaderManager.getInstanceFRM().getInstanceCR().getapass();
		enterText(si.getTrust_Admin().getPassword(), apass);
		wait(10);
	}

	@Then("user Click the Login Button and It Navigates to current resource list page")
	public void user_Click_the_Login_Button_and_It_Navigates_to_current_resource_list_page() throws Throwable {
		btnClick(si.getTrust_Admin().getLogin());
		sleep(5000);
	}

	@Then("user click the my notification button in dashboard and navigates to my notifiaction")
	public void user_click_the_my_notification_button_in_dashboard_and_navigates_to_my_notifiaction() throws Throwable {
		btnClick(si.getCancel_Page().getNotifications());
		wait(10);
	}

	@Then("user click the recently added notification button")
	public void user_click_the_recently_added_notification_button() throws Throwable {
//		jsScrollDownElement(si.getCancel_Page().getJavascr());
		sleep(3000);
		btnClick(si.getCancel_Page().getAutotest());
		sleep(2000);
	}

	@Then("user click the approve button and success message pops up")
	public void user_click_the_approve_button_and_success_message_pops_up() throws Throwable {
		jsScrollDownElement(si.getCancel_Page().getApprove());
		sleep(4000);
		btnClick(si.getCancel_Page().getApprove());
		wait(10);
		screenShot("Approved message");
		wait(10);
//		jsScrollDownElement(si.getCancel_Page().getJavascr());
		sleep(3000);
	}

	@Then("user click the approved notification button and navigates to cancel approve page")
	public void user_click_the_approved_notification_button_and_navigates_to_cancel_approve_page() throws Throwable {

		wait(10);
		btnClick(si.getCancel_Page().getAutotest());
	}

	@Then("user click the cancel approve button and select okay button")
	public void user_click_the_cancel_approve_button_and_select_okay_button() throws Throwable {
		jsScrollUpElement(si.getCancel_Page().getJavasc());
		sleep(3000);
		btnClick(si.getCancel_Page().getCancelapp());
		wait(10);
		btnClick(si.getCancel_Page().getOkbutton());
		wait(10);
		jsScrollDownElement(si.getCancel_Page().getJascript());
		sleep(3000);
		btnClick(si.getCancel_Page().getAccou());
		wait(10);
		btnClick(si.getCancel_Page().getLogo());
	}

}
