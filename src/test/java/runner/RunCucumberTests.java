package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
public class RunCucumberTests extends AbstractTestNGCucumberTests {

    public Object[][] scenarios(){
        return super.scenarios();
    }
}
