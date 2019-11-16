package com.github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RepositoryPage;
import util.PropertyLoader;

import java.util.List;


public class CountFilesTest extends TestBase {

    String userNameValue = "testQA8120";
    String passwordValue = "TestQwe123rty";

    @Test
    public void CountFies(){
        driver.get(PropertyLoader.loadProperty("environment.login"));
        loginPage.enterFirstName(userNameValue);
        loginPage.enterPassword(passwordValue);
        loginPage.ClickLoginButton();
        postLoginPage.ClickFirstRepositories();

        List<WebElement> listOfAllFiles = driver.findElements(By.xpath(RepositoryPage.ALL_FILES_FROM_REPOSITORY));
        Assert.assertEquals(listOfAllFiles.size(),4);

        List<WebElement> listOfFiles = driver.findElements(By.xpath(RepositoryPage.FILES_FROM_REPOSITORY));
        Assert.assertEquals(listOfFiles.size(),3);

        List<WebElement> listOfFolders = driver.findElements(By.xpath(RepositoryPage.FOLDERS_FROM_REPOSITORY));
        Assert.assertEquals(listOfFolders.size(),1);




    }
}
