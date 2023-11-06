package tests.cemil;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US07_TC02 extends TestBaseRapor {

    @Test
    public void test01() {

        //As a registered user, I should be able to reach the
        //dasboard page and that the items on the page are displayable

        HomePage homePage = new HomePage();
        extentTest = extentReports.createTest("Dashboard elements displayed test",
                " User tests that the dashboard elements are visible");

        extentTest.info("Browser opens");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));

        extentTest.info("Click on the login button");
        homePage.signInButton.click();

        extentTest.info("Login with valid email and password");
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scGecerliEmailCO"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scGecerliPasswordCO"));
        homePage.loginButonu.click();

        extentTest.info("Visibility testing of elements on the Dashboard page");
        Assert.assertTrue(homePage.dashboardVcardButonu.isDisplayed(),"Dashboard Vcard Button could not be displayed!");
        Assert.assertTrue(homePage.dashboardPageElement1.isDisplayed(),"Dashboard element1 could not be displayed!");

        extentTest.pass("Dashboard visibility test successful");

        extentTest.info("Browser closed");
    }
}