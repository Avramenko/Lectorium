package helpers;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import managers.AppManager;
import pages.PageManager;

public class NavigateHelper extends PageManager {

    public static final String valueForSearch = "Java";

    public NavigateHelper(){
        super(AppManager.getWebDriver());
    }

    public void clickBlogLink(){
        postLoginPage.clickToBlogLink();
    }

    public void clickFirstRepository(){
        postLoginPage.clickToFirstRepositories();
    }

    public void clickToAboutLink(){
        postLoginPage.clickToAboutLink();
    }

    public void clickToTwitterLink(){
        aboutPage.clitToTwitterLink();
    }

    @Step("Navigate to Settings page")
    public void clickSettingButton() {
        postLoginPage.clickToProfileDropdown();
        postLoginPage.clickToSettingsButton();
    }

    public void clickEmailsButton(){
        settingsPage.clickToEmailsButton();
    }

    @Step("Enter to search value")
    public void searchRepo(){
        postLoginPage.enterToSearchValue(valueForSearch);
    }

    @Step("Sort by most Stars")
    @Attachment
    public void sortByMostStars(){
        searchResultPage.clickToSortButton();
        searchResultPage.clickToSortByMostStarsButton();
    }


}
