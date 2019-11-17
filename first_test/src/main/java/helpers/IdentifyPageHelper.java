package helpers;

import managers.AppManager;
import pages.PageManager;

public class IdentifyPageHelper extends PageManager {

    public IdentifyPageHelper() {super(AppManager.getWebDriver());}

    public String checkLogoFromBlogPage(){
       return (blogPage.checkLogo());
    }

    public String checkBioText() {return (profilePage.checkToBioText());}
}
