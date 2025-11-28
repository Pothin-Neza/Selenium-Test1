package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DialogBoxPage {
    private WebDriver driver;
    private By launchAlert = By.id("my-alert");

    public DialogBoxPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(launchAlert).click();
    }
    public void alert_clickOk(){
         driver.switchTo().alert().accept();
    }
}
