package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RepositoryPage extends Page {

    public static final String ALL_FILES_FROM_REPOSITORY = ".//tr[@class ='js-navigation-item']";
    public static final String FOLDERS_FROM_REPOSITORY = ".//tr[@class ='js-navigation-item']//*[@aria-label = 'directory']";
    public static final String FILES_FROM_REPOSITORY = ".//tr[@class ='js-navigation-item']//*[@aria-label = 'file']";

    RepositoryPage(PageManager pages) {
        super(pages);
    }

    @FindBy (xpath = ALL_FILES_FROM_REPOSITORY)
    private WebElement repositoryAllFiles;

    @FindBy (xpath = FILES_FROM_REPOSITORY)
    private WebElement repositoryFiles;

    @FindBy (xpath = FOLDERS_FROM_REPOSITORY)
    private WebElement repositoryFolders;

    public String allFileLocator(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(ALL_FILES_FROM_REPOSITORY)));
        return (ALL_FILES_FROM_REPOSITORY);
    }

    public String fileLocator(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(FILES_FROM_REPOSITORY)));
        return (FILES_FROM_REPOSITORY);
    }

    public String folderLocator(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(FOLDERS_FROM_REPOSITORY)));
        return (FOLDERS_FROM_REPOSITORY);
    }



    /*public String GetFilesFromRepository(){
        List<WebElement> listOfFile = repositoryFile.findElements(By.xpath(FILE_FROM_REPOSITORY));
        return FILE_FROM_REPOSITORY;
    }*/


}
