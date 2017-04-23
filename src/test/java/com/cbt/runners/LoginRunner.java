package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format ={"html:target/cumber-report/login",
				"json:target/cucumber-report/login/cucumber.json"},
			features="./src/test/resouces/features/",
		glue= "com/cbt/stepdefs"
	)
public class LoginRunner {

}
