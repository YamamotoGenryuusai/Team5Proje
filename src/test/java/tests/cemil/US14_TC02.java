package tests.cemil;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US14_TC02 extends TestBaseRapor {

     // After logging in as a registered user, I should be able to confirm that    
     // I can make a change of password                                            
  
    @Test
    public void test01() {     

        HomePage homePage = new HomePage();
        extentTest = extentReports.createTest("Change of password  test.",
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
        ReusableMethods.wait(3);

        extentTest.info("Click on the Change Password button");
        homePage.changePasswordCO.click();
           ReusableMethods.wait(3);

        extentTest.info("Click on the Current Password box");
        homePage.currentPasswordCO.sendKeys(ConfigReader.getProperty("scGecerliPasswordCO")+ Keys.TAB);
                   ReusableMethods.wait(3);

        extentTest.info("New password is written");
        homePage.newPasswordCO.sendKeys(ConfigReader.getProperty("scnewPasswordCO")+Keys.TAB);

        extentTest.info("New password is confirmed");
        homePage.confirmPasswordCO.sendKeys(ConfigReader.getProperty("scconfirmPassword")+Keys.TAB);

        extentTest.info("Click on the save button, password changing");
        homePage.savePasswordChangeButtonCO.click();

        extentTest.pass("Verification test successful");

        extentTest.info("Browser closed");

    }   


}
