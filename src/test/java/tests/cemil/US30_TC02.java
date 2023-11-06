package tests.cemil;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US30_TC02 extends TestBaseRapor {

    //After logging in with admin scholarship, I should be able to confirm that
    // I can view the number of countries, states and cities used in the
    // transactions on the site and add new country, state and city.

    @Test
    public void test01(){
        HomePage homePage=new HomePage();

        extentTest = extentReports.createTest("Display test",
                "Admin must be able to Number of countries, states and cities display test.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        extentTest.info("The browser opens and the user goes to the home page.");
        JSUtilities.scrollToElement(Driver.getDriver(),homePage.signInButtonHC);
        ReusableMethods.wait(2);

        extentTest.info("Click the Signin button.");
        homePage.signInButtonHC.click();

        extentTest.info("Valid admin email is entered in the email box.");
        homePage.emailTextBoxHC.click();
        homePage.emailTextBoxHC.sendKeys(ConfigReader.getProperty("scAdminEmail"));


        extentTest.info("Valid admin password is entered in the password box.");
        homePage.passwordTextBoxHC.click();
        homePage.passwordTextBoxHC.sendKeys(ConfigReader.getProperty("scAdminPassword"));

        extentTest.info("Click on the Login button");
        homePage.loginButtonHC.click();

        extentTest.info("Click on the Countries button.");
        homePage.countriesButtonCO.click();

        extentTest.info("Country numbers are displayed.");
        homePage.countriesCountCO.isDisplayed();

        extentTest.info("Click on the States.");
        homePage.stateButtonCO.click();

        extentTest.info("State numbers are displayed.");
        homePage.stateCountCO.isDisplayed();

        extentTest.info("Click on the City.");
        homePage.cityButtonCO.click();

        extentTest.info("City numbers are displayed.");
        homePage.stateCountCO.isDisplayed();

        extentTest.pass("Number of countries, states and cities display test passed.");

        ReusableMethods.wait(3);
        extentTest.info("Browser is closed.");


    }
}
