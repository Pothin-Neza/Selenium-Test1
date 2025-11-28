package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownMenu {
    private WebDriver driver;
    private By leftButton = By.id("my-dropdown-1");
    private By option = By.xpath("/html/body/main/div/div[4]/div[1]/div/ul/li[1]/a");

    public DropdownMenu(WebDriver driver){
        this.driver = driver;
    }

    public void leftClick(){
        driver.findElement(leftButton).click();
    }

    public void clickOption(){
        driver.findElement(option).click();
    }
}
