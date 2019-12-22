package helpers;

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

    public void clickSettingButton() {
        postLoginPage.clickToProfileDropdown();
        postLoginPage.clickToSettingsButton();
    }

    public void clickEmailsButton(){
        settingsPage.clickToEmailsButton();
    }

    public void searchRepo(){
        postLoginPage.enterToSearchValue(valueForSearch);
    }

    public void sortByMostStars(){
        searchResultPage.clickToSortButton();
        searchResultPage.clickToSortByMostStarsButton();
    }


}
