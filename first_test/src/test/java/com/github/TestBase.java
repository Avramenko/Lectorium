package com.github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BlogPage;
import pages.LoginPage;
import pages.PostLoginPage;
import pages.RepositoryPage;

import java.io.File;
import java.util.concurrent.TimeUnit;


class TestBase {

    WebDriver driver;
    WebDriverWait wait;
    BlogPage blogPage;
    LoginPage loginPage;
    PostLoginPage postLoginPage;
    RepositoryPage repositoryPage;

    @BeforeSuite()
    public void before(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable((File) driver)
                .usingAnyFreePort()
                .build();
        ChromeOptions options = new ChromeOptions().addArguments("--windows-size=1366,768");
        driver = new ChromeDriver(service, options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        blogPage = new BlogPage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        postLoginPage = new PostLoginPage(driver, wait);
        repositoryPage = new RepositoryPage(driver, wait);
    }

    @AfterSuite()
    public void close() {
        driver.quit();
    }

}