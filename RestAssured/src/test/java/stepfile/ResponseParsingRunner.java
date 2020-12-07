package stepfile;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources\\features",glue= {"stepfile"})
public class ResponseParsingRunner {

	
}
