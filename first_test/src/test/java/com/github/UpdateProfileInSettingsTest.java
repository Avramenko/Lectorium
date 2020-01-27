package com.github;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.AllureListener;
import util.PropertyLoader;

@Listeners(AllureListener.class)
public class UpdateProfileInSettingsTest extends TestBase {

    @Test

    public void UpdateProfileSetting(){
        //  driver.get(PropertyLoader.loadProperty("environment.login"));
        //  app.getUserHelper().loggedInProsess();
        driver.get(PropertyLoader.loadProperty("environment.home"));
        app.getNavigateHelper().clickSettingButton();
        app.getUserHelper().changeBioFieldText();
        Assert.assertEquals(app.getAttributeHelper().bioFieldValue(), expectedTextFromBioField);

    }
}
