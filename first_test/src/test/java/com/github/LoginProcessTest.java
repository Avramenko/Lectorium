package com.github;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.PropertyLoader;
import util.TestListener;

@Listeners(TestListener.class)
public class LoginProcessTest extends TestBase {

    @Test
    @Description("login process")
    public void loginProcessTest(){
        driver.get(PropertyLoader.loadProperty("environment.login"));
        app.getUserHelper().loggedInProcess();
        Assert.assertEquals(driver.getCurrentUrl(), expectedHttpFromPostloginPage);
        Assert.assertEquals(app.getUserHelper().nicknameOfAccount(), expectedNicknameOfAccount);
    }
}
