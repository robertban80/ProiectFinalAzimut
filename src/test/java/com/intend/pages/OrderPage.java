package com.intend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage {
    public OrderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "products-cart-list")
    private WebElement shoppingCart;
    @FindBy(xpath = "//*[@id=\"products-cart-list\"]/ul/li[2]/div/section/table/tbody/tr/td[4]")
    private WebElement trashBin;
    @FindBy(xpath = "//*[@id=\"utility-check\"]/a")
    private WebElement continueShoppingButton;
    @FindBy(css = "#yt_header > div.yt-header-content > div > div > div.header-content-right.col-lg-9.col-md-9.col-lg-offset-3.col-md-offset-3.cart-right-section > div.header-cart > div > div.block.mini-cartpro.sm-cartpro > div > span")
    private WebElement productsInCart;

    public String shoppingCartText() {
        return (shoppingCart.getText());
    }

    public void clickOnCartTrashBin() {
        trashBin.click();
    }

    public void pressContinueShoppingButton() {
        continueShoppingButton.click();
    }

    public String returnCartStatus(){
        return productsInCart.getText();
    }


}
