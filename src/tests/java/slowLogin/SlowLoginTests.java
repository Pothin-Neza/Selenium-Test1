package slowLogin;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SlowLoginTests extends BaseTests {
    @Test

    public void slowTest(){
        var slowLogin = homePage.clickSlowLogin();
        slowLogin.enterSlowUsername("Pothinn");
        slowLogin.enterSlowPassword("12345");
        slowLogin.clickSlowSubmit();

        assertEquals(slowLogin.getSlowInvalidMessage(), "Invalid credentials", "wrong message");

    }
}
