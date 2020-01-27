package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AboutPage extends Page {

    public static final String LINK_TO_TWITTER = ".// a [@class = 'btn-mktg btn-outline-mktg']";

    AboutPage(PageManager pages) { super(pages); }

    @FindBy(xpath = LINK_TO_TWITTER)
    private WebElement linkToTwitter;

    public void clitToTwitterLink(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LINK_TO_TWITTER)));
        linkToTwitter.click();
    }
}
