package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends Page {

    public static final String  FIELD_FOR_LOGIN = ".//input[@id = 'login_field']";
    public static final String FIELD_FOR_PASSWORD = ".//input[@id = 'password']";
    public static final String BUTTON_FOR_SINGIN = ".//input[@value = 'Sign in']";


    @FindBy(xpath = FIELD_FOR_LOGIN)
    private WebElement loginField;

    @FindBy(xpath = FIELD_FOR_PASSWORD)
    private  WebElement passwordField;

    @FindBy(xpath = BUTTON_FOR_SINGIN)
    private WebElement signInButton;

    LoginPage(PageManager pages) { super(pages); }

    @Step("EnterFirstName")

    public void enterToFirstName(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FIELD_FOR_LOGIN)));
        loginField.clear();
        loginField.sendKeys(text);
    }

    public void enterToPassword(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FIELD_FOR_PASSWORD)));
        passwordField.clear();
        passwordField.sendKeys(text);
    }

    public void clickToLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BUTTON_FOR_SINGIN)));
        signInButton.click();
    }


}
