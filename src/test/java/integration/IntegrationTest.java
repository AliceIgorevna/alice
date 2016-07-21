package integration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import base.BaseTest;

/**
 * Created by ����� on 20.07.2016.
 */
public class IntegrationTest extends BaseTest {
    @Test
    public void test(){
        mainPage.open(MAIN_URL);
        mainPage.sendKeysToElement(By.xpath(".//*[@id='sb_ifc0']"), "Hello world");
        mainPage.pressEnter();
        Assert.assertSame(true, resultPage.isSearchResultPresent(By.xpath(".//*[@id='ires']")));
    }
}
