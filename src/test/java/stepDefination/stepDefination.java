package stepDefination;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefination {
	public WebDriver driver;
	@Given("^User is on landing page$")
    public void user_is_on_landing_page() {
		String chromeDriverPath = System.getProperty("user.dir")+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		System.out.println("User is on landing page");
    }

	@When("^User enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_username_and_password(String uname, String pass) {
	    driver.findElement(By.xpath("//a[@class='theme-btn register-btn']")).click();
	    driver.findElement(By.id("user_email")).sendKeys(uname);
	    driver.findElement(By.id("user_password")).sendKeys(pass);
	    System.out.println("On login Page");
	}

    @Then("^Homepage should be displayed$")
    public void homepage_should_be_displayed() throws Throwable {
        throw new PendingException();
    }

    @And("^title should be displayed$")
    public void title_should_be_displayed() throws Throwable {
        throw new PendingException();
    }
} //Adding comment on the last line 
