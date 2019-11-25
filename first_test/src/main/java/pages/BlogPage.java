package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BlogPage extends Page {
    public static final String BLOG_LOGO = "//h1";

    BlogPage(PageManager pages) { super(pages); }

    @FindBy(xpath = BLOG_LOGO)
    private WebElement blogIdentificationsLogo;

    public String checkLogo(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BLOG_LOGO)));
        return blogIdentificationsLogo.getText();
    }
}
