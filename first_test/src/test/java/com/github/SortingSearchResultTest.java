package com.github;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.AllureListener;
import util.PropertyLoader;

@Listeners(AllureListener.class)
public class SortingSearchResultTest extends TestBase {

    @Test

    public void sortingSearchResult(){
        //  driver.get(PropertyLoader.loadProperty("environment.login"));
        //  app.getUserHelper().loggedInProsess();
        driver.get(PropertyLoader.loadProperty("environment.home"));
       app.getNavigateHelper().searchRepo();
       app.getNavigateHelper().sortByMostStars();
    }
}
