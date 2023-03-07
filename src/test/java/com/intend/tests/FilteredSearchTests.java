package com.intend.tests;

import com.intend.pages.FilteredSearchPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.intend.pages.SearchResultsPage;
import com.intend.pages.FilteredSearchPage;

import static com.intend.pages.HomepageSearchPage.HOME_URL;

public class FilteredSearchTests extends BaseTest{
    @Test
    public void filterSearchResults(){
        FilteredSearchPage filteredSearchPage = new FilteredSearchPage(driver);
        filteredSearchPage.checkStocMagazinCheckBox();
        filteredSearchPage.returnCurrentUrl();
        Assert.assertTrue(filteredSearchPage.returnCurrentUrl().contains("stoc-pret"));


    }

}
