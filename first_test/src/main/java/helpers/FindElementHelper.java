package helpers;

import managers.AppManager;
import pages.PageManager;

public class FindElementHelper extends PageManager {

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
}
