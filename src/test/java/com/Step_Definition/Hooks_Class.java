package com.Step_Definition;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Globals.Base_Class;
import com.Single_Ton.Single_Ton_Design;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks_Class extends Base_Class {

	public static Single_Ton_Design si = new Single_Ton_Design();

	@Before
	public void initiateBrowser() throws Throwable {

		browserLaunch("chrome");
		String url = FileReaderManager.getInstanceFRM().getInstanceCR().getURL();
		getDrive(url);
		maximize();
	}

	@After
	public void browserEnd() {
		browserqu();
	}
}
