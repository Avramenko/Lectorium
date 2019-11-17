package helpers;

import managers.AppManager;
import pages.PageManager;

public class FindElementHelper extends PageManager {

    public static final String TEXT_TO_BIO_FIELD = "test";

    public FindElementHelper(){super(AppManager.getWebDriver());}

    public String  getAllFielesFromRepo() {
        return (repositoryPage.allFileLocator());
    }

    public String  getFielesFromRepo(){
        return (repositoryPage.fileLocator());
    }

    public String  getFoldersFromRepo(){
        return  (repositoryPage.folderLocator());
    }

    public void enterBioText() { profilePage.enterToBioField(TEXT_TO_BIO_FIELD);}


}
