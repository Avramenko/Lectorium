package com.github;

import org.testng.Assert;
import org.testng.annotations.Test;
import util.PropertyLoader;

public class CheckValueFromProgrammLanguageTest extends TestBase {

    @Test
    public void checkValueFromProgramLanguage (){
        driver.get(PropertyLoader.loadProperty("environment.login"));
        app.getUserHelper().loggedInProsess();
        app.getNavigateHelper().searchRepo();
        Assert.assertTrue(app.getAttributeHelper().valueFromLanguage("CSS") > 0);
    }
}
