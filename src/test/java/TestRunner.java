import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = "src/test/resources/UserLogin.feature",
        glue = "src/main/java/Steps.java")
@Test
public class TestRunner {

}
