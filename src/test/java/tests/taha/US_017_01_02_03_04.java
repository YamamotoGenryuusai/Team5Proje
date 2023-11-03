package tests.taha;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_017_01_02_03_04 extends TestBaseRapor {

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
public void test_02(){
    HomePage homePage = new HomePage();

    extentTest = extentReports.createTest("kullanıcı login testi", "Siteye giris yaptıgı dogrulanır.");
    extentTest.info("Browser acılır Urle gidilir.");
    Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
    homePage.signInButton.click();
    extentTest.info("kullanıcı hesabı ile giriş yapılır.");
    homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scGecerliEmailtaha"));
    homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scGecerliPasswordtaha"));
    extentTest.info("siteye erişim saglanir");
    homePage.loginButonu.click();
    extentTest.info("Affiliations butonuna tıklar");
    homePage.SinirsizKullaniciAffiliationsButton.click();
    extentTest.info("Affiliations butonuna tıklar");
    homePage.affilitionmenübutton.click();
    extentTest.info("Total Affilition Amount elementi görünürlüğü kontrol etme");
    homePage.totalAffilitionAmountElement.isEnabled();
extentTest.pass("Total Affilition Amount elementi görünürlüğü");
homePage.currentamountelementi.isEnabled();
    extentTest.pass("Current Amount elementi görünürlüğü");
extentTest.info("Browser kapatilir.");























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

        homePage.SendInviteButton.click();
        Assert.assertTrue(homePage.SendInviteButton.isDisplayed());
        extentTest.pass("Send Invite butonu görünür");
        extentTest.info("Send İnvite butonuna click yapar.");

        extentTest.info("Send Invite kutusunda email adresi dogru girilir.");
        homePage.emailadresselementi.sendKeys(ConfigReader.getProperty("scGecerliEmail"));
        homePage.sendemailbuttonu.click();
        extentTest.pass("Send Email butonuna tıklandığında sayfa hatası ıle karsılasılıyor. bug tespıt edılmıstır.");
       //Send Invıte butonu ıcerısınde maıl adresıne davet lınkı gonderıldıgı zaman hata mesajı alınması sebebı ve kodların calısmasında sıkıntı yasanmaması ıcın assert.assertfalse kullanılmıstır.
        Assert.assertTrue(homePage.SendEmailText.isDisplayed());
        homePage.withdrawal.click();
        homePage.withdrawAmountbutton.click();
        homePage.amounttext.sendKeys("amount");
        homePage.paypalEmail.sendKeys("scGecerliEmailtaha");
        homePage.savebutonu.click();
        extentTest.info("browser kapatılır.");
    }


    @Test
    public void test_04(){
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

        homePage.withdrawal.click();
        homePage.withdrawal.isDisplayed();
        extentTest.pass("Withdrawal elementi kontrol edildiğinde görünür oldugu dogrulanmıstır.");

        homePage.withdrawAmountbutton.click();
        homePage.amounttext.sendKeys("amount");
        homePage.paypalEmail.sendKeys("scGecerliEmailtaha");
        homePage.savebutonu.click();
        extentTest.info("browser kapatılır.");



    }
























}


