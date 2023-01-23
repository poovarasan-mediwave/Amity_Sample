package com.Single_Ton;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Model.Publish_page;
import com.Page_Object_Model.Resources_Page;
import com.Page_Object_Model.Superadmin;
import com.Page_Object_Model.Systemadmin_page;
import com.Page_Object_Model.Trustadmin_page;
import com.Page_Object_Model.Unpublish_page;
import com.Page_Object_Model.cancel_page;

public class Single_Ton_Design {

	public WebDriver driver;

	private cancel_page cancel_Page;

	private Publish_page publish_page;

	private Resources_Page resources_Page;

	private Superadmin super_Admin;

	private Systemadmin_page system_Admin;

	private Trustadmin_page trust_Admin;

	private Unpublish_page unpublish_page;

	public cancel_page getCancel_Page() {
		cancel_Page = new cancel_page();
		return cancel_Page;
	}

	public Publish_page getPublish_page() {
		publish_page = new Publish_page();
		return publish_page;
	}

	public Resources_Page getResources_Page() {
		resources_Page = new Resources_Page();
		return resources_Page;
	}

	public Superadmin getSuper_Admin() {
		super_Admin = new Superadmin();
		return super_Admin;
	}

	public Systemadmin_page getSystem_Admin() {
		system_Admin = new Systemadmin_page();
		return system_Admin;
	}

	public Trustadmin_page getTrust_Admin() {
		trust_Admin = new Trustadmin_page();
		return trust_Admin;
	}

	public Unpublish_page getUnpublish_page() {
		unpublish_page = new Unpublish_page();
		return unpublish_page;
	}

}
