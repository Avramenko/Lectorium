package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostLoginPage {

    public static final String linkToBlog = ".//li[@class = 'mb-1']//a[text() = 'Blog']";
    public static final String titleFromPage = ".//title[1]";

    WebDriverWait wait;
    public PostLoginPage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver,this);
        this.wait = wait;
    }

    @FindBy(xpath = linkToBlog)
    private WebElement blogLink;

    @FindBy(xpath = titleFromPage)
    private WebElement titleOfPage;

    public void ClickBlogLink(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(linkToBlog)));
        blogLink.click();
    }

    public String GetTitleOfPostLoginPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(titleFromPage)));
        return titleOfPage.getText();
    }

}
