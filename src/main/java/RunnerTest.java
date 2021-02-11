import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by sangi on 24-01-2020.
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        glue = {"stepDefinations"},
        dryRun = false,
        plugin = {"pretty"}
)


public class RunnerTest {


}
