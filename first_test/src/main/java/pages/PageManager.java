package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager {

    private WebDriver driver;
    protected PostLoginPage postLoginPage;
    protected LoginPage loginPage;
    protected BlogPage blogPage;
    protected RepositoryPage repositoryPage;
    protected SettingsPage settingsPage;
    protected SearchResultPage searchResultPage;
    protected AboutPage aboutPage;
    protected TwitterPage twitterPage;

    public PageManager(WebDriver driver){
        this.driver = driver;
        postLoginPage = initElements(new PostLoginPage(this));
        loginPage = initElements(new LoginPage(this));
        blogPage = initElements(new BlogPage(this));
        repositoryPage = initElements(new RepositoryPage(this));
        settingsPage = initElements(new SettingsPage(this));
        searchResultPage = initElements(new SearchResultPage(this));
        aboutPage = initElements(new AboutPage(this));
        twitterPage = initElements(new TwitterPage(this));
    }

    private <T extends Page> T initElements(T page){
        PageFactory.initElements(driver, page);
        return page;
    }

    WebDriver getDriver() {return driver;}
}
