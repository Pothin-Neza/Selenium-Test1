package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test

//    Login test function
    public void loginTest(){
        var login = homePage.clickLoginFormButton();
        login.setUsername("Pothinn");
        login.setPassword("12345");
        login.clickSubmit();

        assertTrue(login.getInvalidMessage().contains("Invalid"), "wrong message");
    }
}
