package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Алиса on 20.07.2016.
 */
public class InitDriver {

    private InitDriver() {
    }

    public static WebDriver initDriver() {
        return new FirefoxDriver();
    }
}
