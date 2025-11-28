package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SlowLoginPage {
    private WebDriver driver;
    private By slowUsernameField = By.id("username");
    private By slowPasswordField = By.id("password");
    private By slowButton = By.xpath("//*[@id=\"form\"]/button");
    private By slowInvalidMessage = By.id("invalid");

    public SlowLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterSlowUsername(String username){
        driver.findElement(slowUsernameField).sendKeys(username);
    }

    public void enterSlowPassword(String password){
        driver.findElement(slowPasswordField).sendKeys(password);
    }
    public void clickSlowSubmit(){
        driver.findElement(slowButton).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(slowInvalidMessage));
    }

    public String getSlowInvalidMessage(){
        return driver.findElement(slowInvalidMessage).getText();
    }

}
