package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Алиса on 20.07.2016.
 */
public class MainPage extends Page {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void sendKeysToElement(By element, String value) {
        driver.findElement(element).sendKeys(value);
    }

    public boolean isTextVisible(By element) {
        if (driver.findElement(element).isDisplayed()) {
            return true;
        } else return false;
    }

    public void pressEnter() {
        new Actions(driver).sendKeys(Keys.ENTER).build().perform();
    }
}
