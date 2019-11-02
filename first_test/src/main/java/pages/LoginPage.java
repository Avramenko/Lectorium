package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public static final String  fieldForLogin = ".//input[@id = 'login_field']";
    public static final String fieldForPassword = ".//input[@id = 'password']";
    public static final String buttonForsignIn = ".//input[@value = 'Sign in']";


    WebDriverWait wait;
    public LoginPage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    @FindBy(xpath = fieldForLogin)
    private WebElement loginField;

    @FindBy(xpath = fieldForPassword)
    private  WebElement passwordField;

    @FindBy(xpath = buttonForsignIn)
    private WebElement signInButton;

    public void enterFirstName(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fieldForLogin)));
        loginField.clear();
        loginField.sendKeys();
    }

    public void enterPassword (String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fieldForPassword)));
        passwordField.clear();
        passwordField.sendKeys();
    }

    public void ClickLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(buttonForsignIn)));
        signInButton.click();
    }


}
