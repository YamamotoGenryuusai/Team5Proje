package tests.gulay.US_10;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_10_TC_02 extends TestBaseRapor {

@Test

    public void US10_TC_02 (){
extentTest=extentReports.createTest("Enquiries sayfasinı goruntuleme testi");

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

    homePage.enquiriesSayfasiEnquiriesText.isDisplayed();
    extentTest.pass("Enquries sayfasına gidildiği doğrulandi");








}

}
