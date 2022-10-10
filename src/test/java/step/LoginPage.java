package step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	
	
	
	@Given("The user opens the webpage")
	public void the_user_opens_the_webpage() {		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php"); 
	}
	@Given("The user clicks Sign In button")
	public void the_user_clicks_sign_in_button() {
	    
	}
	@Given("The user enters username and password")
	public void the_user_enters_username_and_password() {
	    
	}
	@When("The user clicks the Sign in button")
	public void the_user_clicks_the_sign_in_button() {
	    
	}
	@Then("Verify the title of the page")
	public void verify_the_title_of_the_page() {
	   
	}


}
