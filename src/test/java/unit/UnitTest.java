package unit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import base.BaseTest;

/**
 * Created by ����� on 20.07.2016.
 */
public class UnitTest extends BaseTest {
//mvn -Dtest=UnitTest test
    @Test
    public void mainPageTest(){
        mainPage.open(MAIN_URL);
        mainPage.sendKeysToElement(By.xpath(".//*[@id='sb_ifc0']"), "Hello world");
        Assert.assertSame(true, mainPage.isTextVisible(By.xpath(".//input[@id='lst-ib']")));
    }

    @Test
    public void resultPageTest(){
        resultPage.open(SEARCH_URL);
        Assert.assertSame(true, resultPage.isSearchResultPresent(By.xpath(".//*[@id='ires']")));
    }

}
