package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class get_driver {
    public static WebDriver driver;

    public void setAndroidDriverSession(WebDriver driver) throws IOException {
        this.driver = driver;
    }
}
