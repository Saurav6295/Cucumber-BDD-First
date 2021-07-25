package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "G:\\Automation testing\\HandsOn\\July25\\src\\main\\java\\Feature\\FeatureSimple.feature",glue= {"StepDefinition"})

public class TestRunnerSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
