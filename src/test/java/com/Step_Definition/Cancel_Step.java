package com.Step_Definition;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Global.Base_Class;
import com.Single_Ton.Single_Ton_Design;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Cancel_Step extends Base_Class {

	public static Single_Ton_Design si = new Single_Ton_Design();

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
		wait(10);
	}

	@Then("user click the my notification button in dashboard and navigates to my notifiaction")
	public void user_click_the_my_notification_button_in_dashboard_and_navigates_to_my_notifiaction() throws Throwable {
		btnClick(si.getCancel_Page().getNotifications());
		wait(10);
	}

	@Then("user click the recently added notification button")
	public void user_click_the_recently_added_notification_button() throws Throwable {
		jsScrollDownElement(si.getCancel_Page().getJavascr());
		sleep(2000);
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
		jsScrollDownElement(si.getCancel_Page().getJavascr());
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
