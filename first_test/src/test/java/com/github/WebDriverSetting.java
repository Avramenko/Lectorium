package com.github;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.BlogPage;
import pages.LoginPage;
import pages.PostLoginPage;
import pages.RepositoryPage;

import java.util.concurrent.TimeUnit;

public class WebDriverSetting {

    ChromeDriver driver;
    WebDriverWait wait;
    BlogPage blogPage;
    LoginPage loginPage;
    PostLoginPage postLoginPage;
    RepositoryPage repositoryPage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        blogPage = new BlogPage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        postLoginPage = new PostLoginPage(driver, wait);
        repositoryPage = new RepositoryPage(driver, wait);
    }

    @AfterTest
    public void close() {
        driver.quit();
    }

}