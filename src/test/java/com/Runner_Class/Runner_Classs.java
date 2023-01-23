package com.Runner_Class;


import org.junit.runner.RunWith;

import com.Configuration_Reader.FileReaderManager;
import com.Lib_Global.Base_Class;
import com.Single_Ton.Single_Ton_Design;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature_File", glue = {
		"com.Step_Definition" }, plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class Runner_Classs extends Base_Class{
	
	
	

	

}


