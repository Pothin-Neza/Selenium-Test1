package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public DropdownMenu clickDropdownButton(){
        clickButton("/html/body/main/div/div[4]/div[1]/div/div/a[3]");
        return new DropdownMenu(driver);
    }

    public LoginForm clickLoginFormButton(){
        clickButton("/html/body/main/div/div[5]/div[1]/div/div/a[1]");
        return new LoginForm(driver);
    }
    public MouseOver clickMouseOver(){
        clickButton("/html/body/main/div/div[4]/div[1]/div/div/a[4]");
        return new MouseOver (driver);
    }

    public DialogBoxPage clickDialogBox (){
        clickButton("/html/body/main/div/div[4]/div[2]/div/div/a[7]");
        return new DialogBoxPage(driver);
    }
    public SlowLoginPage clickSlowLogin(){
        clickButton("/html/body/main/div/div[5]/div[1]/div/div/a[2]");
        return new SlowLoginPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickButton("/html/body/main/div/div[4]/div[2]/div/div/a[2]");
        return new InfiniteScrollPage(driver);
    }
    public void clickButton (String path){
        driver.findElement(By.xpath(path)).click();
    }
}
