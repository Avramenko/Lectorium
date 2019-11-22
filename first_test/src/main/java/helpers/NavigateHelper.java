package helpers;

import managers.AppManager;
import pages.PageManager;

public class NavigateHelper extends PageManager {

    public NavigateHelper(){
        super(AppManager.getWebDriver());
    }


    public void clickBlogLink(){
        postLoginPage.clickToBlogLink();
    }

    public void clickFirstRepository(){
        postLoginPage.clickToFirstRepositories();
    }

    public void clickSettingButton() {
        postLoginPage.clickToProfileDropdown();
        postLoginPage.clickToSettingsButton();
    }

    public void clickEmailsButton(){
        settingsPage.clickToEmailsButton();
    }


}
