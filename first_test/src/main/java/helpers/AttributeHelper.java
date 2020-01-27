package helpers;

import io.qameta.allure.Step;
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


    @Step("Take value from language")
    public int valueFromLanguage(String language){
        String stringValueOfLangeageName = repositoryPage.getValueFromLanguage(language);
        stringValueOfLangeageName = stringValueOfLangeageName.replaceAll(",","");
        int integerValueOfLanguage = Integer.parseInt(stringValueOfLangeageName);
        System.out.println(integerValueOfLanguage);
        return integerValueOfLanguage;

    }

    @Step("Take title from Twitter page")
    public String titleOfAccountTwitter(){
      return   twitterPage.checkNameOfAccountTwitter();
    }
    public boolean twitterConfirmedAccountImg(){
        return twitterPage.checkConfirmedAccountImg();
    }


}
