package managers;

import helpers.NavigateHelper;
import helpers.FindElementHelper;
import helpers.IdentifyHelper;
import helpers.UserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import util.PropertyLoader;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AppManager {

    private NavigateHelper navigateHelper;
    private UserHelper userHelper;
    private IdentifyHelper identifyHelper;
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
        navigateHelper = new NavigateHelper();
        userHelper = new UserHelper();
        identifyHelper = new IdentifyHelper();
        findElementHelper = new FindElementHelper();
    }

    public static WebDriver getWebDriver(){return driver;}

    public NavigateHelper getNavigateHelper() {return navigateHelper;}
    public UserHelper getUserHelper(){return userHelper;}
    public IdentifyHelper getIdentifyHelper(){return identifyHelper;}
    public FindElementHelper getFindElementHelper() {return findElementHelper;}
}
