package com.github;

import okio.Timeout;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstRun extends WebDriverSetting {
    @Test
    public void FirstRun() {
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        WebElement userName = driver.findElement(By.xpath("//*[@id=\"login_field\"]"));
        userName.clear();
        userName.sendKeys("testQA8120");


        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.clear();
        passWord.sendKeys("TestQwe123rty");

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/input[8]"));
        submitButton.click();

        String titlePage = driver.getTitle();
        Assert.assertTrue(titlePage.equals("GitHub"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
