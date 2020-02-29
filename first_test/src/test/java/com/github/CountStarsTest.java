package com.github;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.TestListener;
import util.PropertyLoader;

@Listeners(TestListener.class)
public class CountStarsTest extends TestBase {

    @Test
    @Description("Count all stars from first search result page")
    public void countStars(){
        //  driver.get(PropertyLoader.loadProperty("environment.login"));
        //  app.getUserHelper().loggedInProcess();
        driver.get(PropertyLoader.loadProperty("environment.home"));
        app.getNavigateHelper().searchRepo();
        Assert.assertEquals(app.getDataHelper().valueOfFirstStar(), "96880"); // Can be "False" result - value of Star can change
    }
}
