package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchResultPage extends Page {

    public static final String SORT_BUTTON_LOCATOR = ".// summary [@class= 'btn btn-sm select-menu-button']";
    public static final String SORT_BY_MOST_STARS_BUTTON_LOCATOR  = ".// a [@role = 'menuitemradio'][2]";
    public static final String STARS_OF_REPO_LOCATOR = ".//  a [@class='muted-link']";

    SearchResultPage(PageManager pages) {super(pages);}

    @FindBy (xpath = SORT_BUTTON_LOCATOR)
    private WebElement sortButton;

    @FindBy (xpath = SORT_BY_MOST_STARS_BUTTON_LOCATOR)
    private WebElement sortByMostStarsButton;

    @FindBy (xpath = STARS_OF_REPO_LOCATOR)
    private WebElement starsOfRepo;

    @Step("Find sort button")
    public void clickToSortButton(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(SORT_BUTTON_LOCATOR)));
        sortButton.click();
    }

    @Step("Find Sort by most stars option")
    public void clickToSortByMostStarsButton(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(SORT_BY_MOST_STARS_BUTTON_LOCATOR)));
        sortByMostStarsButton.click();
    }

    @Step("Find value from stars")
    public List<WebElement> checkValueFromStars(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(STARS_OF_REPO_LOCATOR)));
       return driver.findElements(By.xpath(STARS_OF_REPO_LOCATOR));
    }
}
