package com.github;

import org.testng.Assert;
import org.testng.annotations.Test;
import util.PropertyLoader;

public class FirstRun extends WebDriverSetting {
    String userNameValue = "testQA8120";
    String passwordValue = "TestQwe123rty";
    String expectedLogoBlog = "The GitHub Blog";


    @Test
    public void FirstRun() {
        driver.get(PropertyLoader.loadProperty("environment.login"));
        loginPage.enterFirstName(userNameValue);
        loginPage.enterPassword(passwordValue);
        loginPage.ClickLoginButton();
        postLoginPage.ClickBlogLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://github.blog/");
        Assert.assertEquals(blogPage.checkLogo(),expectedLogoBlog);



    }
}
