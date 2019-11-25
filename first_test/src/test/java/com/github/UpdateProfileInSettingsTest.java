package com.github;

import org.testng.Assert;
import org.testng.annotations.Test;
import util.PropertyLoader;

public class UpdateProfileInSettingsTest extends TestBase {

    @Test
    public void UpdateProfileSetting(){
        driver.get(PropertyLoader.loadProperty("environment.login"));
        app.getUserHelper().loggedInProsess();
        app.getNavigateHelper().clickSettingButton();
        app.getUserHelper().changeBioFieldText();
        Assert.assertEquals(app.getIdentifyHelper().bioFieldValue(), expectedTextFromBioField);

    }
}
