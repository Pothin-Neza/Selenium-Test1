package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private By infinite = By.cssSelector("#content p");
    private WebDriver driver;

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";

        var jsExecutor = (JavascriptExecutor)driver;

        while(getNbrOfParagraphs() < index){
            jsExecutor.executeScript(script);
        }

    }

    public int getNbrOfParagraphs(){
        return driver.findElements(infinite).size();
    }
}
