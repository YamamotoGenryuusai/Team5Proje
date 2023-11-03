package tests.cemil;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US14_TC01 extends TestBaseRapor {

   // After logging in as a registered user, I should be able to confirm that
   // I can make a change of password and language and that I can make a user output.


    @Test
    public void test01() {


        HomePage homePage = new HomePage();
        extentTest = extentReports.createTest("Log in test.",
                "Log in as a registered user.");

        extentTest.info("Browser opens");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        extentTest.info("Click on the login button");
        homePage.signInButton.click();

        extentTest.info("Login with valid email and password");
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scGecerliEmailCO"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scGecerliPasswordCO"));

        extentTest.info("Go to the profile section");
        homePage.loginButonu.click();

        extentTest.pass("Registered user login test passed");

        extentTest.info("Browser closed");
    }



}
