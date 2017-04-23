package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format ={"html:target/cumber-report/registration",
				"json:target/cucumber-report/registration/cucumber.json"},
		features="./src/test/resouces/features/",
		glue= "com/cbt/stepdefs"
	)
public class RegistrationRunner {

}
