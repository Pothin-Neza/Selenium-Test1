package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {

    @Test

//    Login test function
    public void loginTest(){
        var login = homePage.clickLoginFormButton();
        login.setUsername("Pothinn");
        login.setPassword("12345");
        login.clickSubmit();

        assertEquals(login.getInvalidMessage(), "Invalid credentials", "wrong message");
    }
}
