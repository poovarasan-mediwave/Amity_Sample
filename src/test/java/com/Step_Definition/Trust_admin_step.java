package com.Step_Definition;

import java.io.IOException;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Single_Ton.Single_Ton_Design;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Trust_admin_step extends Base_Class {

	public static Single_Ton_Design si = new Single_Ton_Design();

	@When("user enter the email address in user field")
	public void user_enter_the_email_address_in_user_field() throws Throwable {
		String email = FileReaderManager.getInstanceFRM().getInstanceCR().getemail();
		enterText(si.getTrust_Admin().getEmail(), email);
		wait(10);
	}

	@When("user enter the password in password field")
	public void user_enter_the_password_in_password_field() throws Throwable {
		String pass = FileReaderManager.getInstanceFRM().getInstanceCR().getpassword();
		enterText(si.getTrust_Admin().getPassword(), pass);
		sleep(2000);
	}

	@When("user click the login Button and it navigates to current resource list page")
	public void user_click_the_login_button_and_it_navigates_to_current_resource_list_page() throws Throwable {
		btnClick(si.getTrust_Admin().getLogin());
		sleep(3000);
	}

	@When("user click the usermanagement button and naviagtes to user management page")
	public void user_click_the_usermanagement_button_and_naviagtes_to_user_management_page() throws Throwable {
		btnClick(si.getTrust_Admin().getUsermanage());
		sleep(3000);
	}

	@When("user click add user button and add a new user popups")
	public void user_click_add_user_button_and_add_a_new_user_popups() throws Throwable {
		btnClick(si.getTrust_Admin().getAdduser());
		sleep(2000);
	}

	@When("user enter the name and email address and click the creator button")
	public void user_enter_the_name_and_email_address_and_click_the_creator_button() throws Throwable {
		String userc = FileReaderManager.getInstanceFRM().getInstanceCR().getuserc();
		enterText(si.getTrust_Admin().getName(), userc);
		wait(10);
		String email1 = FileReaderManager.getInstanceFRM().getInstanceCR().getemail1();
		enterText(si.getTrust_Admin().getEmail1(), email1);
		wait(10);
		btnClick(si.getTrust_Admin().getCreator());
		screenShot("create content creator");
		sleep(2000);
	}

	@When("user clicks the create user button and success message pops up")
	public void user_clicks_the_create_user_button_and_success_message_pops_up() throws Throwable {
		btnClick(si.getTrust_Admin().getCreate());
		sleep(4000);
	}

	@When("user click the Add user button and add a new User popups")
	public void user_click_the_add_user_button_and_add_a_new_user_popups() throws Throwable {
		btnClick(si.getTrust_Admin().getAdduser());
		sleep(2000);
	}

	@When("user enter the Name and Email address and Click the approver button")
	public void user_enter_the_name_and_email_address_and_click_the_approver_button() throws Throwable {
		String usera = FileReaderManager.getInstanceFRM().getInstanceCR().getusera();
		enterText(si.getTrust_Admin().getName(), usera);
		wait(10);
		String email2 = FileReaderManager.getInstanceFRM().getInstanceCR().getemail2();
		enterText(si.getTrust_Admin().getEmail1(), email2);
		sleep(2000);
		btnClick(si.getTrust_Admin().getApprover());
		screenShot("create approver successfully");
		sleep(3000);
	}

	@When("user click the create User button and Success message pops up")
	public void user_click_the_create_user_button_and_success_message_pops_up() throws Throwable {
		btnClick(si.getTrust_Admin().getCreate());
		sleep(3000);
		screenshotPage("create approver.PNG");
	}

	@Then("user click the logout button and naviagtes to login page")
	public void user_click_the_logout_button_and_naviagtes_to_login_page() throws Throwable {
		jsScrollDownElement(si.getSuper_Admin().getScroll_up());
		sleep(5000);
		btnClick(si.getTrust_Admin().getAcc());
		sleep(3000);
		btnClick(si.getTrust_Admin().getLogout());
	}

}
