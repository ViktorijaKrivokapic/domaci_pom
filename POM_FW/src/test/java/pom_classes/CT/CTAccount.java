package pom_classes.CT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CTAccount {
    WebDriver driver;

    public CTAccount(WebDriver driver){
        this.driver = driver;
    }

    protected By allertMsg = By.cssSelector(".alert.alert-success>p");

    public void checkAllertMsg(String alertMsg){
        Assert.assertEquals(driver.findElement(allertMsg).getText(),alertMsg);
    }
}