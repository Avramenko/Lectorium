package com.github;

import org.testng.Assert;
import org.testng.annotations.Test;
import util.PropertyLoader;

public class AddExistingEmailInSettings extends TestBase {

    @Test
    public void AddExistingEmailInSettings(){
        driver.get(PropertyLoader.loadProperty("environment.login"));
        app.getUserHelper().loggedInProsess();
        app.getNavigateHelper().clickSettingButton();
        app.getNavigateHelper().clickEmailsButton();
        Assert.assertEquals(app.getIdentifyHelper().titleOfEmailsMenu(), expectedTitleOfEmailPage);
        app.getUserHelper().addExistingEmail();
        Assert.assertEquals(app.getIdentifyHelper().errorMessage(), expectedErrorMessageFromEmailField);
    }
}
