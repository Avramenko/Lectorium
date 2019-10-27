package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public static String  loginField = ".//input[@id = 'login_field']";
    public static String passwordField = ".//input[@id = 'password']";
    public static final String signInButton = ".//input[@value = 'Sign in']";


    WebDriverWait wait;
    public LoginPage(WebDriver driver, WebDriverWait wait){
        PageFactory.initElements(driver, this);
        this.wait = wait;
    }

    @FindBy(xpath = signInButton)
    private WebElement loginProcess;

    public void enterFirstName(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginField)));
        loginProcess.clear();
        loginProcess.sendKeys();
    }

    public void enterPassword (String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordField)));
        loginProcess.clear();
        loginProcess.sendKeys();
    }

    public void ClickLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signInButton)));
        loginProcess.click();
    }


}
