package stepDefinitions;

import base.base_config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class base_steps extends base_config {
    base_config baseConfig;
    public base_steps(){
        baseConfig = new base_config();
    }

    @Given("User open {string} page")
    public void openWebsitePage(String url) throws IOException {
        baseConfig.setUp(url);
    }

    @Then("User close browser")
    public void closingBrowser(){
        baseConfig.tearDown();
    }
}
