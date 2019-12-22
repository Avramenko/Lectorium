package com.github;

import org.testng.annotations.Test;
import util.PropertyLoader;

public class SortingSearchResultTest extends TestBase {

    @Test
    public void sortingSearchResult(){
       driver.get(PropertyLoader.loadProperty("environment.login"));
       app.getUserHelper().loggedInProsess();
       app.getNavigateHelper().searchRepo();
       app.getNavigateHelper().sortByMostStars();
    }
}
