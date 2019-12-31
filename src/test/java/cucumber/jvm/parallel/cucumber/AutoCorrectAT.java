package cucumber.jvm.parallel.cucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "src/test/resources/cucumber/examples/", tags = {"@autocorrect"}, format = {"html:target/cucumber-report/autocorrect"})
public class AutoCorrectAT {
}
