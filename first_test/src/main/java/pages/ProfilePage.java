package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfilePage extends Page {

    public static final String LOCATOR_BIO_FIELD = ".//textarea";
    public static final String LOCATOR_UPDATE_PROFILE_BUTTON = ".//button[@class = 'btn btn-primary' ]";

    ProfilePage(PageManager pages) { super(pages); }

    @FindBy (xpath = LOCATOR_BIO_FIELD)
    private WebElement bioField;

    @FindBy (xpath = LOCATOR_UPDATE_PROFILE_BUTTON)
    private WebElement updateProfileButton;

    public void enterToBioField(String text){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATOR_BIO_FIELD)));
        bioField.clear();
        bioField.sendKeys(text);
    }

    public void clickToUpdateButton(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATOR_UPDATE_PROFILE_BUTTON)));
        updateProfileButton.click();
    }

    public String checkToBioText(){
        return (bioField.getText());
    }

}
