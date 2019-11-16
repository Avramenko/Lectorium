package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostLoginPage {

    public static final String LINK_TO_BLOG = ".//li[@class = 'mb-1']//a[text() = 'Blog']";
    public static final String TITLE_FROM_PAGE = ".//title[1]";
    public static final String LINK_TO_FIRST_REPOSITORY= ".//ul[@class = 'list-style-none']//li[1]";

    WebDriverWait wait;
    public PostLoginPage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver,this);
        this.wait = wait;
    }

    @FindBy(xpath = LINK_TO_BLOG)
    private WebElement blogLink;

    @FindBy(xpath = TITLE_FROM_PAGE)
    private WebElement titleOfPage;

    @FindBy(xpath = LINK_TO_FIRST_REPOSITORY)
    private WebElement firstRepository;

    public void ClickBlogLink(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LINK_TO_BLOG)));
        blogLink.click();
    }

    public String GetTitleOfPostLoginPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TITLE_FROM_PAGE)));
        return titleOfPage.getText();
    }

    public void ClickFirstRepositories(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LINK_TO_FIRST_REPOSITORY)));
        firstRepository.click();
    }

}
