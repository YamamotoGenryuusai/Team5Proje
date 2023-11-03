package tests.gulay.US_32;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AdminDashboard;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_32_TC_01 extends TestBaseRapor {
    SoftAssert softAssert= new SoftAssert();
    UserDashboard userDashboard = new UserDashboard();
    HomePage homePage= new HomePage();
    AdminDashboard adminDashboard= new AdminDashboard();
    @Test
    public void US_32_TC_01 (){
        extentTest=extentReports.createTest("Super Admin Basarili log in testi");

         extentTest.info("Browser acilir, Adres çubuğuna log in URL girilir, Enter tusuna tiklanir. Log in gidilir");

        Driver.getDriver().get(ConfigReader.getProperty("scLoginUrl_gg"));

         homePage.emailtextBox.sendKeys(ConfigReader.getProperty("adminGecerliEMailgg"));
        extentTest.info(" Email alanına geçerli admin email girilir");

        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminGecerliSifregg"));
        extentTest.info("Password alanına gecerli admin password girilir");

        homePage.loginButonu.click();
        extentTest.info(" Log in butonuna tiklanir");
        softAssert.assertTrue(adminDashboard.sAdminDashboardText.isDisplayed());

        extentTest.pass("Giriş yapildigini dogrulandi");

    }
}
