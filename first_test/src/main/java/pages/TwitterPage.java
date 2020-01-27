package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TwitterPage extends Page {

    public static final String  NAME_OF_ACCOUNT_TWITTER = "(.//div [@dir = 'auto']//span//span[text() = 'GitHub'][1])[1]";
    public static final String  CONFIRMED_ACCOUT_IMG = "(.//div [@dir = 'auto']//span[2])[1]";

    TwitterPage(PageManager pages) { super(pages); }

    @FindBy(xpath = NAME_OF_ACCOUNT_TWITTER)
    private WebElement nameOfAccountTwitter;

    @FindBy(xpath = CONFIRMED_ACCOUT_IMG)
    private WebElement confirmedAccountIng;

    public String checkNameOfAccountTwitter(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NAME_OF_ACCOUNT_TWITTER)));
        return nameOfAccountTwitter.getText();
    }

    public boolean checkConfirmedAccountImg(){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CONFIRMED_ACCOUT_IMG)));
            return true;
        } catch (TimeoutException e){
            return false;
        }
    }
}
