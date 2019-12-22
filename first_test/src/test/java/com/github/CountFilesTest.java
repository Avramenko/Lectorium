package com.github;

import org.testng.Assert;
import org.testng.annotations.Test;
import util.PropertyLoader;


public class CountFilesTest extends TestBase {

    @Test
    public void CountFies(){
        driver.get(PropertyLoader.loadProperty("environment.login"));
        app.getUserHelper().loggedInProsess();
        app.getNavigateHelper().clickFirstRepository();
        Assert.assertEquals(app.getDataHelper().amountOfAllFieles(),4);
        Assert.assertEquals(app.getDataHelper().amountOfFieles(),3);
        Assert.assertEquals(app.getDataHelper().amountOfFolders(),1);


    }
}
