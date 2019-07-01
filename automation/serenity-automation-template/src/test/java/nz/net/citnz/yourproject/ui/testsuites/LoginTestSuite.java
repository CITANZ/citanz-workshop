package nz.net.citnz.yourproject.ui.testsuites;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {
        "src/test/resources/features/ui/load_google.feature" }, glue = {
                "nz.net.citnz.yourproject.ui.steps" }, snippets = SnippetType.CAMELCASE)
public class LoginTestSuite {
}