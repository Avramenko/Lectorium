package com.github;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.AllureListener;
import util.PropertyLoader;


@Listeners(AllureListener.class)
public class TwitterLinkTest extends TestBase {

    @Test

    public void OpenTwitterLinkTest() {
      //  driver.get(PropertyLoader.loadProperty("environment.login"));
      //  app.getUserHelper().loggedInProsess();
        driver.get(PropertyLoader.loadProperty("environment.home"));
        app.getNavigateHelper().clickToAboutLink();
        app.getNavigateHelper().clickToTwitterLink();
        Assert.assertEquals(driver.getCurrentUrl(), expectedHttpFromTwitter);
        Assert.assertTrue(app.getAttributeHelper().twitterConfirmedAccountImg());
        Assert.assertEquals(app.getAttributeHelper().titleOfAccountTwitter(), "GitHub");

    }
}
