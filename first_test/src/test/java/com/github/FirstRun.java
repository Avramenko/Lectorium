package com.github;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BlogPage;
import org.openqa.selenium.JavascriptExecutor;

public class FirstRun extends WebDriverSetting {
    String loginField = ".//input[@id = 'login_field']";
    String passwordField = ".//input[@id = 'password']";
    String signInButton = ".//input[@value = 'Sign in']";
    String userNameValue = "testQA8120";
    String passwordValue = "TestQwe123rty";
    String blogLinkButton = ".//li[@class = 'mb-1']//a[text() = 'Blog']";
    String blogForHtml = "https://github.blog";
    String expectedLogoBlog = "The GitHub Blog";

    @Test
    public void FirstRun() {
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        WebElement userName = driver.findElement(By.xpath(loginField));
        userName.clear();
        userName.sendKeys(userNameValue);


        WebElement passWord = driver.findElement(By.xpath(passwordField));
        passWord.clear();
        passWord.sendKeys(passwordValue);

        WebElement submitButton = driver.findElement(By.xpath(signInButton));
        submitButton.click();

        String titlePage = driver.getTitle();
        Assert.assertTrue(titlePage.equals("GitHub"));

        WebElement blogLink = driver.findElement(By.xpath(blogLinkButton));  //Скролл для лінки
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,470)", "");
        blogLink.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BlogPage blogPage = new BlogPage(driver, wait);
        Assert.assertEquals(blogPage.checkLogo(),expectedLogoBlog);

        Assert.assertEquals("https://github.blog/", driver.getCurrentUrl());



    }
}
