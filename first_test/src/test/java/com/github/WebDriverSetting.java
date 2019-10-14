package com.github;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetting {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Start");
    }

    @After
    public void close() {
        driver.quit();
    }

}