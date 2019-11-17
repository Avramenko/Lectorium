package com.github;

import org.testng.Assert;
import org.testng.annotations.Test;
import util.PropertyLoader;

public class FirstRun extends TestBase {



    @Test
    public void FirstRun() {
        driver.get(PropertyLoader.loadProperty("environment.login"));
        app.getUserHelper().enterFirstName();
        app.getUserHelper().enterPassword();
        app.getUserHelper().clickLoginButton();
        app.getClickLinksHelper().clickBlogLink();
        Assert.assertEquals(driver.getCurrentUrl(), expectedHttpFromBlog);
        Assert.assertEquals(app.getIdentifyPageHelper().checkLogoFromBlogPage(),expectedLogoBlog);

    }
}
