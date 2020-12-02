package pom_classes.gigatron;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GHomePage {
    WebDriver driver;
    public GHomePage(WebDriver driver){
        this.driver = driver;
    }

    protected By compareIcon = By.cssSelector(".cw-sticky-button>.icon-link");
    protected By acceptCookies = By.cssSelector(".btn.primary");

    //dodati elemente za navigaciju do mobilnih

    protected By dugmeProizvodi = By.cssSelector(".megabtn");
    protected By dugmeMobilniTelefoni = By.linkText("Mobilni telefoni i oprema");
    protected By opcijaMobilniTelefoni = By.linkText("Mobilni telefoni");
    protected By dugmePrihvatiKolacice = By.cssSelector(".form-buttons>button");

    // elementi za izbor poredjenja telefona
    protected By prviTelefon = By.cssSelector(".product-items-main>div.product-item-css:nth-child(1)>div>div>div>div>span");
    protected By drugiTelefon = By.cssSelector(".product-items-main>div.product-item-css:nth-child(2)>div>div>div>div>span");
    protected By linkUporedi = By.cssSelector("Uporedi");

    public void compareItems(String ... item) throws InterruptedException {
        driver.findElement(acceptCookies).click();
        for(int i=0;i<item.length;i++){
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(".recommendeds.clearfix .grid-list-five>div:nth-child("+item[i]+")>div>div>div>span")).click();
        }
    }

    public void navigateToSmartphones() throws InterruptedException{
        driver.findElement(dugmeProizvodi).click();
        Thread.sleep(5000);
        driver.findElement(dugmeMobilniTelefoni).click();
        Thread.sleep(3000);
    }

    public void setAcceptCookies() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(dugmePrihvatiKolacice).click();
    }

    public void setCategoryMobilePhones() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(opcijaMobilniTelefoni).click();
    }

/*
    Actions action = new Actions(driver);
    WebElement we = driver.findElement(By.xpath("//html/body/div[13]/ul/li[4]/a"));
        action.moveToElement(we).build().perform();
*/
    public void chooseSmartphonesToCompare() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(prviTelefon).click();
        driver.findElement(drugiTelefon).click();

    }
    //metod koji izvrsava pretragu telefona

    public void navigateToComaparePage(){
        driver.findElement(compareIcon).click();
    }


}
