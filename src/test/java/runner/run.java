package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "", features = { "src/test/resources/" }, monochrome = true, plugin = { "pretty" }, glue = {
		"def" })
public class run {

}
