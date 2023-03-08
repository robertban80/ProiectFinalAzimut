package com.intend.tests;

import com.intend.pages.HomepageSearchPage;
import com.intend.pages.SearchResultsPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;

import java.util.concurrent.TimeUnit;

import static com.intend.pages.HomepageSearchPage.HOME_URL;

public class HomepageSearchTests extends BaseTest{
    @Parameters({"searchtext"}) // parametrul este definit in AllTests.xml!!!
    @Test
    public void SeachBoxInput(String searchedText){
        //driver = new ChromeDriver();
        //driver = new EdgeDriver();
        driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(HOME_URL);
        driver.manage().window().maximize();
        HomepageSearchPage homepageserach = new HomepageSearchPage(driver);
        homepageserach.enterSearchedText(searchedText);
        homepageserach.clickSearch();
        SearchResultsPage searchresultspage = new SearchResultsPage(driver);
        //searchresultspage.returnCurrentUrl();

        Assert.assertTrue(searchresultspage.checkSearchResult());
    }
}
