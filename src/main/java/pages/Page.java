package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Алиса on 20.07.2016.
 */
public abstract class Page {
    public static WebDriver driver;

    public Page(WebDriver driver) {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Page.driver = driver;
    }
    public void open(String URL){
        driver.get(URL);
        driver.manage().window().maximize();
    }
}
