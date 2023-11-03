package tests.hakan;

import com.beust.ah.A;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US023_TC01_02 extends TestBaseRapor {

    //TC01: Gecerli admin bilgileri ile admin paneline erisip, Cash Payments butonuna tiklanmali ve ilgili sayfaya gittigi dogrulanmalidir.

    @Test
    public void TC01() {

        extentTest=extentReports.createTest("Cash Payments sayfasina gittigini dogrulama testi");
        HomePage homePage = new HomePage();

        extentTest.info("Browser acilir ve https://qa.smartcardlink.com/ anasayfasina gider.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        extentTest.info("Sign In butonuna tiklanir.");
        homePage.signInButtonHT.click();

        extentTest.info("Login sayfasinda email kutucuguna admin emaili girilir.");
        homePage.emailtextBoxHT.sendKeys(ConfigReader.getProperty("scAdminEmailHT"));

        extentTest.info("Login sayfasinda password kutucuguna admin password girilir.");
        homePage.passwordTextBoxHT.sendKeys(ConfigReader.getProperty("scAdminPasswordHT"));

        extentTest.info("Login butonuna tiklanir.");
        homePage.loginButonuHT.click();

        extentTest.info("Cash Payments butonuna tiklanir.");
        homePage.cashPaymentsbutonu.click();
        ReusableMethods.wait(2);

        extentTest.info("Cash payments sayfasiba gittigi dogrulanmalidir.");
        Assert.assertTrue(homePage.cashPaymentsHeader.isDisplayed());
        extentTest.pass("Basarili sekilde Cash Payments sayfasina ulasti.");

        extentTest.info("Tarayici kapatilir.");

    }

    //TC02: Admin bilgileri ile giris yapip,manuel odeme ve odeme sayisinin gorunurlugu dogrulanmalidir.

    @Test
    public void TC02(){

        extentTest=extentReports.createTest("Manuel odemeleri ve odeme sayisini dogrulama testi");
        HomePage homePage = new HomePage();

        extentTest.info("Browser acilir ve https://qa.smartcardlink.com/ anasayfasina gider.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        extentTest.info("Sign In butonuna tiklanir.");
        homePage.signInButtonHT.click();

        extentTest.info("Login sayfasinda email kutucuguna admin emaili girilir.");
        homePage.emailtextBoxHT.sendKeys(ConfigReader.getProperty("scAdminEmailHT"));

        extentTest.info("Login sayfasinda password kutucuguna admin password girilir.");
        homePage.passwordTextBoxHT.sendKeys(ConfigReader.getProperty("scAdminPasswordHT"));

        extentTest.info("Login butonuna tiklanir.");
        homePage.loginButonuHT.click();

        extentTest.info("Cash Payments butonuna tiklanir.");
        homePage.cashPaymentsbutonu.click();
        ReusableMethods.wait(1);

        extentTest.info("Sayfada manuel odeme varsa goruntulendigi dogrulanmalidir.");
        Assert.assertTrue(homePage.manuelPayments.isDisplayed());
        extentTest.pass("Sayfada manuel odeme goruntulenmektedir.");
        ReusableMethods.wait(1);

        extentTest.info("2.Sayfaya gidilir.");
        homePage.button2.click();
        extentTest.info("2.Sayfada manuel odeme varsa goruntulendigi dogrulanmalidir.");
        Assert.assertTrue(homePage.manuelPayments.isDisplayed());
        extentTest.pass("2.Sayfada manuel odeme goruntulenmektedir.");
        ReusableMethods.wait(1);

        extentTest.info("9.Sayfaya gidilir.");
        homePage.button9.click();
        extentTest.info("9.Sayfada manuel odeme varsa goruntulendigi dogrulanmalidir.");
        Assert.assertTrue(homePage.manuelPayments.isDisplayed());
        extentTest.pass("9.Sayfada manuel odeme goruntulenmektedir.");
        ReusableMethods.wait(1);

        extentTest.info("22.Sayfaya gidilir.");
        homePage.button22.click();
        extentTest.info("22.Sayfada manuel odeme varsa goruntulendigi dogrulanmalidir.");
        Assert.assertTrue(homePage.manuelPayments.isDisplayed());
        extentTest.pass("22.Sayfada manuel odeme goruntulenmektedir.");
        ReusableMethods.wait(1);

        extentTest.info("Sayfada odeme sayisinin goruntulendigi dogrulanmalidir.");
        Assert.assertTrue(homePage.results.isDisplayed());
        extentTest.pass("Odeme sayisi basariyla goruntulenmektedir.");
        ReusableMethods.wait(1);


        extentTest.info("Tarayici kapatilir.");


    }
}
