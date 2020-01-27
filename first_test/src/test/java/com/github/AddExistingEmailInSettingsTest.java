package com.github;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.AllureListener;
import util.PropertyLoader;


@Listeners(AllureListener.class)
public class AddExistingEmailInSettingsTest extends TestBase {

    @Test

    public void AddExistingEmailInSettings(){
        //  driver.get(PropertyLoader.loadProperty("environment.login"));
        //  app.getUserHelper().loggedInProsess();
        driver.get(PropertyLoader.loadProperty("environment.home"));
        app.getNavigateHelper().clickSettingButton();
        app.getNavigateHelper().clickEmailsButton();
        Assert.assertEquals(app.getAttributeHelper().titleOfEmailsMenu(), expectedTitleOfEmailPage);
        app.getUserHelper().addExistingEmail();
        Assert.assertEquals(app.getAttributeHelper().errorMessage(), expectedErrorMessageFromEmailField);
    }
}
