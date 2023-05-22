package BDDCucumber.OverviewOfCucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/SA20463801/eclipse-workspace/guru99pbl/src/main/java/BDDCucumber/OverviewOfCucumber/petstore_Login.feature"
		,glue= {"BDDCucumber.OverviewOfCucumber"}
		
		
		
		)

public class Runner_Login {

}
