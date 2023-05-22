package cucumber_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/SA20463801/eclipse-workspace/guru99pbl/src/main/java/cucumber_Features/ABC.feature"
		,glue= {"cucumber_Runner"},tags = "@ABC"
		,dryRun = true
		,monochrome=true
		//,plugin= {"pretty","html:target/cucumber-reports"}
		)
public class SearchRunner extends AbstractTestNGCucumberTests {

}
