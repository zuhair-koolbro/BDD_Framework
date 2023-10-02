package pages;

import base.get_driver;
import org.openqa.selenium.By;

public class login_page extends get_driver {

    String loginButton = "login-button";
    String passwordField = "password";
    String usernameField = "user-name";

    public void clickUsername(){
        driver.findElement(By.id(usernameField)).click();
    }
    public void clickPassword(){
        driver.findElement(By.id(passwordField)).click();
    }
    public void enterUsername(String username) {
        driver.findElement(By.id(usernameField)).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id(passwordField)).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.id(loginButton)).click();
    }
}
