package com.github;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.TestListener;
import util.PropertyLoader;


@Listeners(TestListener.class)
public class TwitterLinkTest extends TestBase {

    @Test
    @Description("Open twitter`s github page")
    public void openTwitterLinkTest() {
    //    driver.get(PropertyLoader.loadProperty("environment.login"));
    //    app.getUserHelper().loggedInProcess();
        driver.get(PropertyLoader.loadProperty("environment.home"));
        app.getNavigateHelper().clickToAboutLink();
        app.getNavigateHelper().clickToTwitterLink();
        Assert.assertEquals(driver.getCurrentUrl(), expectedHttpFromTwitter);
        Assert.assertTrue(app.getAttributeHelper().twitterConfirmedAccountImg());
        Assert.assertEquals(app.getAttributeHelper().titleOfAccountTwitter(), "GitHub");

    }
}
