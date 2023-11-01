package tests.taha;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_017_03 extends TestBaseRapor {

    @Test
    public void test_01(){

        HomePage homePage = new HomePage();

        extentTest= extentReports.createTest("sınırsız kullanıcı send ınvıte buton testi","send intive butonu görünür ve aktif olmalıdır.");
        extentTest.info("Browser acılır Urle gidilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        homePage.signInButton.click();
        extentTest.info("Sınırsız kullanıcı hesabı ile giriş yapılır.");
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scGecerliEmailtaha"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scGecerliPasswordtaha"));
        homePage.loginButonu.click();
        Assert.assertTrue(homePage.Dashboardtext.isDisplayed());
        extentTest.pass("giriş aktif.");
        extentTest.info("browser kapatılır.");




    }















    @Test
    public void TC_03(){
        HomePage homePage = new HomePage();

        extentTest= extentReports.createTest("sınırsız kullanıcı send ınvıte buton testi","send intive butonu görünür ve aktif olmalıdır.");
        extentTest.info("Browser acılır Urle gidilir.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        homePage.signInButton.click();
        extentTest.info("Sınırsız kullanıcı hesabı ile giriş yapılır.");
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scGecerliEmailtaha"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scGecerliPasswordtaha"));
        homePage.loginButonu.click();



        extentTest.info("Affiliations butonuna tıklar");
        homePage.SinirsizKullaniciAffiliationsButton.click();
        extentTest.info("Copy elementine tıklar");
        homePage.CopyButton.click();

        extentTest.info("Send Invite kutusunda email adresi dogru girilir.");
        Assert.assertTrue(homePage.SendInviteButton.isDisplayed());
        extentTest.pass("Send Invite butonu görünür");
        extentTest.info("Send İnvite butonuna click yapar.");
        homePage.SendInviteButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.SendEmailText.isDisplayed());
        ReusableMethods.wait(2);
extentTest.pass("Send Email butonu aktif");
extentTest.info("browser kapatılır.");










    }
}
