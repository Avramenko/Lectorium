package com.github;


import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.TestListener;
import util.PropertyLoader;

@Listeners(TestListener.class)
public class UpdateProfileInSettingsTest extends TestBase {

    @Test
    @Description("Update bio value in the setting page")
    public void updateProfileSetting(){
        //  driver.get(PropertyLoader.loadProperty("environment.login"));
        //  app.getUserHelper().loggedInProcess();
        driver.get(PropertyLoader.loadProperty("environment.home"));
        app.getNavigateHelper().clickSettingButton();
        app.getUserHelper().changeBioFieldText();
        Assert.assertEquals(app.getAttributeHelper().bioFieldValue(), expectedTextFromBioField);

    }
}
