package tests.gulay.US_10;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_10_TC_08 extends TestBaseRapor {

    @Test
    public void US_10_TC_08 (){

        extentTest=extentReports.createTest("delete penceresi gorunurluk testi");

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

        homePage.eDDeletePencereesiDeleteText.isDisplayed();
        extentTest.pass("Delete penceresine ulasildigi dogrulandi");

    }
}


