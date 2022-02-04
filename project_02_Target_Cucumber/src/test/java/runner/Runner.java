package runner;

import org.junit.runner.RunWith; // Second import for @RunWith(Cucumber.class)

import io.cucumber.junit.Cucumber; // First import for @RunWith(Cucumber.class)
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features",
		glue = "step_Defs",
		plugin = {"html:target/cucumber-html-report",
		  		  "json:target/cucumber.json",
		  		  "pretty:target/cucumber-pretty.txt",
		  		  "usage:target/cucumber-usage.json", 
		  		  "junit:target/cucumber-results.xml",
		  		  "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"
			},
		dryRun = false,
		monochrome = true, 
		tags = "@Smoke"
		)

public class Runner {

	
}//class
