package com.intend.tests;

import com.intend.pages.ModifyCartPage;
import com.intend.pages.OrderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.intend.pages.BasePage.BASE_URL;

public class ModifyCartTests extends BaseTest{
    @Test
    public void modifyItemInCart(){
        //OrderPage orderPage = new OrderPage(driver);
        ModifyCartPage modifyCartPage = new ModifyCartPage(driver);

        modifyCartPage.clickOnCartTrashBin();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().refresh();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertTrue(modifyCartPage.returnCartStatus().contains("produse in cos (1)"));
    }
}
