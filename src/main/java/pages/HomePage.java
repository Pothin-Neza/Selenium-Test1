package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public DropdownMenu clickDropdownButton(){
        clickButton("Dropdown menu");
        return new DropdownMenu(driver);
    }

    public LoginForm clickLoginFormButton(){
        clickButton("Login form");
        return new LoginForm(driver);
    }
    public MouseOver clickMouseOver(){
        clickButton("Mouse over");
        return new MouseOver (driver);
    }

    public DialogBoxPage clickDialogBox (){
        clickButton("Dialog boxes");
        return new DialogBoxPage(driver);
    }
    public SlowLoginPage clickSlowLogin(){
        clickButton("Slow login");
        return new SlowLoginPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickButton("Infinite scroll");
        return new InfiniteScrollPage(driver);
    }
    public void clickButton (String text){
        driver.findElement(By.linkText(text)).click();
    }
}
