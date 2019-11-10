package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RepositoryPage {

    public static final String FILE_FROM_REPOSITORY = ".//tr[@class ='js-navigation-item']";

    WebDriverWait wait;
    public RepositoryPage (WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    @FindBy (xpath = FILE_FROM_REPOSITORY)
    private WebElement repositoryFile;

    public int CountFiles(){
        List<WebElement> listOfFile = repositoryFile.findElements(By.xpath(FILE_FROM_REPOSITORY));
        int numberOfFiles = listOfFile.size();
        return numberOfFiles;
    }


}
