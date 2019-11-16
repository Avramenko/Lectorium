package com.github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.PropertyLoader;

import java.util.List;


public class CountFilesTest extends WebDriverSetting {

    String userNameValue = "testQA8120";
    String passwordValue = "TestQwe123rty";

    @Test
    public void CountFies(){
        driver.get(PropertyLoader.loadProperty("environment.login"));
        loginPage.enterFirstName(userNameValue);
        loginPage.enterPassword(passwordValue);
        loginPage.ClickLoginButton();
        postLoginPage.ClickFirstRepositories();

        List<WebElement> listOfFile = driver.findElements(By.xpath(".//tr[@class ='js-navigation-item']"));
    //    System.out.println(listOfFile.size());
    //    System.out.println(repositoryPage.CountFiles());   // Неможу зрозуміти чому повертає "0" якщо робити через пейджбілдер
        Assert.assertEquals(listOfFile.size(),4);

    // xPath for icon = .//tr[@class ='js-navigation-item']//*[@aria-label = 'directory']

    }
}
