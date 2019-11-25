package helpers;

import managers.AppManager;
import pages.PageManager;

public class FindElementHelper extends PageManager {


    public FindElementHelper(){super(AppManager.getWebDriver());}

    public int  amountOfAllFieles() {
        return repositoryPage.getAmountOfAllFileFromRepo();
    }

    public int  amountOfFieles(){
        return repositoryPage.getAmountOfFileFromRepo();
    }

    public int  amountOfFolders(){
        return repositoryPage.getAmountOfFolderFromRepo();
    }

}
