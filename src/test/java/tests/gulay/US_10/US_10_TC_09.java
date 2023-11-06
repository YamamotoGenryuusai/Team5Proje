package tests.gulay.US_10;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_10_TC_09 extends TestBaseRapor {
    SoftAssert softAssert= new SoftAssert();
    @Test
    public void US_10_09 () {

        extentTest=extentReports.createTest("mesaj silme testi ");

        Driver.getDriver().get(ConfigReader.getProperty("scLoginUrl_gg"));
        extentTest.info("Browser acilir, Adres çubuğuna log in URL girilir, Enter tusuna tiklanir. Log in gidilir");
        UserDashboard userDashboard = new UserDashboard();
        HomePage homePage= new HomePage();

        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("gecerliEMail_gg"));
        extentTest.info("Email alanına geçerli email girilir");

        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("gecerliSifre_gg"));
        extentTest.info("Password alanına gecerli password girilir");

        homePage.loginButonu.click();
        extentTest.info("Log in butonuna tiklanir");
        homePage.adminEnquiriesText_gg.click();
        extentTest.info("Enquiries butonuna tıklanır");

        homePage.enquiriesSayfasiDeleteIkonu_gg.click();
        extentTest.info("Enquries sayfasında delete ikonuna tıklanır");

        ReusableMethods.wait(1);
        homePage.deletePenceresiYesDeleteButonu.click();
        extentTest.info("Yes Delete Butonuna tiklar");

        softAssert.assertTrue(homePage.deletePenceresiDeletedMesaji.isDisplayed());
        extentTest.info("Mesajın silindigini dogrulandi");

    }


}
