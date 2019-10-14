package com.github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;


import tv.PropertyLoader;

import java.io.File;

class TestBase {

    private File chromeDriver = new File(Property)              // No idea how to read from property file
    private ChromeDriverService service = new ChromeDriverService.Builder()
            .usingDriverExecutable(chromeDriver)
            .usingAnyFreePort()
            .build();
    private ChromeOptions options = new ChromeOptions().addArguments("--windows-size=1366,768");
    WebDriver driver = new ChromeDriver(service, options);
}