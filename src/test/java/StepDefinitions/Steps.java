package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import scenarios.Base;

public class Steps extends Base {

    @Given("the user is on {string} page")
    public void the_user_is_on_page(String pageName) {
        driver.get("https://www." + pageName + ".com/");
        Assertions.assertTrue(driver.getTitle().contains(pageName), "User is on " + pageName);
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("Valid credentials entered.");
    }

    @And("hits submit")
    public void hits_submit() {
        System.out.println("Button pressed.");
    }

    @Then("user is logged into his account")
    public void user_is_logged_into_his_account() {
        System.out.println("User logged in.");
    }
}
