package com.github;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.AllureListener;
import util.PropertyLoader;

@Listeners(AllureListener.class)
public class OpenBlogPageTest extends TestBase {


    @Test

    public void OpenBlogPageTest() {
        driver.get(PropertyLoader.loadProperty("environment.login"));
        app.getUserHelper().loggedInProsess();
        app.getNavigateHelper().clickBlogLink();
        Assert.assertEquals(driver.getCurrentUrl(), expectedHttpFromBlog);
        Assert.assertEquals(app.getAttributeHelper().logoFromBlogPage(),expectedLogoBlog);

    }
}
