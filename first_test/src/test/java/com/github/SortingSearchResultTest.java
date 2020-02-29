package com.github;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.TestListener;
import util.PropertyLoader;

@Listeners(TestListener.class)
public class SortingSearchResultTest extends TestBase {

    @Test
    @Description("Sorting by most stars in search result page")
    public void sortingSearchResult(){
        //  driver.get(PropertyLoader.loadProperty("environment.login"));
        //  app.getUserHelper().loggedInProcess();
        driver.get(PropertyLoader.loadProperty("environment.home"));
        app.getNavigateHelper().searchRepo();
        app.getNavigateHelper().sortByMostStars();
    }
}
