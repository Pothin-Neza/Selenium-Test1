package DialogBox;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class alertTests extends BaseTests {
    @Test

// alertTest function
    public void alertTest(){
        var alert = homePage.clickDialogBox();
        alert.triggerAlert();
        String alertMessage = alert.getAlertText();
        alert.alert_clickOk();
        assertEquals(alertMessage, "Hello world!", "wrong alert message");
    }
}
