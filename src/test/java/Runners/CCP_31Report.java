package Runners;

import Utilities.GWD;
import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@CCP-31",
        features = {"src/test/java/FeatureFiles/CCP-31.feature"},
        glue = {"StepDefinitions"},
        plugin = { "html:target//cucumber-reports.html" }
)
@Listeners({ExtentITestListenerAdapter.class})
public class CCP_31Report extends AbstractTestNGCucumberTests {

    @BeforeClass(alwaysRun = true)
    public void beforeClass()
    {
        GWD.threadBrowserName.set("chrome");
    }
    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("User Name", "Group 22");
        ExtentService.getInstance().setSystemInfo("Application Name", "Campus Human Resources");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
    }
}
