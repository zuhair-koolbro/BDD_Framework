package pages;

import base.get_driver;
import org.openqa.selenium.By;

public class inventory_page extends get_driver {
    String addToCartButtonCSS = ".btn_inventory";
    String cartIconCSS = ".shopping_cart_badge";

    public void clickAddToCartButton(){
        driver.findElement(By.cssSelector(addToCartButtonCSS)).click();
    }

    public String getCartTotalValue(){
        return driver.findElement(By.cssSelector(".shopping_cart_badge")).getText();
    }
}
