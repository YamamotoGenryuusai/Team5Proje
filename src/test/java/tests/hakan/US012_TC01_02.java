package tests.hakan;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US012_TC01_02 extends TestBaseRapor {

    //TC01: Gecerli kullanici bilgileri ile giris yapıp,kullanici paneline erisilmeli, settings butonuna tiklanmali ve kimlik bilgileri bolumu goruntulenmelidir

    @Test
    public void TC01() {

        extentTest=extentReports.createTest("Settings butonuna tiklayip kimlik bilgileri bolumunu dogrulama testi");
        HomePage homePage = new HomePage();

        extentTest.info("Browser acilir ve https://qa.smartcardlink.com/ anasayfasina gider.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        extentTest.info("Sign In butonuna tiklanir.");
        homePage.signInButtonHT.click();

        extentTest.info("Login sayfasinda email kutucuguna kullanici emaili girilir.");
        homePage.emailtextBoxHT.sendKeys(ConfigReader.getProperty("scUserEmailHT"));

        extentTest.info("Login sayfasinda password kutucuguna kullanici password girilir.");
        homePage.passwordTextBoxHT.sendKeys(ConfigReader.getProperty("scUserPasswordHT"));

        extentTest.info("Login butonuna tiklanir.");
        homePage.loginButonuHT.click();

        extentTest.info("Kullanici paneline erisebildigi dogrulanmalidir.");
        Assert.assertTrue(homePage.dashboardHearderTextHT.isDisplayed());
        extentTest.pass("Kullanici paneline basarili sekilde erisildi.");

        extentTest.info("Menu listesindeki Settings butonuna tiklanir.");
        homePage.settingsButonu.click();
        ReusableMethods.wait(2);

        extentTest.info("Kimlik bilgileri bolumu gorunurlugu dogrulanir.");
        Assert.assertTrue(homePage.credentials.isDisplayed());
        extentTest.pass("Credentials yazisi basariyla dogrulandi.");

        extentTest.info("Tarayici kapatilir.");

    }

    //TC02: Kullanici kimlik bilgilerini (odeme sistemi,para birimi,zaman formati,yapiskan cubugu gizleme,iletisimi ve whatsapp paylasimini etkinlestirme) update edebilmelidir.

    @Test
    public void TC02() {

        extentTest=extentReports.createTest("Kullanici kimlik bilgilerini update etme testi");
        HomePage homePage = new HomePage();

        extentTest.info("Browser acilir ve https://qa.smartcardlink.com/ anasayfasina gider.");
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        extentTest.info("Sign In butonuna tiklanir.");
        homePage.signInButtonHT.click();

        extentTest.info("Login sayfasinda email kutucuguna kullanici emaili girilir.");
        homePage.emailtextBoxHT.sendKeys(ConfigReader.getProperty("scUserEmailHT"));

        extentTest.info("Login sayfasinda password kutucuguna kullanici password girilir.");
        homePage.passwordTextBoxHT.sendKeys(ConfigReader.getProperty("scUserPasswordHT"));

        extentTest.info("Login butonuna tiklanir.");
        homePage.loginButonuHT.click();

        extentTest.info("Menu listesindeki Settings butonuna tiklanir.");
        homePage.settingsButonu.click();
        ReusableMethods.wait(2);

        extentTest.info("Kimlik bilgileri bolumu gorunurlugu dogrulanir.");
        Assert.assertTrue(homePage.credentials.isDisplayed());
        extentTest.pass("Credentials yazisi basariyla dogrulandi.");

        extentTest.info("Stripe butonu aktif edilir.");
        homePage.stripeCheckbox.click();
        ReusableMethods.wait(1);

        extentTest.info("Stripe Key ve Stripe Secret girilir.");
        homePage.stripeKey.sendKeys(ConfigReader.getProperty("stripeKey"));
        homePage.stripeSecret.sendKeys(ConfigReader.getProperty("stripeSecret"));
        ReusableMethods.wait(1);

        extentTest.info("Paypal butonu aktif edilir.");
        homePage.paypalCheckbox.click();
        ReusableMethods.wait(1);

        extentTest.info("Paypal Client Id ve Paypal Secret girilir.");
        homePage.paypalClientId.sendKeys(ConfigReader.getProperty("paypalClientId"));
        homePage.paypalSecret.sendKeys(ConfigReader.getProperty("paypalSecret"));
        ReusableMethods.wait(1);

        extentTest.info("Paypal Modu girilir.");
        homePage.paypalMode.sendKeys(ConfigReader.getProperty("paypalMode"));
        ReusableMethods.wait(1);

        extentTest.info("Para birimi butonuna tiklanir.");
        homePage.currency.click();
        ReusableMethods.wait(1);

        extentTest.info("Para birimi secilir.");
        homePage.currencyTextBox.sendKeys(ConfigReader.getProperty("currency"),Keys.ENTER);
        ReusableMethods.wait(1);

        extentTest.info("Zaman formati 24 saat olarak secilir.");
        homePage.timeFormatButonu.click();
        ReusableMethods.wait(1);

        extentTest.info("İletisim etkinlestirilir.");
        homePage.enableContactCheckBox.click();
        ReusableMethods.wait(1);

        extentTest.info("Yapiskan cubugu gizlenir.");
        homePage.hideStickybarCheckBox.click();
        ReusableMethods.wait(1);

        extentTest.info("Whatsapp paylasimi etkinlestirilir.");
        homePage.whatsappShareCheckBox.click();
        ReusableMethods.wait(1);

        extentTest.info("Save butonuna tiklanir.");
        homePage.saveButonu.click();
        ReusableMethods.wait(1);

        extentTest.info("Update'in basarili oldugu goruntulenir.");
        Assert.assertTrue(homePage.updateSuccessfullyMessage.isDisplayed());
        extentTest.pass("Basarili sekilde update edildi.");

        extentTest.info("Tarayici kapatilir.");

    }
}
