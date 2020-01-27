package com.github;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.AllureListener;
import util.PropertyLoader;

@Listeners(AllureListener.class)
public class CheckValueFromProgrammLanguageTest extends TestBase {

    @Test

    public void checkValueFromProgramLanguage (){
        //  driver.get(PropertyLoader.loadProperty("environment.login"));
        //  app.getUserHelper().loggedInProsess();
        driver.get(PropertyLoader.loadProperty("environment.home"));
        app.getNavigateHelper().searchRepo();
        Assert.assertTrue(app.getAttributeHelper().valueFromLanguage("CSS") > 0);
    }
}
