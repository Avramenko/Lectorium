package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TwitterPage extends Page {

    public static final String  NAME_OF_ACCOUNT_TWITTER = "(.//div [@dir = 'auto']//span//span[text() = 'GitHub'][1])[1]";
    public static final String CONFIRMED_ACCOUNT_IMG = "(.//div [@dir = 'auto']//span[2])[1]"; //TODO

    TwitterPage(PageManager pages) { super(pages); }

    @FindBy(xpath = NAME_OF_ACCOUNT_TWITTER)
    private WebElement nameOfAccountTwitter;

    @FindBy(xpath = CONFIRMED_ACCOUNT_IMG)
    private WebElement confirmedAccountIng;

    @Step("Find account name in twitter")
    public String checkNameOfAccountTwitter(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NAME_OF_ACCOUNT_TWITTER)));
        return nameOfAccountTwitter.getText();
    }

    @Step("Find confirmed account img")
    public boolean checkConfirmedAccountImg(){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CONFIRMED_ACCOUNT_IMG)));
            return true;
        } catch (TimeoutException e){
            return false;
        }
    }
}
