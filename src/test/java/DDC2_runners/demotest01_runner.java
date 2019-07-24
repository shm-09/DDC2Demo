package DDC2_runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="MYDEMO_DDC2_FEATURES",glue="DDC2_my_Step_defs",tags= {"@Sanity, @Regression"}, plugin={"html:target/cucumber-htmlreport.html"})

public class demotest01_runner {
	

}
