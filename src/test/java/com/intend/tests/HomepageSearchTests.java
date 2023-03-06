package com.mediagalaxy.tests;

import com.mediagalaxy.pages.BasePage;
import com.mediagalaxy.pages.HomepageSearchPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.mediagalaxy.pages.BasePage.BASE_URL;
import static com.mediagalaxy.pages.HomepageSearchPage.HOME_URL;

public class HomepageSearchTests extends BaseTest{
    @Parameters({"searchtext"}) // parametrul este definit in AllTests.xml!!!
    @Test
    public void SeachBoxInput(String searchedText){
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        HomepageSearchPage homepageserach = new HomepageSearchPage(driver);
        homepageserach.enterSearchedText(searchedText);


    }
}
