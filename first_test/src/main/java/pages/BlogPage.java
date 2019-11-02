package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlogPage {
    public static final String blogLogo = "//h1";


    WebDriverWait wait;
    public BlogPage (WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    @FindBy(xpath = blogLogo)
    private WebElement blogIdentificationsLogo;

    public String checkLogo(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(blogLogo)));
        return blogIdentificationsLogo.getText();
    }
}
