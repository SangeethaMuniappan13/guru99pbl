package cucumber_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/SA20463801/eclipse-workspace/guru99pbl/src/main/java/cucumber_Features/ABC.feature"
		,glue= {"Cucumber_Bindings"},tags = "@ABC"
		,dryRun = true
		,monochrome=true
		//,plugin= {"pretty","html:target/cucumber-reports"}
		)
public class SearchRunner extends AbstractTestNGCucumberTests {

}
