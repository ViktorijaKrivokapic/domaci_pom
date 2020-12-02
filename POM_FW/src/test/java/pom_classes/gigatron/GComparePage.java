package pom_classes.gigatron;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GComparePage {
    WebDriver driver;
    public GComparePage(WebDriver driver){
        this.driver = driver;
    }

    protected By compareButton = By.cssSelector(".compare-group-items-footer.clear>a");
    protected By dijagonalaEkrana1 = By.cssSelector(".compare-table>tbody>tr:nth-child(1)>td:nth-child(1)>span:last-child");
    protected By dijagonalaEkrana2 = By.cssSelector(".compare-table>tbody>tr:nth-child(1)>td:nth-child(2)>span:last-child");

    public void showCompareTable(){
        driver.findElement(compareButton).click();
    }

    public void compare(){
        String d1 = driver.findElement(dijagonalaEkrana1).getText();
        String d2 = driver.findElement(dijagonalaEkrana2).getText();
        if(!d1.equals(d2)){
            System.out.println("Razlika u dijagonali ekrana, D1: "+d1+" D2: "+d2);
        }
    }

}