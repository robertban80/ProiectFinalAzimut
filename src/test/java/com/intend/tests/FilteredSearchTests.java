package com.intend.tests;

import com.intend.pages.FilteredSearchPage;
import com.intend.pages.OrderPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.intend.pages.SearchResultsPage;
import com.intend.pages.FilteredSearchPage;

import static com.intend.pages.HomepageSearchPage.HOME_URL;

public class FilteredSearchTests extends BaseTest {
    @Test
    public void filterSearchResults() {
        FilteredSearchPage filteredSearchPage = new FilteredSearchPage(driver);
        filteredSearchPage.checkStocMagazinCheckBox();
        filteredSearchPage.returnCurrentUrl();
        Assert.assertTrue(filteredSearchPage.returnCurrentUrl().contains("stoc-pret"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        filteredSearchPage.pickCategorieProcesoare();
        Assert.assertTrue(filteredSearchPage.returnCurrentUrl().contains("idc=2"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        filteredSearchPage.addToCart();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        driver.navigate().refresh();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //filteredSearchPage.pressContinueShoppingButton();

//        OrderPage orderPage = new OrderPage(driver);
//        orderPage.emptyCartTrashBin();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        if (orderPage.emptyCartText().contains("Nu sunt produse in cos.")) System.out.println("E gol!");
//

    }


}
