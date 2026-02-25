package login;

import base.BaseTests;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    private static ExtentReports extent = new ExtentReports();
    private static ExtentSparkReporter reporter = new ExtentSparkReporter("extentReport.html");

    @Test

//    Login test function
    public void loginTest(){
        var login = homePage.clickLoginFormButton();
        login.setUsername("Pothinn");
        login.setPassword("12345");
        login.clickSubmit();

        assertTrue(login.getInvalidMessage().contains("Invalid"), "wrong message");

//        Attaching the reporter to the extent report
        extent.attachReporter(reporter);

//        Added failed test info
        extent.createTest("Login Test").fail("Login test failed due to invalid credentials");
        extent.flush();
    }
}
