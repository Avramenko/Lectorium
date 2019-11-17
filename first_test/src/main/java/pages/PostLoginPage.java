package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PostLoginPage extends Page {

    public static final String LINK_TO_BLOG = ".//li[@class = 'mb-1']//a[text() = 'Blog']";
    public static final String TITLE_FROM_PAGE = ".//title[1]";
    public static final String LINK_TO_FIRST_REPOSITORY= ".//ul[@class = 'list-style-none']//li[1]";

    public PostLoginPage(PageManager pages) {super(pages);}

    @FindBy(xpath = LINK_TO_BLOG)
    private WebElement blogLink;

    @FindBy(xpath = TITLE_FROM_PAGE)
    private WebElement titleOfPage;

    @FindBy(xpath = LINK_TO_FIRST_REPOSITORY)
    private WebElement firstRepository;

    public void clickToBlogLink(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LINK_TO_BLOG)));
        blogLink.click();
    }

    public String GetTitleOfPostLoginPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TITLE_FROM_PAGE)));
        return titleOfPage.getText();
    }

    public void clickToFirstRepositories(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LINK_TO_FIRST_REPOSITORY)));
        firstRepository.click();
    }

}
