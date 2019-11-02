package com.github;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BlogPage;

import java.util.concurrent.TimeUnit;

public class WebDriverSetting {

    public ChromeDriver driver;
    WebDriverWait wait;
    BlogPage blogPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        blogPage = new BlogPage(driver, wait);

    }

    @After
    public void close() {
        driver.quit();
    }

}