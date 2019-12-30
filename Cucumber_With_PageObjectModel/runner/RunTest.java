package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/main/java/features/Login.feature",
				  glue= {"pages","hooks"},
				  monochrome=true)
public class RunTest extends AbstractTestNGCucumberTests{

}
