package helpers;

import pages.PageManager;
import managers.AppManager;

public class UserHelper extends PageManager {

    public static final String userNameValue = "testQA8120";
    public static final String passwordValue = "TestQwe123rty";
    public static final String TEXT_TO_BIO_FIELD = "test";
    public static final String EXISTING_EMAIL = "test.mail8120@gmail.com";

    public UserHelper(){
        super(AppManager.getWebDriver());
    }

    public void loggedInProsess(){
        loginPage.enterToFirstName(userNameValue);
        loginPage.enterToPassword(passwordValue);
        loginPage.clickToLoginButton();
    }

    public void changeBioFieldText(){
        settingsPage.clickToUpdateButton();
        settingsPage.enterToBioField(TEXT_TO_BIO_FIELD);
        settingsPage.clickToUpdateButton();
    }

    public void addExistingEmail(){
        settingsPage.enterEmailValue(EXISTING_EMAIL);
        settingsPage.clickToAddButtonForEmail();
    }

}
