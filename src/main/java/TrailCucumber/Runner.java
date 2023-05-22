package TrailCucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/SA20463801"
				+ "/eclipse-workspace/guru99pbl/src"
				+ "/main/java/TrailCucumber"
				+ "/loginTest.feature"
		,glue= {"TrailCucumber"}
		)
public class Runner {

}
