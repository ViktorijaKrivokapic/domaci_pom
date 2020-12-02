package pom_classes.CT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CTCreteAcc {
    WebDriver driver;
    public CTCreteAcc(WebDriver driver){
        this.driver = driver;
    }

    protected By ime = By.cssSelector("#firstname");
    protected By prezime = By.cssSelector("#lastname");
    protected By email = By.cssSelector("#email_address");
    protected By password = By.cssSelector("#password");
    protected By confirmation = By.cssSelector("#confirmation");
    protected By posalji = By.cssSelector("[title='Submit']");

    public void popuni(String imeTX, String prezimeTX, String emailTX, String passwordTX){
        driver.findElement(ime).sendKeys(imeTX);
        driver.findElement(prezime).sendKeys(prezimeTX);
        driver.findElement(email).sendKeys(emailTX);
        driver.findElement(password).sendKeys(passwordTX);
        driver.findElement(confirmation).sendKeys(passwordTX);
    }

    public void posalji(){
        driver.findElement(posalji).click();
    }

    public void createAcc(String imeTX, String prezimeTX, String emailTX, String passwordTX){
        popuni(imeTX,prezimeTX,emailTX,passwordTX);
        posalji();
    }
}