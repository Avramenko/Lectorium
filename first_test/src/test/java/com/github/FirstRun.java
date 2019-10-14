package com.github;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FirstRun extends WebDriverSetting {
    String loginField = ".//input[@id = 'login_field']";
    String passwordField = ".//input[@id = 'password']";
    String signInButton = ".//input[@value = 'Sign in']";
    String userNameValue = "testQA8120";
    String passwordValue = "TestQwe123rty";

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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
