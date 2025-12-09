package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogBoxPage {
    private WebDriver driver;
    private By launchAlert = By.id("my-alert");

    public DialogBoxPage(WebDriver driver){
        this.driver = driver;
    }
//    trigger Alert function

    public void triggerAlert(){
        driver.findElement(launchAlert).click();
    }

    public String getAlertText() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();
    }

    public void alert_clickOk(){
         driver.switchTo().alert().accept();
    }
}
