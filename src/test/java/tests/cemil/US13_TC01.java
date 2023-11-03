package tests.cemil;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US13_TC01 extends TestBaseRapor {

    //After logging in as a registered user, I should be able to confirm that it can display
    // and change profile information in the account settings.


    @Test
    public void test01() {


        HomePage homePage = new HomePage();
        extentTest = extentReports.createTest("Profile information visibility test.",
                "As a registered user, Profile information in account settings should be visible.");

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
        extentTest.info("Visibility profile information");
        homePage.changeProfilButtonCO.isDisplayed();

        extentTest.info("Visibility testing of profile information");
        Assert.assertTrue(homePage.changeProfilButtonCO.isDisplayed(),"Profile information could not be displayed!");


        extentTest.pass("Profile information visibility test successful");
        ReusableMethods.wait(5);

        extentTest.info("Browser closed");
    }
}