package com.intend.tests;

import com.intend.pages.FilteredSearchPage;
import com.intend.pages.OrderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.intend.pages.BasePage.BASE_URL;

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
        OrderPage orderPage = new OrderPage(driver);
        Assert.assertFalse(orderPage.shoppingCartText().contains("Nu sunt produse in cos."));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        orderPage.pressContinueShoppingButton();
        //driver.navigate().back();

        filteredSearchPage.addToCart2();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //ne intoafrcem in cosul de cumparaturi
        driver.navigate().to(BASE_URL + "comanda");
        Assert.assertTrue(orderPage.returnCartStatus().contains("produse in cos (2)"));

    }
}
