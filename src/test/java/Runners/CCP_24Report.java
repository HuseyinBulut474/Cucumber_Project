package Runners;

import Utilities.GWD;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@CCP-24",
        features = {"src/test/java/FeatureFiles/CCP-24.feature"},
        glue = {"StepDefinitions"},
        plugin = { "html:target//cucumber-reports.html" }
)
public class CCP_24Report extends AbstractTestNGCucumberTests {

    @BeforeClass(alwaysRun = true)
    @Parameters("browser")
    public void beforeClass(String browser) {
        GWD.threadBrowserName.set(browser);
    }

    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("User Name", "Group 22");
        ExtentService.getInstance().setSystemInfo("Application Name", "Campus Fields");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
    }
}