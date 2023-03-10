package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)            //annotation comes from JUnit

@CucumberOptions(

//        tags = "@search",

        features = "src/test/resources/parallel",

        glue = "stepDefinitions",        //use PATH FROM SOURCE ROOT for glue
                                        //because in relation to /runners/ -- /stepDefinitions/ folder is a sibling folder
                                        //whereas resources was under parent folder's sibling folder....

        stepNotifications = true,        //shows each step of the scenario in the report

//        snippets = CucumberOptions.SnippetType.CAMELCASE,



        plugin = {  "pretty",     //gives you more info on the console than otherwise
                    "html:target/built-in-report/built-in-report.html",//generates built-in html report
                    "json:target/cucumber.json", //generates built-in json report which feeds(necessary for) the external pretty report
                "rerun:target/failed.txt"       //generates a txt file with the list of failed scenarios
        }

//        , dryRun = true //step def execution is skipped, used for generating snippets without running the code
)
public class ParallelRunner {
}
