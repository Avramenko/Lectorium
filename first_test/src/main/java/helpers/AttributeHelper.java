package helpers;

import managers.AppManager;
import pages.PageManager;

public class AttributeHelper extends PageManager {

    public AttributeHelper() {super(AppManager.getWebDriver());}

    public String logoFromBlogPage(){
        return blogPage.checkLogo();
    }

    public String bioFieldValue() {
        return settingsPage.getTextFromBioField();
    }

    public String titleOfEmailsMenu(){
        return settingsPage.getEmailsMenuTitle();
    }

    public String errorMessage(){
        return settingsPage.getErrorMessage();
    }

}
