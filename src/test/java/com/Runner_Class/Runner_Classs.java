package com.Runner_Class;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature_File", monochrome = true, dryRun = false, glue = {
		"com.Step_Definition" }, plugin = { "html:Report/HtmlReport", "pretty", "json:JansonReport/Report.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class Runner_Classs {

}
