package com.github;

import org.testng.Assert;
import org.testng.annotations.Test;
import util.PropertyLoader;

public class AddExistingEmailInSettingsTest extends TestBase {

    @Test
    public void AddExistingEmailInSettings(){
        driver.get(PropertyLoader.loadProperty("environment.login"));
        app.getUserHelper().loggedInProsess();
        app.getNavigateHelper().clickSettingButton();
        app.getNavigateHelper().clickEmailsButton();
        Assert.assertEquals(app.getAttributeHelper().titleOfEmailsMenu(), expectedTitleOfEmailPage);
        app.getUserHelper().addExistingEmail();
        Assert.assertEquals(app.getAttributeHelper().errorMessage(), expectedErrorMessageFromEmailField);
    }
}
