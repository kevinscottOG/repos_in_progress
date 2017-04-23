package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format ={"html:target/cumber-report/search",
				"json:target/cucumber-report/search/cucumber.json"},
		features="./src/test/resouces/features/",
		glue= "com/cbt/stepdefs"
	)
public class SearchRunner {

}
