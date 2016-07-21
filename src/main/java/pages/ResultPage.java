package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Алиса on 20.07.2016.
 */
public class ResultPage extends Page {
    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSearchResultPresent(By element){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        if(driver.findElement(element).isDisplayed()){
            return true;
        }
        else return false;
    }
}
