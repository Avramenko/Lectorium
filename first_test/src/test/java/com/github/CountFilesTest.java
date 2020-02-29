package com.github;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.TestListener;
import util.PropertyLoader;

@Listeners(TestListener.class)
public class CountFilesTest extends TestBase {

    @Test
    @Description("Count files from firs repository")
    public void countFies(){
        //  driver.get(PropertyLoader.loadProperty("environment.login"));
        //  app.getUserHelper().loggedInProcess();
        driver.get(PropertyLoader.loadProperty("environment.home"));
        app.getNavigateHelper().clickFirstRepository();
        Assert.assertEquals(app.getDataHelper().amountOfAllFiles(),4);
        Assert.assertEquals(app.getDataHelper().amountOfFiles(),3);
        Assert.assertEquals(app.getDataHelper().amountOfFolders(),1);


    }
}
