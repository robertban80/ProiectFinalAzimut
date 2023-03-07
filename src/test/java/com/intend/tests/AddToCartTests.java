package com.intend.tests;

import com.intend.pages.FilteredSearchPage;
import org.testng.annotations.Test;

public class AddToCartTests extends BaseTest{
    @Test
    public void addItemsToCart(){
        FilteredSearchPage filteredSearchPage = new FilteredSearchPage(driver);
        filteredSearchPage.addToCart();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.navigate().back();

        filteredSearchPage.addToCart2();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
