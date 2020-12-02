package tests.CTTests;

import allure.AllureListener;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pom_classes.CT.CTAccount;
import pom_classes.CT.CTCreteAcc;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;
import selenium_core.DriverType;

import java.util.Random;
import java.util.concurrent.TimeUnit;
@Listeners({allure.AllureListener.class})
public class CTCreateAccTests {
    WebDriver driver;
    String URL = "https://www.ctshop.rs/customer/account/create";
    DriverManager driverManager;
    CTCreteAcc CTC;
    CTAccount CTA;

    @BeforeMethod
    @Parameters({"Type"})
    public void setup(String Type){
        driverManager = DriverManagerFactory.getDriverManager(Type);
        driver = driverManager.getWebDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AllureListener.driver = driver;
    }
    @Test
    @Parameters({"ime", "prezime","password","allMsg"})
    @Description("Neki opis ide ovde")
    @Epic("EP001")
    @Feature("FE001")
    @Story("ST001")
    @Step("Create account")
    @Severity(SeverityLevel.BLOCKER)

    public void createAccountTest(String ime,String prezime, String password,String allMsg){
        CTC = new CTCreteAcc(driver);
        Random r = new Random();
        int randomBr = r.nextInt(3);
        //String email = "mail"+randomBr+"@gmail.com";
        String[] chars = {"A","B","C","D"};
        String[] Specialchars = {"!","#","%","$"};
        String email = "mail"+randomBr+chars[randomBr]+"@gmail.com";
        System.out.println(email);
        CTC.createAcc(ime,prezime,email,password);
        CTA = new CTAccount(driver);
        CTA.checkAllertMsg(allMsg);
    }

    @AfterMethod
    public void tearDown(){
        driverManager.quitDriver();
    }
}
