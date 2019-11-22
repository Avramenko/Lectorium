package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

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

    public int getAmountOfAllFileFromRepo(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(ALL_FILES_FROM_REPOSITORY)));
        List<WebElement> listOfAllFiles = driver.findElements(By.xpath(ALL_FILES_FROM_REPOSITORY));
        return listOfAllFiles.size();
    }

    public int getAmountOfFileFromRepo(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(FILES_FROM_REPOSITORY)));
        List<WebElement> listOfFiles = driver.findElements(By.xpath(FILES_FROM_REPOSITORY));
        return listOfFiles.size();
    }

    public int getAmountOfFolderFromRepo(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(FOLDERS_FROM_REPOSITORY)));
        List<WebElement> ListOfFolders = driver.findElements(By.xpath(FOLDERS_FROM_REPOSITORY));
        return ListOfFolders.size();
    }






}
