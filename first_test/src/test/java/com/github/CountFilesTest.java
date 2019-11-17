package com.github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.PropertyLoader;

import java.util.List;


public class CountFilesTest extends TestBase {

    @Test
    public void CountFies(){
        driver.get(PropertyLoader.loadProperty("environment.login"));
        app.getUserHelper().enterFirstName();
        app.getUserHelper().enterPassword();
        app.getUserHelper().clickLoginButton();
        app.getClickLinksHelper().clickFirstRepository();

        List<WebElement> listOfAllFiles = driver.findElements(By.xpath(app.getFindElementHelper().getAllFielesFromRepo()));
        Assert.assertEquals(listOfAllFiles.size(),4);

        List<WebElement> listOfFiles = driver.findElements(By.xpath(app.getFindElementHelper().getFielesFromRepo()));
        Assert.assertEquals(listOfFiles.size(),3);

        List<WebElement> listOfFolders = driver.findElements(By.xpath(app.getFindElementHelper().getFoldersFromRepo()));
        Assert.assertEquals(listOfFolders.size(),1);




    }
}
