package helpers;

import io.qameta.allure.Step;
import managers.AppManager;
import pages.PageManager;

public class AttributeHelper extends PageManager {

    public AttributeHelper() {
        super(AppManager.getWebDriver());
    }

    public String logoFromBlogPage() {
        return blogPage.checkLogo();
    }

    public String bioFieldValue() {
        return settingsPage.getTextFromBioField();
    }

    public String titleOfEmailsMenu() {
        return settingsPage.getEmailsMenuTitle();
    }

    public String errorMessage() {
        return settingsPage.getErrorMessage();
    }


    @Step("Take value from language")
    public int valueFromLanguage(String language) {
        String stringValueOfLanguageName = repositoryPage.getValueFromLanguage(language);
        stringValueOfLanguageName = stringValueOfLanguageName.replaceAll(",", "");
        return Integer.parseInt(stringValueOfLanguageName);

    }

    @Step("Take title from Twitter page")
    public String titleOfAccountTwitter() {
        return twitterPage.checkNameOfAccountTwitter();
    }

    @Step("Take confirmed account img")
    public boolean twitterConfirmedAccountImg() {
        return twitterPage.checkConfirmedAccountImg();
    }


}
