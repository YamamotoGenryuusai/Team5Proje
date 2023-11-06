package tests.cemil;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US30_TC03 extends TestBaseRapor {
     //After logging in with admin scholarship, I should be able to confirm that
     // I can view the number of countries, states and cities used in the
     // transactions on the site and add new country, state and city.


    @Test
    public void test01(){

        extentTest = extentReports.createTest("Add New Country Test", "Admin adds a new country.");
        HomePage homePage=new HomePage();

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

        extentTest.info("Click on the New Country button.");
        homePage.newcountryButtonCO.click();

        extentTest.info("New Country name is entered.");
        homePage.addCountryButtonCO.sendKeys(ConfigReader.getProperty("newCountryNameCO"));

        extentTest.info("Click on the Short Code button.");
        homePage.addShortCodeCO.click();

        extentTest.info("New short code name is entered.");
        homePage.addShortCodeCO.sendKeys(ConfigReader.getProperty("newShortCodeCO"));

        extentTest.info("New phone code clicked.");
        homePage.addPhoneCodeCO.click();

        extentTest.info("New phone code number is entered.");
        homePage.addPhoneCodeCO.sendKeys((ConfigReader.getProperty("newPhoneCodeCO")));

        extentTest.info("Click on the Countries button.");
        homePage.addSaveCountryButtonCO.click();

        extentTest.pass("New country add test passed.");

        extentTest.info("Browser is closed.");

    }
}

