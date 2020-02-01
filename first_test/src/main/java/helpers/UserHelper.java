package helpers;

import io.qameta.allure.Step;
import managers.AppManager;
import pages.PageManager;

public class UserHelper extends PageManager {

    public static final String userNameValue = "testQA8120";
    public static final String passwordValue = "TestQwe123rty";
    public static final String EXISTING_EMAIL = "test.mail8120@gmail.com";

    public UserHelper(){
        super(AppManager.getWebDriver());
    }

    @Step("Fill the username, password fields and click the login button")
    public void loggedInProcess(){ //TODO process +
        loginPage.enterToFirstName(userNameValue);
        loginPage.enterToPassword(passwordValue);
        loginPage.clickToLoginButton();
    }

    @Step("Change the bio value")
    public void changeBioFieldText(){
        settingsPage.clickToUpdateButton();
        settingsPage.enterToBioField("test"); //TODO remove consts +
        settingsPage.clickToUpdateButton();
    }

    @Step("Add existing email")
    public void addExistingEmail(){
        settingsPage.enterEmailValue(EXISTING_EMAIL);
        settingsPage.clickToAddButtonForEmail();
    }

    @Step("Take the nickname of account")
    public String nicknameOfAccount(){
        postLoginPage.clickToProfileDropdown();
        return postLoginPage.GetNicknameOfLoggedInAccount();
    }


}
