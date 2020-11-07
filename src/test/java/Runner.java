import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber",
                "json:target/cucumber.json", "rerun:target/rerun.txt"},
        features = "src/test/resources/featureFiles",
        glue = "step_defenitions",
        dryRun = false,
        tags = "@DeleteUser, @AddUser",
        monochrome = true
)




public class Runner {
}
