package com.github;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.AllureListener;
import util.PropertyLoader;

@Listeners(AllureListener.class)
public class CountStarsTest extends TestBase {

    @Test

    public void countStars(){
        //  driver.get(PropertyLoader.loadProperty("environment.login"));
        //  app.getUserHelper().loggedInProsess();
        driver.get(PropertyLoader.loadProperty("environment.home"));
        app.getNavigateHelper().searchRepo();
        Assert.assertEquals(app.getDataHelper().valueOfFirstStar(), "96880"); // Can be "False" result - value of Star can change
        app.getDataHelper().valueOfFirstStar();

    }
}
