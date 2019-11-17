package helpers;

import managers.AppManager;
import pages.PageManager;

public class ClickLinksHelper extends PageManager {

    public ClickLinksHelper(){
        super(AppManager.getWebDriver());
    }

    public void clickBlogLink(){
        postLoginPage.clickToBlogLink();
    }

    public void clickFirstRepository(){postLoginPage.clickToFirstRepositories();}

    public void clickProfileButton() {postLoginPage.clickToProfileDropdown();}

    public void clickSettingButton() {postLoginPage.clickToSettingsButton();}

    public void clickUpdateButton() {profilePage.clickToUpdateButton();}
}
