package com.freecrm.MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\D Drive\\Mohit\\WorkSpace_Mohit\\FreeCrmAutomation\\src\\main\\java\\com\\freecrm\\Features\\KnowledgeBase.feature", //the path of the feature files
		glue={"com.freecrm.stepDefinitions"}, //the path of the step definition files
		plugin = {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step definition file
	)

public class TestRunner {

	
	
}
