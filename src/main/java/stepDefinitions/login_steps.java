package stepDefinitions;

import base.get_driver;
import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.login_page;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class login_steps extends get_driver {
    private login_page loginPage;

    public login_steps() {
        loginPage = new login_page();
    }

    @And("User click on username field")
    public void clickUsernameField(){
        loginPage.clickUsername();
    }
    @And("User click on password field")
    public void clickPasswordField(){
        loginPage.clickPassword();
    }
    @When("^User enter username \"([^\"]*)\"$")
    public void enterUsername(String username) {
        loginPage.enterUsername(username);
    }
    @When("User enter password {string}")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("User click the Login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("User should be on the Products page")
    public void verifyOnProductsPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory.html"));
    }
}

