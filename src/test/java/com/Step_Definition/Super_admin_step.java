package com.Step_Definition;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Single_Ton.Single_Ton_Design;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Super_admin_step extends Base_Class {

	public static Single_Ton_Design si = new Single_Ton_Design();

	@Then("User enters valid {string} in Emailaddress field super admin")
	public void user_enters_valid_in_emailaddress_field_super_admin(String string) throws Throwable {
		String getsuperadminemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsuperadminemail();
		enterText(si.getSuper_Admin().getEmailaddress(), getsuperadminemail);
		wait(10);
	}

	@Then("user enter valid {string} in password field super admin")
	public void user_enter_valid_in_password_field_super_admin(String string) throws Throwable {
		String getsuperadminpassword = FileReaderManager.getInstanceFRM().getInstanceCR().getsuperadminpassword();
		enterText(si.getSuper_Admin().getPassword(), getsuperadminpassword);
		sleep(2000);
	}

	@Then("user clicks Login button in super admin")
	public void user_clicks_login_button_in_super_admin() throws Throwable {
		btnClick(si.getSuper_Admin().getSubmitbutton());
		System.out.println("Login successfull");
		sleep(2000);
	}

	@When("user clicks on Add System Admin button")
	public void user_clicks_on_add_system_admin_button() throws Throwable {
		btnClick(si.getSuper_Admin().getAddSystemadminbutton());
		sleep(3000);
	}

	@Then("user enters system admin Username")
	public void user_enters_system_admin_username() throws Throwable {
		String getsystemadminusername = FileReaderManager.getInstanceFRM().getInstanceCR().getsystemadminusername();
		enterText(si.getSuper_Admin().getSystemadminnamefield(), getsystemadminusername);
		wait(10);
	}

	@Then("user enters system admin Emailaddress")
	public void user_enters_system_admin_emailaddress() throws Throwable {
		String systemAdminmail = FileReaderManager.getInstanceFRM().getInstanceCR().getSystemAdminmail();
		enterText(si.getSuper_Admin().getSystemadminemail(), systemAdminmail);
		wait(10);
	}

	@Then("user clicks Create System admin button")
	public void user_clicks_create_system_admin_button() throws Throwable {
		btnClick(si.getSuper_Admin().getCreatesystemadminbutton());
		wait(10);
		jsScrollUpElement(si.getSuper_Admin().getScroll_up());
		System.out.println("Systemadmin created successfully");
		sleep(5000);
	}

	@Then("user logout super admin credentials")
	public void user_logout_super_admin_credentials() throws Throwable {
		btnClick(si.getSuper_Admin().getProfile());
		wait(10);
		btnClick(si.getSuper_Admin().getLogout());
		sleep(3000);
	}

	@When("user enter the Email Address in text field")
	public void user_enter_the_email_address_in_text_field() throws Throwable {
		String sysemail = FileReaderManager.getInstanceFRM().getInstanceCR().getsysemail();
		enterText(si.getTrust_Admin().getEmail(), sysemail);
		wait(10);
	}

	@When("user enter the Password in text field")
	public void user_enter_the_password_in_text_field() throws Throwable {
		String syspass = FileReaderManager.getInstanceFRM().getInstanceCR().getsyspass();
		enterText(si.getTrust_Admin().getPassword(), syspass);
		sleep(2000);
	}

	@Then("user click the Login Button and it navigates to Trust management")
	public void user_click_the_login_button_and_it_navigates_to_trust_management() throws Throwable {
		btnClick(si.getTrust_Admin().getLogin());
		sleep(3000);
	}

	@When("user click the deactivate button and confirm pop up occurs")
	public void user_click_the_deactivate_button_and_confirm_pop_up_occurs() throws Throwable {
		jsScrollDownElement(si.getSystem_Admin().getJavascrp());
		wait(10);
		btnClick(si.getSystem_Admin().getDeactivate());
		sleep(2000);
	}

	@When("user click the yes button and success message pops up")
	public void user_click_the_yes_button_and_success_message_pops_up() throws Throwable {
		btnClick(si.getSystem_Admin().getYesbutton());
		sleep(5000);
	}

	@When("user click the current resources list button and take screenshot")
	public void user_click_the_current_resources_list_button_and_take_screenshot() throws Throwable {
		btnClick(si.getSystem_Admin().getList());
		sleep(4000);
		screenshotPage("Deactivate current resource list");
		sleep(2000);
	}

	@When("user click the Trust management button and navigates to trust management page")
	public void user_click_the_trust_management_button_and_navigates_to_trust_management_page() throws Throwable {
		jsScrollUpElement(si.getSystem_Admin().getTrustmanage());
		sleep(2000);
		btnClick(si.getSystem_Admin().getTrustmanage());
		sleep(3000);
	}

	@When("user click the activate button and confirm pop up occurs")
	public void user_click_the_activate_button_and_confirm_pop_up_occurs() throws Throwable {
		jsScrollDownElement(si.getSystem_Admin().getJavascrp());
		wait(10);
		btnClick(si.getSystem_Admin().getActivate());
		sleep(2000);
	}

	@When("user click Yes Button and success message pop up")
	public void user_click_yes_button_and_success_message_pop_up() throws Throwable {
		btnClick(si.getSystem_Admin().getYesbutton());
		sleep(5000);
	}

	@When("user click the Current resources List button and Take screenshots")
	public void user_click_the_current_resources_list_button_and_take_screenshots() throws Throwable {
		btnClick(si.getSystem_Admin().getList());
		sleep(3000);
		screenshotPage("Activate current resource list");
		sleep(2000);
	}

	@When("user logout trust admin credentials")
	public void user_logout_trust_admin_credentials() throws Throwable {
		jsScrollUpElement(si.getSuper_Admin().getScroll_up());
		sleep(3000);
		btnClick(si.getSuper_Admin().getProfile());
		wait(10);
		btnClick(si.getSuper_Admin().getLogout());
		sleep(3000);
	}

}
