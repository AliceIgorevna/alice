package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.MainPage;
import pages.ResultPage;

/**
 * Created by ����� on 20.07.2016.
 */
public class BaseTest {
    protected final String MAIN_URL = "https://google.com/";
    protected final String SEARCH_URL = "https://www.google.com.ua/?gfe_rd=cr&ei=upyOV9P3AYTFNKWLgfAI#q=selenium";
    protected static WebDriver driver;
    protected MainPage mainPage;
    protected ResultPage resultPage;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        mainPage = new MainPage(driver);
        resultPage = new ResultPage(driver);
    }

    @After
    public void quit() {
        driver.quit();
    }
}
