package tests.cemil;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US13_TC02 extends TestBaseRapor {
//After logging in as a registered user, I should be able to confirm that it can display
    // and change profile information in the account settings.

    @Test
    public void test01() {


        HomePage homePage = new HomePage();
        extentTest = extentReports.createTest("Profile change test.",
                "As a registered user, Profile information should be change in account settings.");

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

        extentTest.info("Click on the edit button to change profile information");
        homePage.changeProfilButtonCO.click();

        extentTest.info("Enter new information");
        String newNameCO = "İbrahim ";
        String newLastNameCO = "Yıldız";
        String newEmailCO = "newmail@gmail.com";
        String newPhoneCO= "1231231233";

        extentTest.info("Changing name, surname, email and phone information");
        homePage.editNameBoxCO.clear();
        homePage.editNameBoxCO.sendKeys(newNameCO);

        homePage.editLastNameBoxCO.clear();
        homePage.editLastNameBoxCO.sendKeys(newLastNameCO);

        homePage.editMailBoxCO.clear();
        homePage.editMailBoxCO.sendKeys(newEmailCO);

        homePage.editPhoneBoxCO.clear();
        homePage.editPhoneBoxCO.sendKeys(newPhoneCO);

        extentTest.info("Save changes");
        homePage.saveButtonCO.isEnabled();
        Assert.assertTrue(homePage.saveButtonCO.isEnabled(),"Profile change test failed");

        extentTest.info("Browser closed");
    }

}