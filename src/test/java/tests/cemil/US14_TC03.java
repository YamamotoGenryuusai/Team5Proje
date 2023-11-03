package tests.cemil;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US14_TC03 extends TestBaseRapor {


    // After logging in as a registered user, I should be able to confirm that
    // I can make a change of language.

    @Test
    public void test01() {

        HomePage homePage = new HomePage();
        extentTest = extentReports.createTest("Login test.",
                "As a registered user, I should be able to log in.");

        extentTest.info("Browser opens");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        extentTest.info("Click on the login button");
        homePage.signInButton.click();

        extentTest.info("Login with valid email and password");
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scGecerliEmailCO"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scGecerliPasswordCO"));
        homePage.loginButonu.click();
        extentTest.info("Go to the profile section");
        homePage.profilPageCO.click();


        extentTest.pass("Verification test successful");

        extentTest.info("Browser closed");

    }




}
