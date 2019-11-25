package com.github;

import managers.AppManager;
import managers.SingletonAppManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


class TestBase {

    AppManager app = SingletonAppManager.getInstance().manager;
    WebDriver driver = AppManager.getWebDriver();

    WebDriverWait wait;
  //  BlogPage blogPage;
  //  LoginPage loginPage;
  //  PostLoginPage postLoginPage;
  //  RepositoryPage repositoryPage;


    String expectedLogoBlog = "The GitHub Blog";
    String expectedHttpFromBlog = "https://github.blog/";
    String expectedTextFromBioField = "test";
    String expectedTitleOfEmailPage = "Emails";
    String expectedErrorMessageFromEmailField = "Error adding test.mail8120@gmail.com: email is already in use";

    @BeforeSuite()
    public void before(){
        wait = new WebDriverWait(driver, 10);
   //     blogPage = new BlogPage(driver, wait);
   //     loginPage = new LoginPage(driver, wait);
   //     postLoginPage = new PostLoginPage(driver, wait);
   //     repositoryPage = new RepositoryPage(driver, wait);
    }

    @AfterSuite()
    public void close() {
        driver.quit();
    }

}