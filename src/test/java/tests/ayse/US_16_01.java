package tests.ayse;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_16_01 extends TestBaseRapor {
//AC: Sınırsız kayıtlı kullanıcı olarak randevularım sayfasına ulaşabildiğimi ve
// randevuları görüntüleyebildiğimi doğrulayabilmeliyim

    HomePage homePage=new HomePage();


    @Test
    public void TC01(){
        //TC01:Kullanici, gecerli admin bilgileriyle admin paneline erisip,
        // menüden kullanıcılar menüsünü goruntuleyebileli, erisebilmeli oldugunu dogrulamalidir.

        SoftAssert softAssert = new SoftAssert();
        extentTest=extentReports.createTest("Users menüsü erisilebilirlik testi","Kullanici, gecerli admin bilgileriyle admin paneline erisip, menüden kullanıcılar menüsünü goruntuleyebileli, erisebilmeli oldugunu dogrulamalidir. ");

        //01- Browser acilir ve ziyaretci https://qa.smartcardlink.com/ anasayfasina gider.
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        ReusableMethods.wait(2);

        //02-Sign In butonuna tiklanir.
        homePage.signInButton.click();

        //03-Login sayfasında kullanici emaili olarak gecerli email girilir.
        homePage.emailtextBox.sendKeys(ConfigReader.getProperty("scAdminEmail"));

        //04-Login sayfasında kullanici password olarak gecerli password girilir.
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("scAdminPassword"));

        //05-Login butonuna basarak basarili bir sekilde login olamadıgı dogrulanir.
        homePage.loginButonu.click();
        extentTest.info("Gecerli admin bilgileriyle giris yapilir.");

        //06-Menü listesinde User menüsünün gorunur, erisilebilir oldugu dogrulanır.
        softAssert.assertTrue(homePage.usersElementi.isDisplayed());
        softAssert.assertTrue(homePage.usersElementi.isEnabled());
        extentTest.pass("Users menüsü gorunur ve erisilebilirdir.");

        softAssert.assertAll();
    }



}
