package com.github;

import org.testng.Assert;
import org.testng.annotations.Test;
import util.PropertyLoader;

public class UpdateProfileTest extends TestBase {

    @Test
    public void UpdateProfileFields(){
        driver.get(PropertyLoader.loadProperty("environment.login"));
        app.getUserHelper().enterFirstName();
        app.getUserHelper().enterPassword();
        app.getUserHelper().clickLoginButton();
        app.getClickLinksHelper().clickProfileButton();
        app.getClickLinksHelper().clickSettingButton();
        app.getFindElementHelper().enterBioText();
        app.getClickLinksHelper().clickUpdateButton();
        app.getIdentifyPageHelper().checkBioText();
        Assert.assertEquals(app.getIdentifyPageHelper().checkBioText(), expectedTextFromBioField);

    }
}
