package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SettingsPage extends Page {

    public static final String LOCATOR_BIO_FIELD = ".//textarea";
    public static final String LOCATOR_UPDATE_PROFILE_BUTTON = ".//button[@class = 'btn btn-primary']";
    public static final String LOCATOR_EMAIL_BUTTON = ".//nav[@class = 'menu position-relative']//a[5]";
    public static final String LOCATOR_TITLE_OF_EMAILS_MENU = ".//h2[text() = 'Emails']";
    public static final String LOCATOR_ADD_EMAIL_ADDRESS_FIELD = ".//input[@id = 'email']";
    public static final String LOCATOR_ADD_BUTTON_FOR_EMAIL = ".//button [@type = 'submit' and text() = 'Add']";
    public static final String LOCATOR_ERROR_MESSAGE = ".//div [@class = 'flash flash-full flash-error']";

    SettingsPage(PageManager pages) { super(pages); }

    @FindBy (xpath = LOCATOR_BIO_FIELD)
    private WebElement bioField;

    @FindBy (xpath = LOCATOR_UPDATE_PROFILE_BUTTON)
    private WebElement updateProfileButton;

    @FindBy(xpath = LOCATOR_EMAIL_BUTTON)
    private WebElement emailMenuButton;

    @FindBy(xpath = LOCATOR_TITLE_OF_EMAILS_MENU)
    private WebElement titleOfEmailsMenu;

    @FindBy(xpath = LOCATOR_ADD_EMAIL_ADDRESS_FIELD)
    private WebElement emailAddressField;

    @FindBy(xpath = LOCATOR_ADD_BUTTON_FOR_EMAIL)
    private WebElement addButtonForEmail;

    @FindBy(xpath = LOCATOR_ERROR_MESSAGE)
    private WebElement errorMessage;

    @Step("Find bio field")
    public void enterToBioField(String text){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATOR_BIO_FIELD)));
        bioField.clear();
        bioField.sendKeys(text);
    }

    @Step("Find update button")
    public void clickToUpdateButton(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATOR_UPDATE_PROFILE_BUTTON)));
        updateProfileButton.click();
    }

    @Step("Find value from bio field")
    public String getTextFromBioField(){
        return bioField.getText();
    }

    @Step("Find email button")
    public void clickToEmailsButton(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATOR_UPDATE_PROFILE_BUTTON)));
        emailMenuButton.click();
    }

    @Step("Find emails menu title")
    public String getEmailsMenuTitle(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATOR_TITLE_OF_EMAILS_MENU)));
        return titleOfEmailsMenu.getText(); //check for helpers(remove every getText, size etc. methods to helpers)
    }

    @Step("Find email address field")
    public void enterEmailValue(String email){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATOR_ADD_EMAIL_ADDRESS_FIELD)));
        emailAddressField.clear();
        emailAddressField.sendKeys(email);
    }

    @Step("Find add button from email")
    public void clickToAddButtonForEmail(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATOR_ADD_BUTTON_FOR_EMAIL)));
        addButtonForEmail.click();
    }

    @Step("Find error message for existing email")
    public String getErrorMessage(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATOR_ERROR_MESSAGE)));
        return errorMessage.getText();
    }

}
