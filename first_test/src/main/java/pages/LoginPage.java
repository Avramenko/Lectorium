package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public static final String  FIELD_FOR_LOGIN = ".//input[@id = 'login_field']";
    public static final String FIELD_FOR_PASSWORD = ".//input[@id = 'password']";
    public static final String BUTTON_FOR_SINGIN = ".//input[@value = 'Sign in']";


    WebDriverWait wait;
    public LoginPage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    @FindBy(xpath = FIELD_FOR_LOGIN)
    private WebElement loginField;

    @FindBy(xpath = FIELD_FOR_PASSWORD)
    private  WebElement passwordField;

    @FindBy(xpath = BUTTON_FOR_SINGIN)
    private WebElement signInButton;

    public void enterFirstName(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FIELD_FOR_LOGIN)));
        loginField.clear();
        loginField.sendKeys(text);
    }

    public void enterPassword (String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FIELD_FOR_PASSWORD)));
        passwordField.clear();
        passwordField.sendKeys(text);
    }

    public void ClickLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BUTTON_FOR_SINGIN)));
        signInButton.click();
    }


}
