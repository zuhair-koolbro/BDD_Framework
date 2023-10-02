package stepDefinitions;

import base.get_driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.inventory_page;
import pages.login_page;

public class inventory_steps extends get_driver {

    private inventory_page inventoryPage;

    public inventory_steps(){
        inventoryPage = new inventory_page();
    }

    @And("User adds a product to the cart")
    public void user_adds_product_to_cart() {
        inventoryPage.clickAddToCartButton();
    }

    @Then("The product should be added to the cart")
    public void product_should_be_added_to_cart() {
        Assert.assertEquals("1", inventoryPage.getCartTotalValue());
    }
}
