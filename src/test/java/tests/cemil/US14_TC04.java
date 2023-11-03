package tests.cemil;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US14_TC04 extends TestBaseRapor {

    // After logging in as a registered user, I should be able to confirm that
    //  I can make a user output.

    @Test
    public void test01() {

        HomePage homePage = new HomePage();
        extentTest = extentReports.createTest("User sign out test.",
                "The registered user must verify that the user has logged out.");

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

        extentTest.info("User logs out");
        homePage.signOutButtonCO.click();

        extentTest.info("Confirms that the user is logged out");
        String expectedUrl="https://qa.smartcardlink.com/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl,"User output failed");
        extentTest.pass("User Sign Out verification test successful");

        extentTest.info("Browser closed");




    }
}
