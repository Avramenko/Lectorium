package com.github;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.PropertyLoader;
import util.TestListener;


@Listeners(TestListener.class)
public class AddExistingEmailInSettingsTest extends TestBase {

    @Test
    @Description("Add existing Email in settings page")
    public void addExistingEmailInSettings(){
        //  driver.get(PropertyLoader.loadProperty("environment.login"));
        //  app.getUserHelper().loggedInProcess();
        driver.get(PropertyLoader.loadProperty("environment.home"));
        app.getNavigateHelper().clickSettingButton();
        app.getNavigateHelper().clickEmailsButton();
        Assert.assertEquals(app.getAttributeHelper().titleOfEmailsMenu(), expectedTitleOfEmailPage);
        app.getUserHelper().addExistingEmail();
        Assert.assertEquals(app.getAttributeHelper().errorMessage(), expectedErrorMessageFromEmailField);
    }
}
