import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",  // Feature dosyalarının yolu
        glue = "stepDefinitions",                  // Step Definitions klasörü
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Raporlama
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
