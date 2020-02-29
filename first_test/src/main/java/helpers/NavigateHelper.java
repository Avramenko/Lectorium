package helpers;

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
        aboutPage.clickToTwitterLink();
    }

    @Step("Navigate to Settings page")
    public void clickSettingButton() {
        postLoginPage.clickToProfileDropdown();
        postLoginPage.clickToSettingsButton();
    }

    @Step("Click to email button")
    public void clickEmailsButton(){
        settingsPage.clickToEmailsButton();
    }

    @Step("Enter to search value")
    public void searchRepo(){
        postLoginPage.enterToSearchValue(valueForSearch);
        postLoginPage.clickToFirstValueFromSearchResult();
    }

    @Step("Sort by most Stars")
    public void sortByMostStars(){
        searchResultPage.clickToSortButton();
        searchResultPage.clickToSortByMostStarsButton();
    }


}
