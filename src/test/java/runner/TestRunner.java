package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
 features="src/test/resources/features",
 glue={"hooks","stepdefinitions"},
 plugin={"pretty"}
)
public class TestRunner {}
