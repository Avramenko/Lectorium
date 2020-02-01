package com.github;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.TestListener;
import util.PropertyLoader;

@Listeners(TestListener.class)
public class OpenBlogPageTest extends TestBase {

    @Test
    @Description("Open blog page")
    public void openBlogPageTest() {
        driver.get(PropertyLoader.loadProperty("environment.home"));
        app.getNavigateHelper().clickBlogLink();
        Assert.assertEquals(driver.getCurrentUrl(), expectedHttpFromBlog);
        Assert.assertEquals(app.getAttributeHelper().logoFromBlogPage(),expectedLogoBlog);

    }
}
