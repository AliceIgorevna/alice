package ui;

import driver.InitDriver;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

/**
 * Created by ����� on 20.07.2016.
 */
public class UITest extends Steps {
    private final String SEARCH_FIELD = ".//*[@id='sb_ifc0']";
    private final String SEARCH_WORD = ".//input[@id='lst-ib']";
    private WebDriver driver;
    private MainPage mainPage;


    @Given("Url $url")
    public void goTo(String url) {
        driver = InitDriver.initDriver();
        mainPage = new MainPage(driver);
        mainPage.open(url);
    }

    @When("write $searchWord in search box")
    public void firstTest(String searchWord) {
        mainPage.sendKeysToElement(By.xpath(SEARCH_FIELD), searchWord);
    }

    @Then("this text is visible")
    public void verifyTextVisible() {
        Assert.assertSame(true, mainPage.isTextVisible(By.xpath(SEARCH_WORD)));
        driver.quit();
    }
}
