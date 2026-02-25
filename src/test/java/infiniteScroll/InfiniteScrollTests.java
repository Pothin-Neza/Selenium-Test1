package infiniteScroll;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.Base64;

public class InfiniteScrollTests extends BaseTests {
    @Test

//    InfiniteScrollTest function
    public void scrollInfinite(){
        var infiniteScrollPage = homePage.clickInfiniteScroll();

        infiniteScrollPage.scrollToParagraph(17);
    }
}
