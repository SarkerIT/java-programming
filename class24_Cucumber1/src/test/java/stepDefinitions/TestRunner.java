package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", 
					glue = { "stepDefinitions" }, 
					monochrome = true, // means console outputs in much more readable way 
					plugin = {"pretty", "html:target/HTML_Report/report.html" }
)
public class TestRunner {

}
