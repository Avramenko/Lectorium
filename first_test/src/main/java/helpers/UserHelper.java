package helpers;

import pages.PageManager;
import managers.AppManager;

public class UserHelper extends PageManager {

    String userNameValue = "testQA8120";
    String passwordValue = "TestQwe123rty";

    public UserHelper(){
        super(AppManager.getWebDriver());
    }

    public void enterFirstName(){
        loginPage.enterToFirstName(userNameValue);
    }

    public void enterPassword(){
        loginPage.enterToPassword(passwordValue);
    }

    public void clickLoginButton(){
        loginPage.clickToLoginButton();
    }

}
