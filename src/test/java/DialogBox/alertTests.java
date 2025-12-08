package DialogBox;

import base.BaseTests;
import org.testng.annotations.Test;

public class alertTests extends BaseTests {
    @Test

// alertTest function
    public void alertTest(){
        var alert = homePage.clickDialogBox();
        alert.triggerAlert();
        alert.alert_clickOk();
    }
}
