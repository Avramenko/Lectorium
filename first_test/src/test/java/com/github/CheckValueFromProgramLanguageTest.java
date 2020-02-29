package com.github;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.TestListener;
import util.PropertyLoader;

@Listeners(TestListener.class)
public class CheckValueFromProgramLanguageTest extends TestBase {

    @Test
    @Description("Check value from program language in search result page")
    public void checkValueFromProgramLanguage (){
        //  driver.get(PropertyLoader.loadProperty("environment.login"));
        //  app.getUserHelper().loggedInProcess();
        driver.get(PropertyLoader.loadProperty("environment.home"));
        app.getNavigateHelper().searchRepo();
        Assert.assertTrue(app.getAttributeHelper().valueFromLanguage("CSS") > 0);
    }
}
