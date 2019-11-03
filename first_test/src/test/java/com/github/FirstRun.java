package com.github;

import org.junit.Assert;
import org.junit.Test;
import util.PropertyLoader;

public class FirstRun extends WebDriverSetting {
    /*String loginField = ".//input[@id = 'login_field']";
    String passwordField = ".//input[@id = 'password']";
    String signInButton = ".//input[@value = 'Sign in']";
    String blogForHtml = "https://github.blog";
    String blogLinkButton = ".//li[@class = 'mb-1']//a[text() = 'Blog']";
    String expectedPostPageTitle = "GitHub";*/
    String userNameValue = "testQA8120";
    String passwordValue = "TestQwe123rty";
    String expectedLogoBlog = "The GitHub Blog";


    @Test
    public void FirstRun() {
        driver.manage().window().maximize();
        driver.get(PropertyLoader.loadProperty("environment.login"));
        loginPage.enterFirstName(userNameValue);
        loginPage.enterPassword(passwordValue);
        loginPage.ClickLoginButton();

      //  Assert.assertEquals(expectedPostPageTitle, postLoginPage.GetTitleOfPostLoginPage());

        postLoginPage.ClickBlogLink();

        Assert.assertEquals("https://github.blog/", driver.getCurrentUrl());
        Assert.assertEquals(blogPage.checkLogo(),expectedLogoBlog);



    }
}
