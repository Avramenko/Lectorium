package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RepositoryPage {

    public static final String ALL_FILES_FROM_REPOSITORY = ".//tr[@class ='js-navigation-item']";
    public static final String FOLDERS_FROM_REPOSITORY = ".//tr[@class ='js-navigation-item']//*[@aria-label = 'directory']";
    public static final String FILES_FROM_REPOSITORY = ".//tr[@class ='js-navigation-item']//*[@aria-label = 'file']";

    WebDriverWait wait;
    public RepositoryPage (WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    @FindBy (xpath = ALL_FILES_FROM_REPOSITORY)
    private WebElement repositoryAllFiles;

    @FindBy (xpath = FILES_FROM_REPOSITORY)
    private WebElement repositoryFiles;

    @FindBy (xpath = FOLDERS_FROM_REPOSITORY)
    private WebElement repositoryFolders;



    /*public String GetFilesFromRepository(){
        List<WebElement> listOfFile = repositoryFile.findElements(By.xpath(FILE_FROM_REPOSITORY));
        return FILE_FROM_REPOSITORY;
    }*/


}
