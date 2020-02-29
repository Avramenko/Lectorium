package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PostLoginPage extends Page {

    public static final String LINK_TO_BLOG = ".//li[@class = 'mb-1']//a[text() = 'Blog']";
    public static final String NICKNAME_OF_ACCOUNT = ".//a/strong";
    public static final String LINK_TO_FIRST_REPOSITORY= ".//ul[@class = 'list-style-none']//li[1]";
    public static final String LOCATOR_PROFILE_DROPDOWN = ".//summary[@aria-label = 'View profile and more']";
    public static final String LOCATOR_SETTING_BUTTON = ".//a [@href = '/settings/profile']";
    public static final String LOCATOR_SEARCH_FIELD = "//input[@name='q']";
    public static final String LOCATOR_ABOUT_LINK = ".//li[@class = 'mb-1']//a[text() = 'About']";
    public static final String LOCATOR_FIRST_VALUE_FROM_SEARCH_RESULT_DROPDOWN = "(id('jump-to-results')/li)[2]";

    public PostLoginPage(PageManager pages) {super(pages);}

    @FindBy(xpath = LINK_TO_BLOG)
    private WebElement blogLink;

    @FindBy(xpath = NICKNAME_OF_ACCOUNT)
    private WebElement nicknameOfAccount;

    @FindBy(xpath = LINK_TO_FIRST_REPOSITORY)
    private WebElement firstRepository;

    @FindBy(xpath = LOCATOR_PROFILE_DROPDOWN)
    private WebElement profileDropdown;

    @FindBy(xpath = LOCATOR_SETTING_BUTTON)
    private WebElement settingButton;

    @FindBy(xpath = LOCATOR_SEARCH_FIELD)
    private WebElement searchfield;

    @FindBy(xpath = LOCATOR_ABOUT_LINK)
    private WebElement aboutLink;

    @FindBy(xpath = LOCATOR_FIRST_VALUE_FROM_SEARCH_RESULT_DROPDOWN)
    private WebElement firstValueFromSearchResult;

    @Step("Find blog link")
    public void clickToBlogLink(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LINK_TO_BLOG)));
        blogLink.click();
    }

    @Step("Find about link")
    public void clickToAboutLink(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATOR_ABOUT_LINK)));
        aboutLink.click();
    }

    @Step("Find nickname of account")
    public String GetNicknameOfLoggedInAccount(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NICKNAME_OF_ACCOUNT)));
        return nicknameOfAccount.getText();
    }

    @Step("Find first repository")
    public void clickToFirstRepositories(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LINK_TO_FIRST_REPOSITORY)));
        firstRepository.click();
    }

    @Step("Find profile dropdown")
    public void clickToProfileDropdown(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATOR_PROFILE_DROPDOWN)));
        profileDropdown.click();
    }

    @Step("Find settings button")
    public void clickToSettingsButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATOR_SETTING_BUTTON)));
        settingButton.click();
    }

    @Step("Find search field")
    public void enterToSearchValue(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATOR_SEARCH_FIELD)));
        searchfield.click();
        searchfield.sendKeys(text);
    }

    @Step("Find first value from search result")
    public void clickToFirstValueFromSearchResult(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATOR_FIRST_VALUE_FROM_SEARCH_RESULT_DROPDOWN)));
        firstValueFromSearchResult.click();
    }


}
