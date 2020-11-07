package step_defenitions;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setUp() {
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "img/png");
            Driver.closeDriver();
        }
        Driver.closeDriver();
    }



}
