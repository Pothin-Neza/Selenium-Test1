package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownMenu {
    private WebDriver driver;
    private By leftButton = By.id("my-dropdown-1");

    public DropdownMenu(WebDriver driver){
        this.driver = driver;
    }

    public void leftClick(){
        driver.findElement(leftButton).click();
    }
}
