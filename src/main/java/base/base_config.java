package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class base_config {
    public WebDriver webDriver;
    public get_driver getDriver;

    public base_config(){
        getDriver = new get_driver();
    }


    public void setUp(String url) throws IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);

        getDriver.setAndroidDriverSession(webDriver);
    }


    public void tearDown(){
        webDriver.quit();
    }
}
