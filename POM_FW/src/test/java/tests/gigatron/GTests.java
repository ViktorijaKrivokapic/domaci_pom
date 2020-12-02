package tests.gigatron;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom_classes.GoogleResultPage;
import pom_classes.GoogleSearchPage;
import pom_classes.gigatron.GComparePage;
import pom_classes.gigatron.GHomePage;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;
import selenium_core.DriverType;

import java.util.concurrent.TimeUnit;

public class GTests {
    WebDriver driver;
    String URL = "https://gigatron.rs/";
    DriverManager driverManager;
    GHomePage ghp;
    GComparePage gcp;

    @BeforeMethod
    public void setup(){
        driverManager = DriverManagerFactory.getDriverManager("CHROME");
        driver = driverManager.getWebDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void compareItems() throws InterruptedException {
        ghp = new GHomePage(driver);
        gcp = new GComparePage(driver);

        ghp.setAcceptCookies();
        ghp.navigateToSmartphones();
        ghp.setCategoryMobilePhones();

        //navigate to mobile devices (on home page)

        //check selectors for compare items
        //ghp.compareItems("3","4");
        //ghp.navigateToComaparePage();
       // gcp.showCompareTable();
       // gcp.compare();
    }
/*
    @AfterMethod public void tearDown(){=
        driverManager.quitDriver();
    }*/
}