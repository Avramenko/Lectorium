package managers;

import helpers.ClickLinksHelper;
import helpers.FindElementHelper;
import helpers.IdentifyPageHelper;
import helpers.UserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import util.PropertyLoader;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AppManager {

    private ClickLinksHelper clickLinksHelper;
    private UserHelper userHelper;
    private IdentifyPageHelper identifyPageHelper;
    private FindElementHelper findElementHelper;

    private static WebDriver driver;

    AppManager(){
        File chromeDriver = new File(PropertyLoader.loadProperty("chrome.driver.path"));
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(chromeDriver)
                .usingAnyFreePort()
                .build();
        ChromeOptions options = new ChromeOptions().addArguments("--windows-size=1366,768");
        driver = new ChromeDriver(service, options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        clickLinksHelper = new ClickLinksHelper();
        userHelper = new UserHelper();
        identifyPageHelper = new IdentifyPageHelper();
        findElementHelper = new FindElementHelper();
    }

    public static WebDriver getWebDriver(){return driver;}

    public ClickLinksHelper getClickLinksHelper() {return clickLinksHelper;}
    public UserHelper getUserHelper(){return userHelper;}
    public IdentifyPageHelper getIdentifyPageHelper(){return identifyPageHelper;}
    public FindElementHelper getFindElementHelper() {return findElementHelper;}
}
