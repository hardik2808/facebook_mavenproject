package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
	features = {"features"},
	glue = {"com.facebook.stepDefination"},
	tags = {"@LoginTag"},
	monochrome = true, dryRun=false)

public class LoginTestRunner {

	
}
