package runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = {"step"})
public class TestRunner {
	
//	@Before
//	public void setup() {
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//	}

}
