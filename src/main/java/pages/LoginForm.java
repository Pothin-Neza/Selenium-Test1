package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginForm {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By submitButton = By.xpath("/html/body/main/div/div[4]/div/form/button");
    private By invalidMessage = By.id("invalid");
    public LoginForm(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername (String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }

    public String getInvalidMessage(){
        return driver.findElement(invalidMessage).getText();
    }
}
